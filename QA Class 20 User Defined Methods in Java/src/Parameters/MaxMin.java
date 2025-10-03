package Parameters;

public class MaxMin {
	public void max(int a, int b) {
     if(a>b)
    	 System.out.println(a+" is maximum");
     else
    	 System.out.println(b+" is maximum");
     		
	}
	public void min(int a, int b) {
	     if(a<b)
	    	 System.out.println(a+" is minimum");
	     else
	    	 System.out.println(b+" is minimum");
	     		
		}

	public static void main(String[] args) {
		
		MaxMin m = new MaxMin();
		m.max(20, 10);
		m.min(55, 60);
	}

}
