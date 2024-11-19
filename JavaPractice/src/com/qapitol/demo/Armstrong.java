package com.qapitol.demo;

public class Armstrong {
    public static void main(String args[])
    {
        int num=10000;
        int rem=0;
        int sum=0;
        for(int i=1;i<=num;i++)
        {
            int n=i;
            while(n>0)
            {
                rem=n%10;
                sum=sum+(rem*rem*rem);
                n=n/10;

            }
            if(sum==i)
            {
                System.out.println("armstrong number is "+i);
            }
            sum=0;
        }
    }
}
