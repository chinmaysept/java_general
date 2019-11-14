package com.loop.pattern;

public class TrianglePattern {
	
	public static void main(String[] args) {
		//Small triangle
		/*for (int i = 6, k = 0; i > 0 && k < 6; i--, k++) {
		    for (int j = 0; j < i; j++) {
		        System.out.print(" ");
		    }
		    for (int j = 0; j < k; j++) {
		        System.out.print("*");
		    }
		    for (int j = 1; j < k; j++) {
		        System.out.print("*");
		    }
		    System.out.println();
		}*/
		
		//Bigger triangle
		
		/*int dim = 10;
        for (int i = 0; i < dim; i++) {
            for (int k = i; k < dim; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                //if (i != dim - 1)
                //  if (j == 0 || j == i)
                //      System.out.print("*");
                //  else
                //      System.out.print(" ");
                //else
                    System.out.print("*");
                System.out.print(" ");
            }
            System.out.println("");
        }*/
		
		//Small traingle
		
		 /*for (int i=0; i<6; i++)
		  {
		     for (int k=0; k<6-i; k++)
		     {
		        System.out.print(" ");
		     }
		     for (int j=0; j<i*2+1; j++)
		     {
		        System.out.print("*");
		     }
		     System.out.println("");
		  }*/
		
		// Triangle
		
		/*for (int i=1; i<10; i += 2)
		{
		    for (int k=0; k < (4 - i / 2); k++)
		    {
		        System.out.print(" ");
		    }
		    for (int j=0; j<i; j++)
		    {
		        System.out.print("*");
		    }
		    System.out.println("");
		}*/
		
		//Right angle Triangle
		
		/*for (int i=0; i<6; i++)
		  {
		  for (int j=0; j<i; j++)
		  {
		  System.out.print("*");
		  }
		  System.out.println("");
		  }*/
		
		//Inverted Right angle Triangle
		
				/*for (int i=6; i>=0; i--)
				  {
				  for (int j=i; j>0; j--)
				  {
				  System.out.print("*");
				  }
				  System.out.println("");
				  }*/
		
		//
		
		/*for (int i=6; i>=0; i--)
		  {
		  for (int j=i; j>0; j--)
		  {
		  System.out.print("*");
		  }
		  System.out.println("");
		  }*/
		
		/*for(int i=1; i<= 5 ;i++){
            
            for(int j=0; j < i; j++){
                    System.out.print("*");
            }
           
            //generate a new line
            System.out.println("");
    }*/
   
    //create second half of pyramid
    /*for(int i=5; i>0 ;i--){
           
            for(int j=0; j < i; j++){
                    System.out.print("*");
            }
           
            //generate a new line
            System.out.println("");
    }*/
		//generate upper half of the pyramid
        /*for(int i=5; i>0 ;i--){
               
                for(int j=0; j < i; j++){
                        System.out.print("*");
                }
               
                //create a new line
                System.out.println("");
        }*/
       
        //generate bottom half of the pyramid
        /*for(int i=1; i<= 5 ;i++){
               
                for(int j=0; j < i; j++){
                        System.out.print("*");
                }
               
                //create a new line
                System.out.println("");
        }*/
        
        /*for(int i=0; i<9; i++)
        	
        	       {
        	
        	      
        	
        	        String space = "********";
        	
        	        for(int j=0; j<i; j++)
        	
        	        {
        	
        	       space=space+"*";
        	
        	        System.out.print(space+"\n");
        	
        	        
        	
        	           }
        	       }*/

		
		//Simple triangle
		
		/*for (int i = 0; i < 5; i++) 
			  System.out.println("    *********".substring(i, 5 + 2*i));*/
		
		//Inverted triangle
		/*int x, y;
        for (y = 5; y >= 1; y--) { //reverse here
            for (x = 0; x < 5 - y; x++)
                System.out.print(' ');
            for (x = (2 - y); x < (2 - y) + (2 * y - 1); x++)
                System.out.print('*');
            System.out.print('\n');
        }*/
		// Left right angle triangle
		
		for (int i = 0; i < 6; i++)
        {
            for (int j = 6; j > i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i + 1; k++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
		
		
		
	}

}
