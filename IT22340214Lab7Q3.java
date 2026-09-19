import java.util.Scanner;
    public class IT22340214Lab7Q3{
	     public static void main(String[] args){
		     Scanner input= new Scanner(System.in);
			 
			 for(int customer=1;customer<=5;customer++){
			    System.out.println("Customer "+customer);
				
				System.out.print("Enter total bill amount:");
				double billAmount= input.nextDouble();
				
				System.out.print("Enter mode of payment(C for cash,O for other):");
				char payMode = input.next().charAt(0);
				
				double discount = 0;
				
				if(payMode == 'C' ){
				  discount = billAmount*0.05;
				  billAmount = billAmount-discount;
				  System.out.println("Discount is:" +discount);
				}else if(payMode == 'O'){
				  System.out.println("No discount applicable");
				}else{
				  System.out.println("Payment Mode Is Not valid");
				  }
				 System.out.println("Amount to be paid:"+billAmount);
				  System.out.println();
				 }
			}
	}