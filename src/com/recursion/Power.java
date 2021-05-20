package com.recursion;

public class Power
{
    static int RecursivePower(int n,int p)
    {
        // add your code here
        if(p == 0){
            return 1;
        }else{
            return n*(RecursivePower(n,p-1));
        }
    }
    
    public static void main(String args[]) {
    	int number = 12;
    	int power = 21;
    	System.out.println(RecursivePower(number,power));
    	
    }
 
}