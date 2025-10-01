package ArraysConcept;

public class ArrayEx1 {

	public static void main(String[] args) {
		
		int[] marks= new int[10];
		marks[0]=90;
		marks[3]=40;
		marks[2]=70;
		marks[1]=95;
		marks[2]=55;
		marks[4]=65;
		/*
		 * System.out.println(marks[0]); System.out.println(marks[1]);
		 * System.out.println(marks[2]);// System.out.println(marks[3]);
		 * System.out.println(marks[4]);
		 */
		
		//System.out.println(marks.length);
		for(int i=0;i<marks.length;i++) {
			System.out.println("i value->  "+i);
			System.out.println(marks[i]);
		}

	}

}
