package bank_pac;

public class Atm extends Customer {
	int Current_bal;
	public  void Pin_change() {
		System.out.println("----------To Create a New Pin Generation----------");
		System.out.println(" Enter Your Phone_no");
		String Ph_No=scan.next();
		UPh_No=Ph_No;
		System.out.println("Create a Password \nEnter a 4 Digits For Password");
		int Psw=scan.nextInt();
		System.out.println("*******Password Created succsefully********");
		UPsw=Psw;	
	}
	
	
	public void Withdraw() {
		System.out.println("----------Withdraw amount-----------");
		System.out.println("Enter Ammount to WithDraw");
		int Withdraw_amount=scan.nextInt(); //add paswarod condition to withdrwa money
		System.out.println("Enter your pin to with Draw Money");
		int WPsw=scan.nextInt();
		if (UPsw==WPsw) {
			if (Current_bal>Withdraw_amount) {
				Current_bal-=Withdraw_amount;
				System.out.println(Withdraw_amount+" Amount is Withdraw Successfully");
				System.out.println("Your balance is : "+Current_bal);
				this.Current_bal=Current_bal;///////////////////////////////
			}
			else {
				System.out.println("Your balance is Not sufficient to withdraw");
			}
			
		}
		else {
			System.out.println("Incorrect pin Try Again");
		}
		
		
	}
	public void Check_bal() {
		System.out.println("--------------To check Your current balance---------------");
		System.out.println("**********Enter Your Pin to Check Current Balance of Your Account********");
		int WPsw=scan.nextInt();
		if (UPsw==WPsw) {
				System.out.println("Your balance is : "+Current_bal);
				this.Current_bal+=Current_bal;/////////////////////////////////
		}
		else {
			System.out.println("Incorrect pin Try Again");
		}
	}
	public void deposit() {
		System.out.println("-----------To deposit Your money----------------");
		System.out.println("******Enter Amount to be Deposit in Your Account*********");
		int Deposit_money = scan.nextInt();	
		System.out.println("Enter your pin to Deposit Money");
		int WPsw=scan.nextInt();
		if (UPsw==WPsw) {
			Current_bal+=Deposit_money;
			System.out.println(Deposit_money+" Amount is Deposited Successfully");
			System.out.println("Your balance is : "+Current_bal);		
	}
	else {
		System.out.println("Incorrect pin Try Again");
	}
		
	}

}
