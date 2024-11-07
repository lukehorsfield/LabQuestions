import java.util.Random;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Collections;

public class Questions {

    public static void main(String[] args) {
 
        Random r = new Random();
        ArrayList<String> outputQuestions = new ArrayList<String>();

        // Select a custom number of questions from each lab
        selectRandomQuestions(qLab1.qlist(), outputQuestions, 1, r); // Introduction to programming (max 5)
        selectRandomQuestions(qLab2.qlist(), outputQuestions, 1, r); // Functions (max 7)
        selectRandomQuestions(qLab3.qlist(), outputQuestions, 1, r); // Arrays (max 11)
        selectRandomQuestions(qLab4.qlist(), outputQuestions, 1, r); // Classes and Objects (max 3)
        selectRandomQuestions(qLab5.qlist(), outputQuestions, 1, r); // Inheritance and Polymorphism (max 6)
        selectRandomQuestions(qLab6.qlist(), outputQuestions, 1, r); // Strings, Nulls, ArrayLists and Streams API (max 9)



        // Shuffle the questions to display in a random order - ON or OFF
        // Collections.shuffle(outputQuestions, r);

        // Print the unique output questions with four newlines between them
        for (String question : outputQuestions) {
            System.out.println(question + "\n\n\n\n");
        }
    }

    
    // Method to select a specified number of random unique questions from the given array
    public static void selectRandomQuestions(String[] lab, ArrayList<String> outputQuestions, int numQuestions, Random r) {
        if (numQuestions > lab.length) {
            throw new IllegalArgumentException("Number of questions to select exceeds the available questions in the array.");
        }

        HashSet<Integer> selectedIndices = new HashSet<>();
        while (selectedIndices.size() < numQuestions) {
            int randomIndex = r.nextInt(lab.length);
            if (!selectedIndices.contains(randomIndex)) {
                selectedIndices.add(randomIndex);
                outputQuestions.add(lab[randomIndex]);
            }
        }
    }
}

