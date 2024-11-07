
public class qLab5 {
	
	public static String[] qlist() {

        String[] lab5 = {
                l5q1(""),
                l5q2(""),
                l5q3(""),
                l5q4(""),
                l5q5(""),
                l5q6("")
        		};
        
        return lab5;	
	}
	
		static String l5q1(String args) {
			
			String question = "// Create a program that prints 10 random numbers between 1 and 5 inclusive, \n"
					+ "// make sure that the program prints the number as a word. e.g 'one', 'two'";
			
			return question;
		}
		
		static String l5q2(String args) {
			
			String question = "/* Design and implement a program that:\n"
					+ "\n"
					+ "Creates an Animal class with subclasses for Cat, Dog, and Cow, each implementing a unique speak function.\n"
					+ "Generates an array called zoo with a random selection of 10 Animal objects (cats, dogs, and cows).\n"
					+ "Adds an age attribute to the Animal class and a message method that formats and outputs the index, type, age, and sound of each Animal in zoo. */";
			
			return question;
		}
	
		static String l5q3(String args) {
		
			String question = "/* Design and implement a program that:\n"
					+ "\n"
					+ "Creates an abstract Device class with subclasses for Phone, Laptop, and Tablet. Each subclass should override a powerOn method to print a unique message indicating the device is turning on.\n"
					+ "Adds a Device array called inventory and fills it with a random selection of 10 Phone, Laptop, and Tablet objects.\n"
					+ "Add an ownerName attribute to the Device class and a deviceInfo method to output the device type, owner’s name, and power-on message in a formatted string.\n"
					+ "Create a new subclass, SmartWatch, and add it to the inventory, updating the logic to randomly select from four types of devices. */";
		
			return question;
	}
	
		static String l5q4(String args) {
		
			String question = "/* Design and implement a program that:\n"
					+ "\n"
					+ "Creates an Employee superclass with subclasses Manager, Developer, and Intern. Each subclass should override a work method to print a unique message about the tasks they perform.\n"
					+ "Creates a method generateTeam to populate an Employee array called team with a random selection of 10 employees from the three subclasses.\n"
					+ "Adds a yearsOfExperience attribute in the Employee class and a showDetails method that outputs each employee’s role, years of experience, and the task they perform.\n"
					+ "Add a Contractor class that implements a new Employee interface. Modify the program so all classes conform to the interface, adjusting generateTeam to include Contractor as part of the random selection. */"
					+ "";
		
			return question;
	}

		static String l5q5(String args) {
			
			String question = "/* Design and implement a payment processing system that:\n"
					+ "\n"
					+ "Creates a PaymentMethod interface with methods processPayment and refund.\n"
					+ "Implements PaymentMethod in three classes: CreditCard, PayPal, and BankTransfer. Each class should provide a unique implementation of processPayment and refund.\n"
					+ "Creates a Transaction class with a method that accepts a PaymentMethod object and uses it to process a payment.\n"
					+ "Adds a method to Transaction that takes an array of PaymentMethod objects and simulates processing payments in sequence, printing the type of payment method used and the result of each transaction. */"
					+ "";
			
			return question;
		}

		static String l5q6(String args) {
			
			String question = "/* Design and implement a Library Management System that:\n"
					+ "\n"
					+ "Creates a Book class with attributes title, author, and yearPublished.\n"
					+ "Use private visibility for each attribute.\n"
					+ "\n"
					+ "Implement public getters and setters for each attribute, ensuring that:\n"
					+ "title and author cannot be empty.\n"
					+ "yearPublished must be a reasonable year (e.g., between 1500 and the current year).\n"
					+ "\n"
					+ "In the Library class:\n"
					+ "Create an ArrayList<Book> called catalog to store Book objects.\n"
					+ "Implement a addBook method that accepts a Book object and adds it to catalog.\n"
					+ "Add a removeBookByTitle method that takes a title as a parameter and removes the first Book with that title from the catalog.\n"
					+ "Implement a displayCatalog method that prints each book's title, author, and year published.\n"
					+ "\n"
					+ "Create a LibraryApp class with a main method:\n"
					+ "Instantiate a Library object.\n"
					+ "Add several Book objects to the library, both directly and via user input.\n"
					+ "Display the catalog, then allow the user to remove a book by title and display the updated catalog. */"
					+ "";
			
			return question;
		}

}
