import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	    System.out.print("Input the value of num1: ");
	    int num1 = input.nextInt();
	    System.out.print("Input the value of num2: ");
		int num2 = input.nextInt();
		
		int temp = num1;
		num1 = num2;
		num2 = temp;
		
		System.out.println("The new value of num1 is "+ num1);
		System.out.println("The new value of num2 is "+ num2);
	}
}