
public class qLab4 {

	public static String[] qlist() {

        String[] lab4 = {
                l4q1(""),
                l4q2(""),
                l4q3("")
        		};
        
        return lab4;	
	}
	
	// Introduction to Classes and Objects Questions 
	
	static String l4q1(String args) {
		
		String question = "// Create an object 'Dog' that takes three parameters: name, age, sound\n"
				+ "// Create the object in the 'Dog' file, pass through the parameters in the 'Main' file \n"
				+ "// Create a method called 'describe' that introduces the dog and its parameters";
		
		return question;
	}
	
static String l4q2(String args) {
		
		String question = "//PART 1\\n "
				+ "\n"
				+ "// Create an object called BankAccount, with two accounts: account1 and account2\n"
				+ "// Create methods: getBalance, deposit and withdraw\n"
				+ "\n"
				+ "// account 1 has deposited 1000 and withdrawn 50\n"
				+ "// account 2 has deposited 2000 and withdrawn 900\n"
				+ "// Print the balance of both the accounts\n"
				+ "\n"
				+ "// PART 2\n"
				+ "\n"
				+ "// Then, Add a Constructor to the BankAccount class such that you can create a BankAccount with an account number.\n"
				+ "// BankAccount account1 = new BankAccount(1);\n"
				+ "\n"
				+ "// Next, use a method, displayBalance(), to display the account balance message for each account.\n";
		
		return question;
	}
	

static String l4q3(String args) {
	
	String question = "// For this you will need two classes: Person and Main\n"
			+ "\n"
			+ "// Create a person object and constructor so that you can input:\n"
			+ "// 		Person Jack = new Person(\"Jack\", 20, \"Painter\");\n"
			+ "//    and it will return\n"
			+ "//		Hello, I am Jack, a 20 year old Painter\n"
			+ "\n"
			+ "// Do this using a method called introduction\n";
	
	return question;
}

	
}
