package tryCatch;

public class TryCatchEx1 {

	public static void main(String[] args) {
		int[] arr= new int[5];
		try
		{
		arr[2]=10;
		arr[0]=500;
		arr[2]=300;
		arr[5]=100;
		arr[4]=700;
		System.out.println(arr[0]);
		System.out.println(arr[3]);
		
		}
		catch(Exception e)
		{
			System.out.println("cannot store array values, may there is index out of length");
			e.printStackTrace();
		}
		
		System.out.println(arr[4]);
		System.out.println(arr[1]);
	}

}
