package returnType;

public class MathOp {
	
	public static int max(int value1, int value2) {
		if(value1>value2)
			return value1;
		
		return value2;
				
	}
	public static int min(int value1, int value2) {
		if(value1>value2)
			return value2;
		
		return value1;			
		
	}
	public static double areaCircle(double radius) {
		
		return 3.14*radius*radius;
	}

	public static void main(String[] args) {
		
     int out=min(10,30);
     System.out.println(out);

     double o=areaCircle(7);
     System.out.println(o);
	}

}
