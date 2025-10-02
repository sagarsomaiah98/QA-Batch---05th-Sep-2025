package tryCatch;

public class TryCatchEx2 {

	public static void main(String[] args) {
	int a=20;
	int b=30;
	int c=20;
	int[] arr = new int[5];
	try {
		int res=a+b;
		arr[2]=res;
		arr[3]=a;
		arr[4]=b;
		arr[5]=a+b;
		arr[1]=20;
		arr[2]=10;
			
	}
	catch(Exception e) {
		System.out.println(arr.length);
		System.out.println("exception found");
	}
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}

	}

}
