package leetcodeapps;

import java.util.Arrays;

import org.testng.annotations.Test;

public class ReverseArray {

	
	public static void main(String[] args) {
		
		char[]s = {'h','e','l','l','o'};
        char c;
        int i=0;
        int j=s.length-1;
        while(j>i){
            c=s[j];
            s[j]=s[i];
            s[i]=c;
            
            j--;i++;
        }
        
        System.out.println(Arrays.toString(s));
       // [o, l, l, e, h]

	}
	
	
	@Test
	
	public void Prac() {
		
		char[]s = {'h','e','l','l','o'};
		
		System.out.println(Arrays.toString(s));
		
		int i=0; int j=s.length-1;
		
		char temp=' ';
		
		
		while(i<j) {	
			temp=s[i];
			s[i]=s[j];
			s[j]=temp;	
			i++;j--;
		}
		
		System.out.println(Arrays.toString(s));
		
		
		
	}
}
