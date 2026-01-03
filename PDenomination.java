import java.util.Scanner;
public class PDenomination {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);/*scanner*/
		/*prompt the user of the amount*/
		System.out.print("Input the Amount: ");
		int amount = scanner.nextInt();
		/*set variable for each type of bill*/
		int peso1000 = 0;
		int peso500 = 0;
		int peso200 = 0;
		int peso100= 0;
		int peso50 = 0;
		int peso20 =0;
	    int peso10 = 0;
		int peso5 =0;
		int peso1=0;
		/*breaks the money into bills*/
		while(amount != 0){
		    if(amount >= 1000){
		        peso1000++;
		       amount = amount - 1000; 
			}  
		     else if(amount >= 500){
		         peso500 ++;
		       amount =   amount - 500;		      
		    }
		     else if(amount>=200){
		         peso200 ++;
		       amount =   amount - 200;
		    }
		     else if(amount >= 100){
		         peso100++;
		      amount =    amount - 100;
		    }
		     else if(amount >= 50){
		         peso50++;
		        amount =  amount -50;
		    }
		     else if(amount >= 20){
		         peso20++;
		      amount =    amount - 20;
		    }
		     else if(amount >= 10){
		         peso10++;
		      amount =    amount - 10;
		     }
		     else if(amount >= 5){
		         peso5++;
		        amount =  amount - 5;
		     }
		     else if(amount >= 1){
		         peso1++;
		        amount =  amount - 1;
		     }		         		         
		}
		/*print the amount of bill it takes to complete the amount*/
		System.out.println("1000 peso bill: " + peso1000);
		System.out.println("500 peso bill: "+ peso500);
		System.out.println("200 peso bill: "+ peso200);	
		System.out.println("100 peso bill: "+ peso100);
		System.out.println("50 peso bill: "+ peso50);
		System.out.println("20 peso bill: "+ peso20);
		System.out.println("10 peso bill: "+ peso10);
		System.out.println("5 peso bill: "+ peso5);
		System.out.println("1 peso bill: "+ peso1);
	}
}