package InputOutputStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOfObjectAsFile {

	public static void main(String[] args) throws IOException {
		File folder = new File("D:\\Manish Agrawal\\#myWork\\CS\\SourceCodes\\CoreJava\\src\\InputOutputStream\\folder");
		ZipOutputStream zos = new ZipOutputStream(new FileOutputStream(new File(folder.getParentFile(), "objAsFile.zip")));

		String file1 = "This is file 1";
		String file2 = "This is file 2";
		
		zos.putNextEntry(new ZipEntry("file1.txt"));
		zos.write(file1.getBytes());
		zos.closeEntry();
		
		zos.putNextEntry(new ZipEntry("file2.txt"));
		zos.write(file2.getBytes());
		zos.closeEntry();
		
	}

}
