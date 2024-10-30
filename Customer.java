package bank_pac;

public abstract class Customer extends Bank {
	public void Accont_details() {
		System.out.println("***********Your Account Details is: ********************");
		System.out.println("Your Name : "+UName);
		System.out.println("Your Ph.No : "+UPh_No);
	}
}
