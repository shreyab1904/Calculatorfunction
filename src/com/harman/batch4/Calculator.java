package com.harman.batch4;

import java.util.Scanner;

public class Calculator{
    public int AdditionOperation(int x,int y)
    {
        int z=x+y;
        return z;
    }

    public static void main(String[] args) {

        Calculator calc=new Calculator();
        Scanner input=new Scanner((System.in));
        int n1,n2,result;
        System.out.println("Enter number : ");
        n1=input.nextInt();
        System.out.println("Enter number 2:");
        n2=input.nextInt();
        result=calc.AdditionOperation(n1,n2);
        System.out.println(result);
    }
}
