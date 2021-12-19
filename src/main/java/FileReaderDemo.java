import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) {
		FileReader fr;
		String sPath="C:\\JavaFileWork\\demout.txt";
		try {
			 fr=new FileReader(new File(sPath)); 
			System.out.println((char)fr.read());//J
			fr.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
	
			e.printStackTrace();
		}
	}
}
