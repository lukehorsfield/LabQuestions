public class qLab3 {
	
	public static String[] qlist() {

        String[] lab3 = {
                l3q1(""),
                l3q2(""),
                l3q3(""),
                l3q4(""),
                l3q5(""),
                l3q6(""),
                l3q7(""),
                l3q8(""),
                l3q9(""),
                l3q10(""),
                l3q11("")
        		};
        
        return lab3;	
	}

	
	// Introduction to Arrays Questions 
	
	static String l3q1(String args) {
		
		String question = "// Using an Array {6,8,10,23}, write a program such that the output is\n"
				+ "// the contents of the array:\n"
				+ "\n"
				+ "//Print this using a while loop \n\n"
				+ "// Number 0 is 6\n"
				+ "// Number 1 is 8\n"
				+ "// Number 2 is 10\n"
				+ "// Number 3 is 23 \n"
				+ "\n"
				+ "// Next, calculate and print the sum of the array";
		
		return question;
	}
	static String l3q2(String args) {
		
		String question = "// Create an Array of doubles {11.34, 20.32, 25.23, 1.2, 23.5, 12.2, 31.3, 42.6}\n"
				+ "// Then, using a for loop, output the largest and smallest number in the array";
		
		return question;
}
	static String l3q3(String args) {
			
			String question = "// Create an Array {10,15,12,18,19,22}\n"
					+ "// Print that array out so the output is 'Number 1 is 10', 'Number 2 is 15', etc.\n"
					+ "\n"
					+ "// Then in the same program make these changes to the array:\n"
					+ "// numbers[0] = 100;\n"
					+ "// numbers[1] = numbers[2] + numbers[3];\n"
					+ "// numbers[5] = numbers[5] + 100;\n"
					+ "\n"
					+ "// Then print out the modifications to the array. \n"
					+ "\n"
					+ "// The output should resemble this:\n"
					+ "// Number 0 is 10,  Number 1 is 15,  Number 2 is 12,  Number 3 is 18,  Number 4 is 19,  Number 5 is 22,  \n"
					+ "// After modification:\n"
					+ "// Number 0 is 100, Number 1 is 30, Number 2 is 12, Number 3 is 18, Number 4 is 19, Number 5 is 122,  ";
			
			return question;
	}
	
	static String l3q4(String args) {
		
		String question = "// Here is an Array of integers {10,15,12,18,19,22}\n"
				+ "\n"
				+ "// Using a for loop, modify each number of the array so that it\n"
				+ "// doubles each element in the array\n"
				+ "\n"
				+ "// Print the array before and after modification\n"
				+ "// The output should resemble this:\n"
				+ "// Number 0 is 10, Number 1 is 15, Number 2 is 12, Number 3 is 18, Number 4 is 19, Number 5 is 22, \n"
				+ "// After modification\n"
				+ "// Number 0 is 20, Number 1 is 30, Number 2 is 24, Number 3 is 36, Number 4 is 38, Number 5 is 44, ";
		
		return question;
	}
	
	static String l3q5(String args) {
		
		String question = "// Using arrays, write a program that reads 5 strings from the user then\n"
				+ "// prints the strings in the reverse order they were entered";
		
		return question;
	}
	
	static String l3q6(String args) {
		
		String question = "// Print out this array in reverse order {1,14,12,18,19,22,22,34,13,13,121};\n"
				+ "// Then, modify the program so it prints only every other number";
		
		return question;
	}
	
	static String l3q7(String args) {
		
		String question = "// Create an Array of Strings {\"All\",\"along\",\"the\",\"watchtower\"} and print the\n"
				+ "// output of the array such that it makes a sentence";
		
		return question;
	}
	
	static String l3q8(String args) {
		
		String question = "// Create an Array of 5 user-inputted words.\n"
				+ "// Then, change the program so that it converts each word to uppercase before printing";
		
		return question;
	}
	
	static String l3q9(String args) {
		
		String question = "// Create a program that asks the user for a list of 10 numbers then \n"
				+ "// prints all the odd numbers and then prints all the even numbers in the list.";
		
		return question;
	}
	
	// Advanced Questions
	
	static String l3q10(String args) {
		
		String question = "// Here is a Two-Dimentional Array:\n"
				+ "\n"
				+ "// int temps[][] = {{17, 26, 33,28}, {13, 19, 31,23}, {9,13,25,17} };\n"
				+ "// String[] cities = {\"Manchester\",\"Barcelona\",\"Islamabad\",\"Wuhan\"};\n"
				+ "// String[] months = {\"September\",\"October\",\"November\"};\n"
				+ "\n"
				+ "// Using nested loops, print out the Array\n"
				+ "\n"
				+ "// Next, Alter the program so that after it prints the table it prints \n"
				+ "// the highest temp in each month by traversing the array.\n"
				+ "// 'September ?? October ?? November ??'\n"
				+ " \n"
				+ "// Then, Alter the program so that after it prints the table and \n"
				+ "// the highest temp in month it prints the highest temp in each City.\n"
				+ "// Manchester ?? Barcelona ?? Islamabad ?? Wuhan ??";
				
		return question;
	}
	
	static String l3q11(String args ) {
		
		String question = "// Below ia a Two-Dimentional Array:\n"
				+ "\n"
				+ "// int temps[][] = {{17, 26, 33,28}, {13, 19, 31,23}, {9,13,25,17} };\n"
				+ "// int temps2[][] = {{15, 28, 34,25}, {11, 20, 33,22}, {10,12,28,21} };\n"
				+ "\n"
				+ "// Write a nested for loop that creates a third temp array 'temp3' with the \n"
				+ "// highest value for each month for each city from the two tables.";
		
		return question;
	}
}
