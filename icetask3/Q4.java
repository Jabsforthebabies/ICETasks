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
public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for the number of rows
        System.out.print("Enter the number of rows for the triangle: ");
        int rows = scanner.nextInt();

        // Generate the triangle pattern
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}

