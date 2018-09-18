package com.sample.servlets;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.URI;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.http.HttpEntity;
import org.apache.http.HttpHost;
import org.apache.http.HttpRequestInterceptor;
import org.apache.http.HttpResponse;
import org.apache.http.entity.AbstractHttpEntity;
import org.apache.http.impl.DefaultHttpClientConnection;
import org.apache.http.message.BasicHttpEntityEnclosingRequest;
import org.apache.http.params.HttpParams;
import org.apache.http.params.SyncBasicHttpParams;
import org.apache.http.protocol.BasicHttpContext;
import org.apache.http.protocol.ExecutionContext;
import org.apache.http.protocol.HttpContext;
import org.apache.http.protocol.HttpProcessor;
import org.apache.http.protocol.HttpRequestExecutor;
import org.apache.http.protocol.ImmutableHttpProcessor;
import org.apache.http.protocol.RequestConnControl;
import org.apache.http.protocol.RequestContent;
import org.apache.http.protocol.RequestExpectContinue;
import org.apache.http.protocol.RequestTargetHost;
import org.apache.http.protocol.RequestUserAgent;

public class DownloadFilesServlet extends HttpServlet{
	List<String> listString = new ArrayList<String>();
	List<File> listFiles = new ArrayList<File>();
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String hostName=request.getParameter("hostName");
		String nodeName=request.getParameter("nodeName");

		String file1 = "This is file 1 and request param is HostName:"+hostName + "NodeName : "+nodeName;
		String file2 = "This is file 2 and request param is HostName:"+hostName + "NodeName : "+nodeName;

		listString.add(file1); listString.add(file2);
		
		int index=0;
		for(String str : listString){
			File file = new File("D:\\Manish Agrawal\\#myWork\\CS\\SourceCodes\\Servlet_Projects\\ServletProjects\\src\\com\\sample\\servlets", "file"+index);
			FileOutputStream fos = new FileOutputStream(file);
			fos.write(str.getBytes());
			fos.flush();
			fos.close();
			listFiles.add(file);
			index+=1;
		}
		
		
		response.setHeader("Content-Disposition","attachment;filename="+"AllFiles.zip");       
		response.setContentType("application/zip");
		//response.setContentType("application/text");
		//response.setContentLength((int)outputZipFile.length());
		OutputStream outputStream=response.getOutputStream();
		
		//URL targetURL = new URL(request.getProtocol(),request.getRemoteHost(),request.getRemotePort(),null);
		
		try {
			postLogsToHTTPURL(listFiles,"localhost",8080 );
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		outputStream.flush();
		outputStream.close();
	}
	
	void postLogsToHTTPURL(List<File> entityFiles, String hostName, int port) throws Exception{
		HttpParams params = new SyncBasicHttpParams();
		
        final HttpProcessor httpproc = new ImmutableHttpProcessor(new HttpRequestInterceptor[] {
                // Required protocol interceptors
                new RequestContent(),
                new RequestTargetHost(),
                // Recommended protocol interceptors
                new RequestConnControl(),
                new RequestUserAgent(),
                new RequestExpectContinue()});

        final HttpRequestExecutor         httpexecutor = new HttpRequestExecutor();
        final HttpContext                 context = new BasicHttpContext(null);
        final HttpHost                    host = new HttpHost(hostName, port);
        final DefaultHttpClientConnection conn = new DefaultHttpClientConnection();

        context.setAttribute(ExecutionContext.HTTP_CONNECTION, conn);
        context.setAttribute(ExecutionContext.HTTP_TARGET_HOST, host);
        
        HttpEntity requestBody = new FileZipStreamEntity(entityFiles, "http://"+hostName+":"+port);
        Socket socket = new Socket(host.getHostName(), host.getPort());
        conn.bind(socket, params);
		BasicHttpEntityEnclosingRequest request = new BasicHttpEntityEnclosingRequest("POST", //$NON-NLS-1$
				"http://"+hostName+":"+port);
		request.setEntity(requestBody);
		request.setParams(params);
		httpexecutor.preProcess(request, httpproc, context);
		
		HttpResponse response = httpexecutor.execute(request, conn, context);

        response.setParams(params);
        httpexecutor.postProcess(response, httpproc, context);
        conn.close();

        // Check response for 200 OK versus an error
        final int result = response.getStatusLine().getStatusCode();
        System.out.println("REsult: "+result);
	}
	
	private class FileZipStreamEntity extends AbstractHttpEntity {

		private final List<File> entityFiles;
		private final String urlStr;

		private FileZipStreamEntity(final List<File> entityFiles, final String urlStr) {
			super();
			setContentType("application/zip"); //$NON-NLS-1$
			this.entityFiles = entityFiles;
			this.urlStr = urlStr;
		}

		public void writeTo(final OutputStream outputStream) throws IOException {
			try {
				writeFiles(outputStream, this.urlStr);

			} catch (Exception e) {
				throw new IOException(e.getMessage());
			}
		}

		public boolean isRepeatable() {
			return false;
		}

		public boolean isChunked() {
			return false;
		}

		public long getContentLength() {
			return -1;
		}

		public boolean isStreaming() {
			return false;
		}

		public InputStream getContent() throws IOException, IllegalStateException {
			throw new IllegalStateException("getContent not supported"); //$NON-NLS-1$
		}
	}

	private void writeFiles(final OutputStream outputStream,
			final String outputStreamName) throws Exception {

		ZipOutputStream  zos = null;
		final byte[]     buf = new byte[8192];

		try {
			zos = new ZipOutputStream(outputStream);
				final Map<String,Integer> sameLeafMap = new HashMap<String,Integer>();
				for (final File f : listFiles) {

					// Tricky edge case.  It's unlikely but possible for the same host or node FILE
					// configuration to have multiple appenders with the same file leaf name but different
					// parent paths.  That would cause duplicate zip entry errors below, since we want as flat
					// (and easy to read) a zip structure as possible and therefore use only the leaf name
					// under the node or host name.  To avoid the duplicate errors, maintain a map whose keys
					// are leaf names and whose values are counts.  If we see a leaf name value > 0, append
					// that value to the zip entry name.                    
					final String leafName = f.getName();
					Integer sameLeafCount = sameLeafMap.get(leafName);
					if (sameLeafCount == null) {
						sameLeafCount = 0;
					} else {
						sameLeafCount++;
					}
					sameLeafMap.put(leafName, sameLeafCount);

					final String entryName = leafName + (sameLeafCount == 0 ? "" : ("-" + sameLeafCount)); //$NON-NLS-1$ //$NON-NLS-2$
					FileInputStream  fis = null;
					try {
						zos.putNextEntry(new ZipEntry(entryName));
						try {
							fis = new FileInputStream(f);
						} catch (IOException e) {
							// Read failure is not fatal, just write an error into the current
							// zip entry and continue
							zos.write("FILE_ZIP_PROVIDER_COPY_ERROR".getBytes()); 
							zos.closeEntry();
							continue;
						}
						int n = 0;
						// Not as clean as it could be, because read errors are not fatal but
						// write errors are.
						while (true) {
							try {
								n = fis.read(buf, 0, buf.length);
							} catch (IOException e) {
								zos.write("FILE_ZIP_PROVIDER_COPY_ERROR".getBytes());
								break;
							}
							if (n > 0) {
								zos.write(buf, 0, n);

							} else {
								break;
							}
						}
						zos.closeEntry();
						fis.close();

					} catch (IOException e) {
						if (fis != null) {
							try {
								fis.close();

							} catch (IOException ignore) {
							}
						}
						throw new Exception("FILE_ZIP_PROVIDER_COPY_ERROR"); 
					}
				}
			

			zos.close(); // closes outputStream as well

		} catch (Exception e) {
			if (zos != null) {
				try {
					zos.close();

				} catch (IOException ignore) {
				}
			}
			throw new Exception("FILE_ZIP_PROVIDER_WRITE_ERROR");
		}
	}
}
