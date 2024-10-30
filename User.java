package bank_pac;

public class User {

	public static void main(String[] args) {
		Bank_interface b=new Atm();
		b.Create_account();
		b.Accont_details();
		b.deposit();
		b.Withdraw();
		b.Check_bal();
		b.Pin_change();
		
	}

}
