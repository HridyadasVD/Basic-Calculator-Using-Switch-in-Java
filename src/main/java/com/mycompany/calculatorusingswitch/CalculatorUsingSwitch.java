

package com.mycompany.calculatorusingswitch;

import java.util.Scanner;

public class CalculatorUsingSwitch {

    public static void main(String[] args) {
		
		int sum,diff,mul,rem;
		float div;
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter 2 numbers : ");
			int num1=sc.nextInt();
			int num2=sc.nextInt();
			System.out.println("Enter symbol of operation to do ( +  -  *  /  % ) :   ");
			String operator=sc.next();
			

			
			switch(operator) {
			  case "+" -> {
                              sum=num1+num2;
                              System.out.println("Sum = " +sum);
                        }
			  case "-" -> {
                              diff=num1-num2;
                              System.out.println("Difference = " +diff);
                        }
			  case "*" -> {
                              mul=num1*num2;
                              System.out.println("Product = " +mul);
                        }
			  case "/" -> {
                              div=num1/num2;
                              System.out.println("Quotient = " +div);
                        }
			  case "%" -> {
                              rem=num1%num2;
                              System.out.println("Remainder = " +rem);
                        }
			  default -> System.out.println("Invalid operator");
			     
			}
		}


	}
}
