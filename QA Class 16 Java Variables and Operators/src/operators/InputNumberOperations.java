package operators;

import java.util.Scanner;

public class InputNumberOperations {

	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=sc.nextInt();
		System.out.println("Enter the second number");
		int num2=sc.nextInt();
		int res=num1+num2;
		System.out.println("Addition of two numbers "+num1+" and "+num2+" is -> "+res);

	}

}
