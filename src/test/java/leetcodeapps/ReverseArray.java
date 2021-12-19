package leetcodeapps;

import java.util.Arrays;

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
	}
}
