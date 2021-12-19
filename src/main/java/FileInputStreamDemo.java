
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;  
public class FileInputStreamDemo {

	
	public static void main(String[] args) throws IOException {
		
		String sPath="C:\\JavaFileWork\\demout.txt";
		FileInputStream fis=null;	
		try {
			 fis=new FileInputStream(sPath);
			do {
				System.out.println((char)fis.read());//J
			}
			while(fis.read()==-1);
			fis.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			 fis=new FileInputStream(sPath);
			
			int x;
			while((x=fis.read())!=-1) {
				
				System.out.println((char)x);		
			}
		}
			
			catch(Exception ex) {}
			
			finally {
			
				fis.close();
				
			}
			
		}
		
		
		
		
		
		
	}

