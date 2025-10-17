
public class AreaofCircle {
	//Find area of a circle
	//area of circle= pie*r^2
	
	public static double calculateArea(double radius) {
        return Math.PI * radius * radius;
    }

	public static void main(String[] args) {
		double radius = 5.0; // you can change this value or pass dynamically
        double area = calculateArea(radius);
        System.out.println("The area of the circle with radius " + radius + " is: " + area);
	}

}
