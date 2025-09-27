package operators;

import java.util.Scanner;

public class MathOutput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first value: ");
		int value1=sc.nextInt();
		System.out.println("Enter the second value: ");
		int value2=sc.nextInt();
		
		System.out.println(value1+value2);
		System.out.println(value1-value2);
		System.out.println(value1>value2);
		System.out.println(value1==value2);
		System.out.println(value1*value2);
		
		

	}

}
