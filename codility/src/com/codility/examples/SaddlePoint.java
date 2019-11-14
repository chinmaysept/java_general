package com.codility.examples;

public class SaddlePoint
{   
    static void findSaddlePoint(int[][] matrix)
    {
        for (int i = 0; i < matrix.length; i++) 
        {
            int rowMin = matrix[i][0];
             
            int colIndex = 0;
             
            boolean saddlePoint = true;
             
            //Finding the smallest element in ith row
             
            for (int j = 1; j < matrix[i].length; j++)
            {
                if(matrix[i][j] < rowMin)
                {
                    rowMin = matrix[i][j];
                     
                    colIndex = j;
                }
            }
             
            //Checking rowMin is also the largest element in its column
             
            for (int j = 0; j < matrix.length; j++)
            {
                if(matrix[j][colIndex] > rowMin)
                {
                    saddlePoint = false;
                     
                    break;
                }
            }
             
            if(saddlePoint)
            {
                System.out.println("Saddle Point is : "+rowMin);
            }
        }
    }
     
    public static void main(String[] args) 
    {
        
         
     
         
        int[][] matrix =  {{6,3,1}, {9,7,8}, {2,4,5}};
         
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++)
            {
                matrix[i][j] = matrix[i++][j++];
            }
        }
         
        System.out.println("The input matrix is :");
         
        for (int i = 0; i < 3; i++) 
        {
            for (int j = 0; j < 3; j++)
            {
                System.out.print(matrix[i][j]+"\t");
            }
             
            System.out.println();
        }
         
        findSaddlePoint(matrix);
         
        
    }
}
