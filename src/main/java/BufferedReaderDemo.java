import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	
	public static void main(String[] args)  {
		BufferedReader br=null;
		String sPath="C:\\JavaFileWork\\demout.txt";
		String text="";
		
		try {
			br=new BufferedReader(new FileReader(sPath));
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
			
			System.out.println(e1);
		}
			
		try {
		    while ((text = br.readLine()) != null)
		    	 
	            // Print the string
	            System.out.println(text);
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println(e);
		}
		
		finally {
			
			try {
				br.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
		}
		}
		
	}

