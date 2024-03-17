import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input radius from user
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();
        double pi=3.14;

        // Calculate area and perimeter
        double area = pi * radius * radius;
        double perimeter = 2 * pi * radius;

        // Print the results
        System.out.println("Area of the circle: " + area +" square units");
        System.out.println("Perimeter of the circle: " + perimeter+" units");
 
        scanner.close();
    }
}
