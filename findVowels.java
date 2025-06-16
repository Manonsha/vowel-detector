package projectUpload;

import java.util.Scanner;

public class findVowels {
	
	public static void main(String []args) {
	
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the alphabet to check whether it is vowel or consonent : ");
		String alphabet=sc.nextLine();
		
	switch(alphabet){
	case "a":
		
	case "e":
		
	case "i":
		
	case "o":
		
	case "u":
		
		System.out.println("This is vowel ");
		break;	
		
	default:
		System.out.println("This is consonent");
	}
}
}