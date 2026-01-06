import java.util.Scanner;

public class TwoPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);/*scanner*/
        /*input numbers*/
        System.out.print("Input num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Input num2: ");
        int num2 = scanner.nextInt();
        System.out.print("Input num3: ");
        int num3 = scanner.nextInt();
        System.out.print("Input num4: ");
        int num4 = scanner.nextInt();
        System.out.println(" ");
        
        /*check for pairs*/
        if (num1 == num2 || num1 == num3 || num1 == num4||
        num2 == num1 || num2 == num3 || num2 == num4||
        num3 == num1|| num3 == num2|| num3 ==num4||
        num4 == num1 || num4 == num2|| num4 == num3){
            System.out.println("Two pairs");
        }
        else{
            System.out.println("No two pairs");
        }
	}
}