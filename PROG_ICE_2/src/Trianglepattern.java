/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author User
 */

import java.util.Scanner;
public class Trianglepattern {
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Enter the number of rows
        System.out.print("Enter a number: ");
        int rows = scanner.nextInt();
        
        
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j); 
                // Print numbers from 1 to i
            }
            System.out.println(); 
            // Move to the next line after each row
        }
        
        // Close the scanner
        scanner.close();
    }
}
