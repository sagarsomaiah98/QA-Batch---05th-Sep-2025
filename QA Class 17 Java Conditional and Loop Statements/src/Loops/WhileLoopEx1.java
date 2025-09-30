package Loops;

public class WhileLoopEx1 {

	public static void main(String[] args) {
		boolean flag=true;
		 for(int i=1;i<10;i++) {
			 if(i==9)
				 flag=false;
			 while(flag) {
				 System.out.println("hello world");
			 }
		 }
		 
		
		
	}

}
