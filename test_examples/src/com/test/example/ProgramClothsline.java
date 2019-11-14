package com.test.example;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

public class ProgramClothsline
{
    public static void main(String[] args)
    {
        int input1 = 10;
        int input2 = 5;
        int[][] input3 = { { 0, 4 }, { 6, 3 }, { 1, 5 }, { 6, 4 }, { 7, 2 } };
        UserMainCode2 user = new UserMainCode2();
        user.GetVisibleCount(input1, input2, input3);
       // Console.ReadLine();
    }
}

/*public class UserMainCode
{
    //Assume following return types while writing the code for this question. 
    public static int output1;

    public static void GetVisibleCount(int input1, int input2, int[,] input3)
    {
        //Write code here
        output1 = input2;
        
        int noOfClothes = input2;
        Dictionary<int, int> secDict= null;
        for (int i = 0; i < noOfClothes; i++)
        {
            int startValue = input3[i, 0];
            int length = input3[i, 1];
            int endValue = startValue + length;
            secDict = new Dictionary<int, int>();
            for (int k = startValue; k < endValue; k++)
            {
                secDict.Add(k, k+1);
            }

            //check if any cloth is hidden by later clothes
            for (int j = i + 1; j < noOfClothes; j++)
            {
                int startValueTemp = input3[j, 0];
                int lengthTemp = input3[j, 1];
                int endValueTemp = startValueTemp + lengthTemp;

                if ((startValueTemp >= startValue && startValueTemp < endValue)
                    || (endValueTemp > startValue && endValueTemp <= endValue))
                {
                    //totally inside 
                    if (startValueTemp >= startValue && endValueTemp <= endValue)
                    {
                        for (int m = startValueTemp; m < endValueTemp; m++)
                        {
                            if (secDict.ContainsKey(m))
                            {
                                secDict.Remove(m);
                            }
                        }
                    }
                    //totally covering
                    else if (startValueTemp < startValue && endValueTemp > endValue)
                    {
                        secDict.Clear();
                    }
                    //starting later, ending later
                    else if (startValueTemp >= startValue && endValueTemp >= endValue)
                    {
                        for (int m = startValueTemp; m < endValue; m++)
                        {
                            if (secDict.ContainsKey(m))
                            {
                                secDict.Remove(m);
                            }
                        }
                    }
                    //starting before, ending before
                    else if (startValueTemp <= startValue && endValueTemp <= endValue)
                    {
                        for (int m = startValue; m < endValueTemp; m++)
                        {
                            if (secDict.ContainsKey(m))
                            {
                                secDict.Remove(m);
                            }
                        }
                    }
                }
            }

            //check if dictionary has anything left
            if (secDict.Count == 0)
            {
                output1--;
            }                
        }            
    }
}*/

class UserMainCode2
{
    //Assume following return types while writing the code for this question. 

    public void GetVisibleCount(int input1, int input2, int[][] input3)
    {
        //Write code here
        int output1 = input2-1;

        int noOfClothes = input2;
        HashMap<Integer, Integer> secDict = null;
        HashMap<Integer, Integer> outerDict = null;
        for (int i = 0; i < noOfClothes; i++)
        {
            int startValue = input3[i][0];
            int length = input3[i][1];
            int endValue = startValue + length;
            secDict = new HashMap<Integer, Integer>();
            outerDict = new HashMap<Integer, Integer>();
            for (int k = startValue; k < endValue; k++)
            {
                secDict.put(k, k + 1);
            }

            //check if any cloth is hidden by later clothes
            for (int j = i + 1; j < noOfClothes; j++)
            {
                int startValueTemp = input3[j][0];
                int lengthTemp = input3[j][1];
                int endValueTemp = startValueTemp + lengthTemp;


                for (int m = startValueTemp; m < endValueTemp; m++)
                {
                    if (!outerDict.containsKey(m))
                    {
                        outerDict.put(m, m + 1);
                    }
                }  
            }


            /*for (HashMap<Integer, Integer> kp : outerDict)
            {
                if (secDict.containsKey(kp.Key))
                {
                    secDict.Remove(kp.Key);
                }
            }*/

            //check if dictionary has anything left
            if (secDict.size() == 0)
            {
                output1--;
            }                
        }

        //Console.WriteLine(output1);
        System.out.println("The value of the output1..."+output1);
    }
}


