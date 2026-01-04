import java.util.Scanner;

public class ATMMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);/*scanner*/
        /*main loop*/
        int balance = 100000;
        while(true || balance > 0) {
            System.out.println("WELCOME TO CSPC ATM MACHINE");
            System.out.println("BALANCE OF " + balance + " PESOS!" );
            /*prompt the user for the withdraw*/
            System.out.print("Input the amount: ");
            int withdraw = scanner.nextInt();
            if(withdraw > balance){
                System.out.println("Insufficient balance");
            }
            else{
                balance = balance - withdraw;
            
                System.out.println("THANK YOU FOR WITHDRAWING "+ withdraw + " PESOS!");
            }
            /*checks your balance*/
            if (balance <= 0){
                System.out.println("You have no balance left");
                break;
            }
            /* exit the program*/
            System.out.print("exit? (y/n): ");
            String choice = scanner.next();
            choice = choice.toUpperCase();
            
            
            if (choice.equalsIgnoreCase("Y")){
                break;
                
            }
            else if (choice.equalsIgnoreCase("N")){
                ;
             
            }                                    
        }        
	}
}