package in.conceptarchitect.financeapp;

import java.util.Scanner;

import in.conceptarchitect.finance.BankAccount;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String password="p@ss";
		Scanner scan=new Scanner(System.in);
		BankAccount atm=new BankAccount(777,"Vemulaiah",password,18000,18);	
		
		
		
		int ch;
		do {
			System.out.println("Enter your choice");
			System.out.println("\n1. Display Account Details\n2. Deposit \n3. Withdraw \n4. Credit Interest\n5. Change Password\n6. Exit");
			ch=scan.nextInt();
			switch(ch)
			{
			case 1:
				atm.show();
				break;
			
			case 2:
				atm.deposit(5000);
				break;
				
			case 3:
				atm.withdraw(1000,"p@ss");
				break;
			
			case 4:
				atm.creditInterest();
				break;
				
				
			case 5: atm.changePassword();
					break;
					
			case 6: return;

			}
		}
		while(ch!=6);		
		
	}

}
