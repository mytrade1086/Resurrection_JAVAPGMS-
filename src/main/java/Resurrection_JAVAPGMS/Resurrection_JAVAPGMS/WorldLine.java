package Resurrection_JAVAPGMS.Resurrection_JAVAPGMS;

import java.util.ArrayList;

public class WorldLine {

	public static void main(String[] args) {
		
		
		
		    String input = "IlovemyIndiadoyou";
		    char[] data = input.toCharArray();
		    int length = data.length-1 ;
		    int row = 1, k = length;
		    //count number of rows
		    while(k>=0){
		        k = k - row;
		        row++;
		    }
		   
		    int counter = -1;
		    boolean flag = false;
		    for(int i=0; i< row; i++){
		        for(int j=0; j< i; j++){
		            if(counter < length) {
		                System.out.print(data[++counter]+" ");
		            } else{
		               System.out.println("");
		            }
		        }
		        System.out.println("" );
		    }
		    }

			
			
			

			
			//0,1
			//
			//1,1
			
		
		
	}

