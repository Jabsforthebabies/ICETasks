/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package icetask3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Q1 {
        public static void main(String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter a number: ");
            int number = scanner.nextInt();
            if (number > 0){
                System.out.println("The number is positive");
            }else if (number < 0){
                System.out.println("The number is negative");
            }else{
                System.out.println("The number is zero");
            }   
        }
    }
