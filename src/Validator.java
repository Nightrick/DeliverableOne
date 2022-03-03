import java.util.Scanner;

public class Validator {
	
	public static boolean capitalCheck (String str) {
		char c; 
		boolean containsUpperCase = false;
		boolean containsLowerCase = false;
		
		for(int i = 0; i < str.length(); i++) {
			c = str.charAt(i);
			if(Character.isUpperCase(c)) {
				containsUpperCase = true;
			} 
			else if (Character.isLowerCase(c)) {
				containsLowerCase = true;
		    }
			if(containsUpperCase && containsLowerCase) {
				return true;
	        }
			}
		return false;
		}
		

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Hello! Please create a new password that meets the following criteria:");
		System.out.println("* Must contain at least one lowercase letter");
		System.out.println("* Must contain at least one uppercase letter");
		System.out.println("* Must contain a minimum of 7 characters");
		System.out.println("* Must contain a maximum of 12 characters");
		System.out.println("* Must contain an exclamation point: !");
		System.out.println("\n");
		System.out.print("Enter your new password: ");
        
		String password = scnr.next();
		
		
		
		if(password.length() <= 12 && password.length() >= 7) {
			if(password.contains("!")) {
				if(capitalCheck(password) == true) {
					System.out.println("Password valid and accepted");
				} else {
					System.out.println("Error");
				}
				
					} else {
						System.out.println("Error");
					}
				}
		else {
			System.out.println("Error");
		}
		
			}
}
