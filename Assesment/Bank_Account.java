package myproject;

import java.util.Scanner;

public class BankAccount {
	private long AccountNumber;
	private String Name;
	private String Password;
	
	private long Balance;
	private int InterestRate;
	Scanner scan=new Scanner(System.in);
	public void CreateAccount()
	{
		
		System.out.println("Enter the Bank Account Number :");
		AccountNumber=scan.nextLong();
		System.out.println("Enter the Name of the Person :");
		Name=scan.next();
		System.out.println("Enter the Password :");
		Password=scan.next();
		System.out.println("Enter the balance :");
		Balance=scan.nextLong();
		System.out.println("Enter the Interest Rate");
		InterestRate=scan.nextInt();
		
	}
		
	public void Deposit()
	{
		System.out.println("Enter the Account number to deposit");
		long acc=scan.nextLong();
		if(AccountNumber==acc)
		{
			System.out.println("Enter the amount to be deposit :");
			long Amount=scan.nextLong();
			
			if(Amount<=0)
			{
				System.out.println("Should not deposit amount.Please deposit some other Amount!!!");
			}
			else
			{
				System.out.println("Successfully deposited " +(Balance+Amount)+" rupees");
			}
		}
		else
		{
			System.out.println("Invalid input!!!! Please enter the correct Account number!!!");
		}
		
	}
	
	public void Withdraw()
	{
		
		String psw;
		
		System.out.println("Enter the password :");
		psw=scan.next();
		if(Password.equals(psw))
		{
			System.out.println("Enter the amount to be withdraw :");
			long Amount=scan.nextLong();
			if(Amount<=0)
			{
				System.out.println("Should not withdraw amount.Please withdraw some other Amount!!!");
			}
			else if(Amount>Balance)
			{
				System.out.println("Less Balance..Please withdraw some other Amount!!!");
			}
			else 
			{
				System.out.println("Successfully withdraw!! Available balance is " +(Balance-Amount)+" rupees");
			}
			
		}
		else
		{
			System.out.println("Invalid Password!!!!");
		}
		
		
	}
	public void CreditInterest()
	{
		System.out.println("Enter the Account number");
		long acc=scan.nextLong();
		if(AccountNumber==acc)
		{
			Balance+=(Balance*InterestRate/1200);
			System.out.println("Credited Interest is :"+Balance);
			
		}
		else
		{
			System.out.println("Invalid input!!!! Please enter the correct Account number!!!");
		}
			
	}
	public void DisplayDetails()
	{
		System.out.println("Enter the Account number\n");
		long acc=scan.nextLong();
		if(AccountNumber==acc)
		{
			System.out.println("-----Details-----");
			System.out.println("\nAccount Number :"+Account_Number+"\nName :"+Name+"\nBalance :"+Balance+"\nInterest rate :"+Interest_Rate);
			
		}
		else
		{
			System.out.println("Invalid input!!!! Please enter the correct Account number!!!");
		}
		
}
	
	public static void main(String[] args)
	{
		BankAccount b1=new BankAccount();
		
		Scanner scan=new Scanner(System.in);
		
		int ch;
		do {
			System.out.println("Enter your choice");
			System.out.println("\n1:Create Account\n 2:Deposit Amount\n 3:Withdraw Amount\n 4:Credit Interest\n 5:Display_Deails\n");
			ch=scan.nextInt();
			switch(ch)
			{
			case 1:
				b1.CreateAccount();
				break;
			
			case 2:
				b1.Deposit();
				break;
				
			case 3:
				b1.Withdraw();
				break;
			
			case 4:
				b1.CreditInterest();
				break;
			
			case 5:	
				b1.DisplayDetails();
				break;
				
			case 6:
				break;
			}
		}
		while(ch!=6);
		
		
	}
		
	
}
