
public class qLab6 {
	
	public static String[] qlist() {

        String[] lab5 = {
                l6q1(""),
                l6q2(""),
                l6q3(""),
                l6q4(""),
                l6q5(""),
                l6q6(""),
                l6q7(""),
                l6q8(""),
                l6q9("")
        		};
        
        return lab5;	
	}
	

	static String l6q1(String args) {
		
		String question = "// Write a program that determines whether the given string is a palindrome or not.\n"
				+ "// A palindrome is word that is spelt the same backwards. Some examples include “Hannah”,“Girafarig”, “eye”, “abba” and “madam”";
		
		return question;
	}
		
		
	static String l6q2(String args) {
			
		String question = "/* Create this paragraph as a string,\n"
				+ " \n"
				+ " String paragraph = \"We choose to go to the MOON. We choose to go to the MOON... We choose to go to the Moon in this decade and do the other things, not because they are easy, but because they are hard; because that goal will serve to organize and measure the best of our energies and skills, because that challenge is one that we are willing to accept, one we are unwilling to postpone, and one we intend to win, and the others, too.\";\n"
				+ " \n"
				+ " then change it to an array of chars and count the number of vowels in the string using a For-each loop. \n"
				+ "  \n"
				+ " Print the number of vowels in the array. Next, print the total number of characters (excluding spaces) in the array. \n"
				+ " Then, write a program that displays the frequency of each letter in the string. */";
			
		return question;
		}

	static String l6q3(String args) {
		
		String question = "/* Create a hash map of 6 students and their ID numbers:\n"
				+ "1234 : Jerry\n"
				+ "2345 : Steven\n"
				+ "3456 : Larry\n"
				+ "4567 : Sarah\n"
				+ "5678 : Louise \n"
				+ "6789 : Lyle \n"
				+ "First, print the hash map. \n"
				+ "Then, print the students names and their IDs sepertately using a lamda function. */";
			
		return question;
		}
	
	static String l6q4(String args) {
		
		String question = "/* Write a Java program that reads a list of integers from the user and stores them in an ArrayList.\n"
				+ " * Then, filter out even numbers and print only the odd numbers using the Java Streams API.\n"
				+ " * Afterward, sort the list in descending order and display the results.\n"
				+ " */\n"
				+ "";
			
		return question;
		}
	
	static String l6q5(String args) {
		
		String question = "/* Write a program that reads a list of words from the user, stores them in an ArrayList, and then:\n"
				+ " * - Filters out words that start with a vowel (A, E, I, O, U).\n"
				+ " * - Sorts the remaining words by length in ascending order.\n"
				+ " * - Converts each word to lowercase and adds them to a new list.\n"
				+ " * - Finally, print out the transformed list.\n"
				+ " */\n"
				+ "";
			
		return question;
		}
	
	static String l6q6(String args) {
		
		String question = "/* Create a list of integers. Use the Streams API to:\n"
				+ " * - Filter out numbers greater than 10.\n"
				+ " * - Square each remaining number.\n"
				+ " * - Find and display the maximum squared value from the list.\n"
				+ " */\n"
				+ "";
			
		return question;
		}
	
	static String l6q7(String args) {
		
		String question = "/* Create a list of sentences. Use the Streams API to:\n"
				+ " * - Count the total number of words across all sentences.\n"
				+ " * - Print the three longest words.\n"
				+ " */\n"
				+ "";
			
		return question;
		}
	
	static String l6q8(String args) {
		
		String question = "/* Create a Map of employee names (String) and their respective salaries (Double).\n"
				+ " * - Use the Streams API to filter out employees with a salary below $50,000.\n"
				+ " * - Sort the remaining employees by their salary in descending order.\n"
				+ " * - Display each employee's name and their salary in the sorted order.\n"
				+ " */\n"
				+ "";
			
		return question;
		}
	
	static String l6q9(String args) {
		
		String question = "/* Write a program that works with a list of nullable strings and performs the following tasks:\n"
				+ " *\n"
				+ " * - Step 1: Create an `ArrayList` of `String` objects that contains some `null` values and some non-null strings.\n"
				+ " *   For example: `[\"apple\", null, \"banana\", \"cherry\", null, \"date\"]`.\n"
				+ " *\n"
				+ " * - Step 2: Use the Streams API to filter out any `null` values and print only the non-null strings.\n"
				+ " *\n"
				+ " * - Step 3: Add a new method called `printUpperCase(String str)` that:\n"
				+ " *       - Checks if the input string `str` is `null`. If it is, print \"Null value found\".\n"
				+ " *       - If `str` is not `null`, convert it to uppercase and print it.\n"
				+ " *\n"
				+ " * - Step 4: Loop through the original list and call `printUpperCase()` on each element, handling any `null` values gracefully.\n"
				+ " *\n"
				+ " * - Step 5: Finally, count how many `null` values were originally in the list and print the count.\n"
				+ " */\n"
				+ "";
		
		return question;
	}

}