package faps.domain;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

import org.optaplanner.core.api.domain.entity.PlanningEntity;
import org.optaplanner.core.api.domain.lookup.PlanningId;
import org.optaplanner.core.api.domain.valuerange.ValueRangeProvider;
import org.optaplanner.core.api.domain.variable.PlanningVariable;


@PlanningEntity
public class Sequence {

    @PlanningVariable(valueRangeProviderRefs="Sequence")
    public Sequence Sequence;
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input string
        System.out.print("Enter a string of 'c' and 't': ");
        String inputString = scanner.nextLine();

        // Create an array to store 'c' and 't'
    
        char[] Sequence = new char[inputString.length()];

        // Fill the array with characters from the input string
        for (int i = 0; i < inputString.length(); i++) {
            char c = inputString.charAt(i);
            // Check if the character is 'c' or 't' and add it to the array
            if (c == 'c' || c == 't') {
                Sequence[i] = c;
            } else {
                System.out.println("Invalid character detected. Only 'c' and 't' are allowed.");
                return;
            }
        }

        // Display the array
        System.out.print("Array of 'c' and 't': ");
        for (char c : Sequence) {
            System.out.print(c + " ");
            
        }
        System.out.println("");

        
        

    }

    /*  public static void setSequence(char[] Sequence) {
        char[] sequence1 = Arrays.copyOfRange(Sequence, 0, Sequence.length/2);
        char[] sequence2 = Arrays.copyOfRange(Sequence, Sequence.length / 2, Sequence.length);


        for (char j : sequence1) {
            System.out.print(j + " ");

        }
        System.out.println(" ");

            for (char k : sequence2) {
            System.out.print(k + " ");
        }

    */
        


    }
    

    
    




    

