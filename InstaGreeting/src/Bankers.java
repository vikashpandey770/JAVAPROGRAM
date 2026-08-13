import java.util.Scanner;

public class Bankers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("**************************************");
		System.out.println("enter account number:");
		int accNo=sc.nextInt();
		System.out.println("******************************");
		System.out.println("Enter customer name:");
		System.out.println("**********************************");
		String n=sc.next();
		System.out.println("*****************************");
		System.out.println("Enter Initial balance:");
		double b=sc.nextDouble();
		AccountDatas c=new AccountDatas(accNo, n, b);
		while(true) {
			System.out.println("********************************");
			System.out.println("1.Deposite");
			System.out.println("2. Withdraw");
			System.out.println("3.Check Balance");
			System.out.println("4.Exit");
			System.out.println("**********************************");
			System.out.println("enter your choice: ");
			int choice=sc.nextInt();
			
			if(choice==1) {
				System.out.println("enter deposite amount:");
				double amount=sc.nextDouble();
				c.diposite(amount);
			}
			
			else if(choice ==2) {
				System.out.println("Enter withdraw amount:");
				double amount=sc.nextDouble();
				try {
					c.withdraw(amount);
				}catch(BankBalanceChecker e) {
					System.out.println("sorry you need another"+e.getAmount());
				}
			}
			else if(choice==3) {
				c.checkBalance();
			}
			else if(choice==4) {
				System.out.println("ok close");
				System.out.println("*************");
				break;
			}
		}
	}
}
