package com.example;

public class ArrayIndexPosition {

    public static void main(String[] args)  {


        int[] input={1,3,6,7};
        int target=2;
        Boolean flag=true;
        for(int i=0;i<input.length;i++)
        {
            if(input[i]==target)
            {
                System.out.println(i);
                flag=false;
                break;
            }
            else if(input[i]>target)
            {
                System.out.println(i);
                flag=false;
                break;
            }

        }
        if(flag)
        {
            System.out.println(input.length);
        }

    }


}