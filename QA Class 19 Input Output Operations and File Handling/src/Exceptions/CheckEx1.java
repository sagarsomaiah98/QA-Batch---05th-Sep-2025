package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckEx1 {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\somai\\OneDrive\\Desktop\\testing1.txt");
		
		System.out.println("program ended");

	}

}
