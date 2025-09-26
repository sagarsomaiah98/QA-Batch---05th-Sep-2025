package DataTypes;

public class TypeCasting {

	public static void main(String[] args) {
		
		 // ----------- NARROWING CASTING (manual) -----------
        double d1 = 123.456;
        float f1 = (float) d1;   // double -> float
        long l1 = (long) d1;     // double -> long
        int i1 = (int) d1;       // double -> int

        System.out.println("Narrowing Casting (large -> small):");
        System.out.println("double value: " + d1);
        System.out.println("double -> float: " + f1);
        System.out.println("double -> long: " + l1);
        System.out.println("double -> int: " + i1);

        System.out.println("\n--------------------------------------\n");
	}

}
