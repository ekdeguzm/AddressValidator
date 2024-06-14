import java.util.Scanner;  // Import the Scanner class

public class AddressValidator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner scnr = new Scanner(System.in);
	     
	    boolean fastShip = true;
	    boolean regularShip = true;
		
	    System.out.println("Welcome to the address validator!");
	    System.out.println("Enter your street number and name: ");
	    
	    String address = scnr.nextLine();
	    
	    char firstChar = address.charAt(0);
	    
	    // if firstChar is not a digit, must start with number
	    // if not longer that 3 characters, must be longer
	    // must have space between digit and number
	    if ((!Character.isDigit(firstChar))) {
	    	System.out.println("Invalid street address: must start with a digit.");
	    	return;
	    }
	    else if ((address.length() < 3)) {
	    	System.out.println("Invalid street address: must be at three or more characters long.");
	    	return;
	    }
	    else if (address.indexOf(' ') == -1) {
	    	System.out.println("Invalid street address: must have space between number and name.");
	    	return;
	    }
    
	   
	    System.out.println("Enter the city: ");
	    
	    String city = scnr.nextLine();
	    
	    // check validity of city
	    if (city.equals("") || city.equals(" ")) { // Empty string check
            System.out.println("Invalid: must input city.");
            return;
	    }

	    
	    System.out.println("Enter the two-letter state abbreviation: ");
	    
	    String state = scnr.nextLine();
	    
	    state = state.toUpperCase();
	    
	    if (state.length() == 2) {
	    	switch (state) {
	         case "CT":
	         case "ME":
	         case "MA":
	         case "NH":
	         case "RI":
	         case "VT": 	
	        	 regularShip = false;
	             break;
	             
	         case "NY":
	         case "NJ":
	         case "PA":
	        	 fastShip = false;	       
	        	 break;

	         default:
	             // Valid address, but we do not ship to you.
	        	 regularShip = false;
	        	 fastShip = false;	
	        	 break;
	    	}
	    } else {
	    	System.out.println("Invalid state: must enter two letters.");
	    	return;
	    }
	    
	    
        System.out.println("Enter a 5-digit zip code: ");
        
        String zipCode = scnr.nextLine();

        // check if the zip code has a length of 5 and if all are digits
        if (zipCode.length() != 5 || 
            !Character.isDigit(zipCode.charAt(0)) || 
            !Character.isDigit(zipCode.charAt(1)) || 
            !Character.isDigit(zipCode.charAt(2)) || 
            !Character.isDigit(zipCode.charAt(3)) || 
            !Character.isDigit(zipCode.charAt(4))) {
            System.out.println("Invalid zip code: enter five digits.");
            return;
        }

      
        // check shipment speed states
        if (fastShip == true) {
        	System.out.println("Valid address. We can ship quickly to you!");
        } 
        else if (regularShip == true) {
        	System.out.println("Valid address. We can ship to you!");
        }
        else {
        	System.out.println("Valid address, but we dont ship to you.");
        }
        
        
	}
}
