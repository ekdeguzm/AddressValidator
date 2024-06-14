import java.util.Scanner;  // Import the Scanner class

public class AddressValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scnr = new Scanner(System.in);
		
		
	    System.out.println("Welcome to the address validator!");
	    System.out.println("Enter your street number and name: ");
	    
	    String address = scnr.nextLine();
	    
	    System.out.println("Enter the city: ");
	    
	    String city = scnr.nextLine();
	    
	    String addressNumber = address.substring(0, address.indexOf(' '));
	    
	    // get rest of address after number
	    String addressName = address.substring(addressNumber.length() + 1, address.length());
	    
	    boolean isNumeric = true; 
	    boolean addressValid = true;
	    
	    // check if address starts with digit and is at leased three characters long
	    if ((!Character.isDigit(addressNumber.charAt(0))) && (addressName.length() < 3)) {
            isNumeric = false;
            addressValid = false;
         }
	    else {
            isNumeric = true;
            addressValid = true;
	    }
	    
	    // check if city is empty
	    if (city.equals("") || city.equals(" ")) { // Empty string check
            System.out.println("Invalid: must input city.");
	    }
	    else {
	    	System.out.println("Great city!");
	    }
	    
		
		// Enter the city:
		
		// Enter the 5-digit zip code:
		
		// Valid address. We can ship quickly to you!
	}

}
