package Exceptions;

public class Except1 {

	public static void main(String[] args) {
		int[] arr= new int[5];
		arr[2]=10;
		System.out.println(arr[0]);
		System.out.println(arr[3]);
		arr[5]=100;
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		
	}

}
