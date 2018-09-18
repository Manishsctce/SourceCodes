package InputOutputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class CreateZipFile {
	public static void main(String[] args) throws Exception {
		File folder = new File("D:\\Manish Agrawal\\#myWork\\CS\\SourceCodes\\CoreJava\\src\\InputOutputStream\\folder");
		ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(folder.getParentFile(), "folder.zip")));
		createZip(zos, folder,"");
		System.out.println("Zip Created successfully");
	}

	public static void createZip(ZipOutputStream zos, File fileToZip, String parrentDirectoryName) throws Exception{
		String zipEntryName = fileToZip.getName();
		if (parrentDirectoryName!=null && !parrentDirectoryName.isEmpty()) {
	        zipEntryName = parrentDirectoryName + "/" + fileToZip.getName();
	    }
		
		for(File f : fileToZip.listFiles()){			
			if(f.isDirectory()){
				createZip(zos, f, zipEntryName);
				continue;
			}else{
				final byte[] buffer = new byte[8192];
				zos.putNextEntry(new ZipEntry(zipEntryName));
				FileInputStream fis = new FileInputStream(f);
				int length;
				while ((length = fis.read(buffer)) > 0) {
					zos.write(buffer, 0, length);
				}
				zos.closeEntry();
				fis.close();
			}
		}
	}
}
