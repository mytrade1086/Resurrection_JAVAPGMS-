package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

public class StringMaximumMinimumOccuringcharacter {

	@org.testng.annotations.Test
	public void Test() {
		
		
		String str = "grass is greener on the other side";
		String sVisited="";
		
		str=str.replaceAll("[^a-zA-Z]", "");
		int ileast=0;
		int iMax=0;
		int length;
		
		String max="";
		String min="";
		
		
		for(String s:str.split("")){
			
			if(!sVisited.contains(s)) {
				sVisited=sVisited+s;
				 length=str.length()-str.replace(s, "").length();
				
				if(iMax<length) {
					iMax=length;
					max=s;
				}
				
				if(ileast==0) {
				ileast=length;}
				
				
			else{	
				if(ileast>length) {ileast=length; min=s;}
			    }
			}
		}
		
		
		System.out.println("max=>"+iMax  +" char=>"+max);
		System.out.println("least=>"+ileast+" char=>"+min);
				
		
	}	
		
	





@org.testng.annotations.Test

public void solution() {
	String str = "grass is greener on the other side";    
    int[] freq = new int[str.length()];    
    char minChar = str.charAt(0), maxChar = str.charAt(0);    
    int i, j, min, max;            
        
    //Converts given string into character array    
    char string[] = str.toCharArray();    
        
    //Count each word in given string and store in array freq    
    for(i = 0; i < string.length; i++) {    
        freq[i] = 1;    
        for(j = i+1; j < string.length; j++) {    
            if(string[i] == string[j] && string[i] != ' ' && string[i] != '0') {    
                freq[i]++;    
                    
                //Set string[j] to 0 to avoid printing visited character    
                string[j] = '0';    
            }    
        }    
    }    
        
    //Determine minimum and maximum occurring characters    
    min = max = freq[0];    
    for(i = 0; i <freq.length; i++) {    
            
        //If min is greater than frequency of a character     
        //then, store frequency in min and corresponding character in minChar    
        if(min > freq[i] && freq[i] != '0') {    
            min = freq[i];    
            minChar = string[i];    
        }    
        //If max is less than frequency of a character     
        //then, store frequency in max and corresponding character in maxChar    
        if(max < freq[i]) {    
            max = freq[i];    
            maxChar = string[i];    
        }    
    }           
    System.out.println("Minimum occurring character: " + minChar);    
    System.out.println("Maximum occurring character: " + maxChar);    
}    
 

}
