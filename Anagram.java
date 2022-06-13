import java.util.*;
import java.io.*;

public class Anagram {

	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the length of your strings: ");
		int stringLength = scanner.nextInt();
		String one = "salesmen";
		String two = "nameless";
		char[] wordOne = new char[stringLength];
		char[] wordTwo = new char[stringLength];
		System.out.print("Enter your first word: " );
		scanner.nextLine();
		String firstWord = scanner.nextLine();
		System.out.print("Enter your second word: " );
		String secondWord = scanner.nextLine();
		
		while(firstWord.length() != stringLength || secondWord.length() != stringLength) { // firstWord and secondWord must both have to be the same length that the user entered at the beginning
			System.out.print("One or more of your words did not match the string length you entered, try again.");
			System.out.println();
			System.out.print("Enter your first word: " );
			firstWord = scanner.nextLine();
			System.out.print("Enter your second word: " );
			secondWord = scanner.nextLine();
		}
		
		for(int a = 0; a < stringLength; a++) { // Puts firstWord and secondWord into their own char array
			wordOne[a] = firstWord.charAt(a);
			wordTwo[a] = secondWord.charAt(a);
		}
		
		Arrays.sort(wordOne); // Puts the array in alphabetical order 
		Arrays.sort(wordTwo);
		System.out.println();
		Stack<Character> stack = new Stack<Character>();

		for(int j = 0; j < stringLength; j++){ // Puts string one into a stack
			stack.push(firstWord.charAt(j));
		}
		for(int i = 0; i < stringLength  ; i++) { // Runs through the length of the stringLengths - 1
			if(wordOne[i]==wordTwo[i]) { // Checks to see if every character is the same in each word
					stack.pop();
					System.out.println(stack);
					if(stack.isEmpty()) { // If the stack is empty when the program is finished then they are anagrams
							System.out.println(firstWord + " and " + secondWord + " ARE anagrams!");
					}
			}
					else {				//If the stack is not empty when the program is finished then they are not anagrams
						System.out.println(firstWord + " and " + secondWord + " ARE NOT anagrams!");
						break;
				     }
		}	
		
	}
			
}
		
	



