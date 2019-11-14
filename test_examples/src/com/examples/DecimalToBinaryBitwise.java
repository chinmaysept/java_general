package com.examples;

public class DecimalToBinaryBitwise {

	public static void main(String[] args) {
		display(8);
	}
	private static void display( int number ){
        //display number and a tab
        System.out.print(number + "\t");

        //shift number 31 bits left
        int mask = 1 << 31;

        //loop and print either 1 or 0
        for(int i=31; i>=0; i--) {
            if( ((1 << i) & number) != 0)
                System.out.print(1);
            else
                System.out.print(0);

            //every four bits print a space
            if( (i % 4) == 0 )
                System.out.print(" "); 
            
            mask = mask >> 1;
        }
        //print new line
        System.out.println();
    }
}
