package com.qapitol.demo;

public class Foreach {
    public void each()
    {
        int a[]={9,8,7,6,5,4,2};
        for(int itr:a)
        {
            System.out.println("Numbers are"+itr);
        }
    }
    public static void main(String[] args)
    {
        Foreach fr=new Foreach();
        fr.each();
    }
}
