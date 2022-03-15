package com.harman.batch4;

import java.util.Scanner;

public class Calculator extends ParentCalculator{
    public static void main(String[] args) {

       Calculator ob =new Calculator();
        Scanner input=new Scanner((System.in));
        int n1,n2,result1,result2;
        System.out.println("Enter number : ");
        n1=input.nextInt();
        System.out.println("Enter number 2:");
        n2=input.nextInt();
        result1=ob.AdditionOperation(n1,n2);
        result2=ob.SubOperation(n1,n2);

        System.out.println(result1);
        System.out.println(result2);

    }
}
