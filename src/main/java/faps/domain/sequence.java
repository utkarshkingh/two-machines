package faps.domain;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.lookup.PlanningId;
import org.optaplanner.core.api.domain.variable.PlanningVariable;

@PlanningEntity
public class sequence {

    

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
    
            // Read the number of inputs
            System.out.print("Enter the number of jobs: ");
            int jobs = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character
    
            // Create an array to store 'c' and 't'
            char[] sequence = new char[jobs];
    
            // Read input string
            System.out.print("Enter a string of 'c' and 't': ");
            String inputString = scanner.nextLine();
    
            // Check if the length of the input string matches the number of jobs
            if (inputString.length() != jobs) {
                System.out.println("Invalid input length. Please enter exactly " + jobs + " characters.");
                return;
            }
    
            // Fill the array with characters from the input string
            for (int i = 0; i < jobs; i++) {
                char c = inputString.charAt(i);
                // Check if the character is 'c' or 't' and add it to the array
                if (c == 'c' || c == 't') {
                    sequence[i] = c;
                } else {
                    System.out.println("Invalid character detected. Only 'c' and 't' are allowed.");
                    
                    return;
                }
            }
    
            // Display the array
            System.out.print("Array of 'c' and 't': ");
            for (char c : sequence) {
                System.out.print(c + " ");
            }
        }
    }

    
    



    


