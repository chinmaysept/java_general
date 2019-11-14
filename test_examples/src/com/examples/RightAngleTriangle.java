package com.examples;

public class RightAngleTriangle{
	public static void main(String args[]){
		/*for(int i=1;i<=7;i++){
			for(int j=1;j<=i;j++) {
				System.out.print(((i+j)%2)+" ");
			}
			System.out.print("\n");
		}*/
		
		 /*//define limit
        int limit = 50;
       
        System.out.println("Printing Even numbers between 1 and " + limit);
       
        for(int i=1; i <= limit; i++){
               
                // if the number is divisible by 2 then it is even
                if( i % 2 == 0){
                        System.out.print(i + " ");
                }
        }*/
		
//		Point with stars
		
		int i,j;
		for(i=1; i<=6; i++)
		{
		for(j=1; j<i; j++)
		{
		System.out.print("*");
		}
		System.out.println();
		}
		
	}
}
