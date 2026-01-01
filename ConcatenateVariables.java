import java.util.Scanner;

public class ConcatenateVariables{
	public static void main(String[] args){
		//input variables
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an adjective: " );
		String adj1 = input.nextLine();
		System.out.print("Enter the name of an outdoor game: ");
		String outdoorgame = input.nextLine();
		System.out.print("Enter another adjective: ");
		String adj2 = input.nextLine();
		System.out.print("Enter the name of a friend: ");
		String name = input.nextLine();
		System.out.print("Enter a verb ending in ing: " );
		String ingverb = input.nextLine();
		System.out.print("Enter one more adjective: " );
		String adj3 = input.nextLine();
		
	//print the paragraph
	System.out.println("It was a " + adj1 + " summer day at the beach. My friends and I were in the water playing " + outdoorgame + ". As a beautiful wave came closer, my friend " + name + " yelled, \"Look! There's a jellyfish " + ingverb + "! \" As we got closer, we saw that the jellyfish was indeed " + ingverb + "! " + name + " ran out of the water and onto the sand. " + name + " was afraid of " + ingverb + " jellyfish. The rest of us stayed in the water playing " + outdoorgame + " because " + ingverb + " jellyfish are " + adj3 );
	}
}