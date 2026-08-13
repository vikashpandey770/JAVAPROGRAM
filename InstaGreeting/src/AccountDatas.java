
public class AccountDatas {

	int accNo;
	String name;
	double balance;
	
	public  AccountDatas(int a,String n,double b) {
		a=accNo;
		n=name;
		b=balance;
		System.out.println("hello ," +n+", your account is open with"+b+"Rs.");
		
	}
	void diposite(double amount) {
		balance+=amount;
	}
	void withdraw(double amount)throws BankBalanceChecker {
		
		if(amount<=balance) {
			balance-=amount;
		}
		else {	
			throw new BankBalanceChecker(amount-balance);
		}
	}
	void checkBalance() {
		System.out.println("current balance:"+balance);
	}
}
