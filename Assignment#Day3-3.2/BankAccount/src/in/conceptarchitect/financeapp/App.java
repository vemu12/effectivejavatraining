package in.conceptarchitect.financeapp;

import in.conceptarchitect.finance.ATM;
import in.conceptarchitect.finance.Bank;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank B=new Bank(777,"pa@ss",1500);

		ATM A=new ATM();
		
		A.withdraw(777,"p@ss",1500);
		A.Deposit(777, 5000);
		
		A.changePassword("p@ss","Vivek@");
		

		
		
	}

}