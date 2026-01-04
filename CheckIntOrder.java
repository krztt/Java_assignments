import java.util.Scanner;

public class CheckIntOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);/*scanner*/
        /*input numbers*/
        System.out.print("Input num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Input num2: ");
        int num2 = scanner.nextInt();
        System.out.print("Input num3: ");
        int num3 = scanner.nextInt();
        System.out.println(" ");
        /*check order*/
        if (num1<num2 && num2 < num3){
            System.out.println("Numbers in order");
        }else if(num1>num2 && num2 > num3){
            System.out.println("Numbers in order");
        }
        else{
            System.out.println("Numbers not in order");
        }
	}
}