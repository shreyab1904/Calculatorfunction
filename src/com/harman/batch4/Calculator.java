package com.harman.batch4;

import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {

        Addition adCalc =new Addition();
        Subtraction subCalc=new Subtraction();
        Multiplication multCalc=new Multiplication();
        Division divCalc=new Division();
        Scanner input=new Scanner((System.in));
        int n1,n2,result1,result2,result3,result4;
        System.out.println("Enter number : ");
        n1=input.nextInt();
        System.out.println("Enter number 2:");
        n2=input.nextInt();
        result1=adCalc.AdditionOperation(n1,n2);
        result2=subCalc.SubOperation(n1,n2);
        result3=multCalc.multiOperation(n1,n2);
        result4=divCalc.divOperation(n1,n2);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
    }
}
