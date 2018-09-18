package file;
import java.io.File;
import java.io.IOException;

/* Absolute path is the full directory such as C:\XyzWs\test.txt. The definition of absolute pathname is system dependent. On UNIX systems, a pathname is absolute if its prefix is "/". On Win32 systems, a pathname is absolute if its prefix is a drive specifier followed by "\\"
 * 
 */
public class ListFilesDemo1 {

	public static void main(String[] args) throws IOException {
		File file = new File("C:\\Users\\Manish\\Documents\\Programming\\#myWork\\CS\\Java");
		File[] filearray = file.listFiles();
		
		//files:
		for(File f : filearray){
			//System.out.println(f.getCanonicalPath());
			//System.out.println("##"+f.getParent());
			//System.out.println(f.getTotalSpace());
			System.out.println(f.getName()+" is file :"+f.isFile());
			System.out.println();
			if(!f.isFile()){
				File temp = new File(f.getAbsolutePath());
				//for()
				
			}
		}

	}

}
