/*	Name: Denise Tran
 * 	Bronco ID: 011913135
 * 	Sources of Help: 
 */
import java.util.Scanner;

public class Palindromes {
	public static void main(String[] args) {

		String reverse= "";
		String word;
		String word1;
		int i;
		String loop = "";
		String loop1;
		
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Enter the string to evaluate for palindromes: ");
			word1 = input.next();	    		
			word = word1.toLowerCase(); //change input to lower case
			
			for (i = word.length() - 1; i >= 0; i--)
				reverse += word.charAt(i);
			
			if(reverse.equalsIgnoreCase(word)) {
				System.out.println(word + " is a palindrome");
			
			}else {
				System.out.println(word + " is not a palindrome");
			}
			//prompt for y or n input
			System.out.println("Do you want to try again (Y or N)? ");
			//Scanner for yes or no input
			loop1 = input.next();
			loop = loop1.toLowerCase();
			
		}while(loop.equals("y") || loop.equals("yes"));
				System.out.println("Thanks for playing!");
			

	}
}

