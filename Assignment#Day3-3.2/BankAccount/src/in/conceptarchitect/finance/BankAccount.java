package in.conceptarchitect.finance;

public class BankAccount {
	
	int accountNumber;
	String password;
	double balance;
	double interestRate;

	
	public int getAccountNumber() {
		return accountNumber;
	}

	//account number can't be changed
	//public void setAccountNumber(int accountNumber) {this.accountNumber = accountNumber;}

//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}

	
	public double getBalance() {
		return balance;
	}

	
//	public double getInterestRate() {
//		return interestRate;
//	}

//	public static void setInterestRate(double interestRate) {
//		interestRate = interestRate;
//	}
//	

	//should there be a getPassword and setPassword

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = salt(password);
	}

	

private String salt(String password) {
		
		String salted="";
		
		for(int i=0;i<password.length();i++) {
			int ch= (int) password.charAt(i);
			salted+=Integer.toHexString(ch);
		}
		
		return salted;
	}
	
	


//	public BankAccount(int accountNumber, String password, double amount,double interestRate) {
//		
//		B.balance=amount; //this is optional here as there is a single balance in the context	
//		setPassword(password);
//		Bank.accountNumber=accountNumber;
//		Bank.interestRate=interestRate;
//		
//	}
	
	public void show() {
		System.out.println("account number\t"+accountNumber);
		System.out.println("password  decoded   \t"+password);
		System.out.println("balance      \t"+balance);
		
		
	}

	public boolean deposit(double amount) {
		// TODO Auto-generated method stub
		if(amount>0) {
			balance+=amount;
			return false;
		} else {
			return true;
		}
	}

	public boolean withdraw(double amount, String password) {
		// TODO Auto-generated method stub
		if(amount <=0) {
			return false;
		}
		if (amount>balance) {
			return false;
		} 
		if (!this.password.equals(password))
			return false;
		else {
			
			balance-=amount;
			return true;
		}
	}
	
	
	
	public void creditInterest(double balance,double interestRate) {
		balance+=(balance*interestRate/1200);
	}



}