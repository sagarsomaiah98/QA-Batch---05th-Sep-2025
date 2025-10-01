package conditions;

public class OperatorConditions {

	public static void main(String[] args) {
		int x=5;
		int y=25;
		
		if(x>20 && y>20)//false & true= false
			System.out.println("both are greater than 20");
		else if( x<20 || y<20)// true or true
             System.out.println("either x or y is smaller than 20");
		else
			System.out.println("both conditions are false");
	}

}
