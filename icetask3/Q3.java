/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask3;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for coefficients
        System.out.print("Input a: ");
        double a = scanner.nextDouble();

        System.out.print("Input b: ");
        double b = scanner.nextDouble();

        System.out.print("Input c: ");
        double c = scanner.nextDouble();

        // Calculate the discriminant
        double discriminant = b * b - 4 * a * c;

        // Check the nature of the roots
        if (discriminant > 0) {
            // Two distinct real roots
            double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("The roots are " + root1 + " and " + root2 + ".");
        } else if (discriminant == 0) {
            // One real root
            double root = -b / (2 * a);
            System.out.println("The root is " + root + ".");
        } else {
            // Complex roots
            double realPart = -b / (2 * a);
            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
            System.out.println("The roots are " + realPart + " + " + imaginaryPart + "i and " 
                               + realPart + " - " + imaginaryPart + "i.");
        }

        scanner.close();
    }
}
