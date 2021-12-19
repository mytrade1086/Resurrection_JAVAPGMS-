package ArrayPgms;

public class LongestCommonPrefix {
	
	public static void main(String[] args) {
		String[] names = {"fll", "flower", "fly", "flyer" };
        String prefix=names[0];
        
        for(int i=1;names.length<1;i++) {
        	
        	while(names[i].indexOf(prefix)!=0) {
        		prefix=prefix.substring(0,prefix.length()-1);
        	}
        	
        }
		
		
		
}
}