package in.conceptarchitect.finance;

public class Bank {
	
	BankAccount BA=new BankAccount();
	
	
	int accountNumber;
	int accountCount=0;
	String name;
	String password;
	double balance;
	static double interestRate=10;
	
	public Bank(int accountNumber,String password,double balance) {
		this.accountNumber=accountNumber;
		this.password=password;
		this.balance=balance;
		
	}
	
	public void withdraw(int account,String Password,double amount) {
		if(account==accountNumber) {
			
			BA.withdraw(amount, password);
		}
		else {
			System.out.println("enter vald AccountNumber");
		}
		
		
	}
	
	public void Deposit(int account,double amount) {
		if(account==accountNumber) {
			BA.deposit(amount);
			
		}
		else {
			System.out.println("Enter valid AccountNumber");
		}
	}
	public boolean authenticate(String password) {
		return this.password.equals(salt(password));
	}
	
private String salt(String password) {
		
		String salted="";
		
		for(int i=0;i<password.length();i++) {
			int ch= (int) password.charAt(i);
			salted+=Integer.toHexString(ch);
		}
		
		return salted;
	}
	


	public void changePassword(String oldPassword, String newPassword) {
		if(authenticate(oldPassword))
			setPassword(newPassword);
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

//	public String getPassword() {
//		return password;
//	}

	public void setPassword(String password) {
		this.password = password;
	}

	public double getBalance() {
		return balance;
	}

	public static double getInterestRate() {
		return interestRate;
	}

//	public static void setInterestRate(double interestRate) {
//		Bank.interestRate = interestRate;
//	}
//
//	public int setAccountNumber(int accountCount) {
//		accountCount+=accountCount;
//		this.accountNumber = accountCount;
//		
//		return accountNumber;
//	}
	
	



	
	
}