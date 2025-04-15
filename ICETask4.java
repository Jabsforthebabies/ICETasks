/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package icetask4;

/**
 *
 * @author User
 */
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
public class ICETask4 {
    public static void main(String[] args) {
        // Convert ArrayList to Array
        System.out.println("Convert ArrayList to Array");
        ArrayList<String> subjects = new ArrayList<>(Arrays.asList("Maths", "Physics", "Chemistry", "Biology", "Probability"));
        String[] subjectsArray = subjects.toArray(new String[0]);
        System.out.println("ArrayList: " + subjects);
       
        // Values of x, y, z
        int[] array = {1, -2, 0, 5, -1, -4};
        Arrays.sort(array); // Sort the array to ensure x <= y <= z
        System.out.println("Possible sets of x, y, z where x <= y <= z and x + y + z = 2:");
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                for (int k = j; k < array.length; k++) {
                    if (array[i] + array[j] + array[k] == 2) {
                        System.out.println("(" + array[i] + ", " + array[j] + ", " + array[k] + ")");
                    }
                }
            }
        }

        // Write and Read from a File
        System.out.println("\nWrite to and Read from a File");
        String filePath = "ice2.txt";
        String contentToWrite = "My name is Jabs.";

        // Writing to the file
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(contentToWrite);
            System.out.println("Written to file: " + contentToWrite);
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }

        // Reading from the file
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            System.out.println("Read from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }
    }
} 
