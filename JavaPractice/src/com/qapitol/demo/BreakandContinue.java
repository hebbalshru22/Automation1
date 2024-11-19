package com.qapitol.demo;

public class BreakandContinue {
    public static void main(String args[])
    {
        int numbreak=10;
        int numskip=2;
        for(int i=1;i<=30;i++)
        {
            if(i==numskip)
            {
                continue;
            }
            if(i==numbreak)
            {
                break;
            }
            System.out.println(i);
        }
    }
}
