import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreamDemTryResources {
public static void main(String[] args) {
		
		
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream("C:\\JavaFileWork\\demout.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}	
		String txt="Java Programming";
		try {
			fos.write(txt.getBytes());
			fos.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
