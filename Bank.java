package bank_pac;

import java.util.Scanner;

public abstract class Bank implements Bank_interface {
	String UName;
	int UPsw;
	String UPh_No;
	////////////////////////////////////////////////////////
	private String a;
	public String getA() {
		return a;
	}
	public void setA(String a) {
		this.a = a;
	}
	///////////////////////////////////////////////////////
	Scanner scan= new Scanner(System.in);
	public void Greetings(){
		System.out.println("Hi.....Sir/Madam..Welcome");
	}
	public void Create_account() {
		System.out.println("------Enter Details--------");
		
		System.out.println("1.Enter your name");
		String Name=scan.next();
		UName=Name;
		this.UName=UName;
		
		System.out.println("2.Enter Your Phone_no");
		String Ph_No=scan.next();
		UPh_No=Ph_No;
		this.UPh_No=UPh_No;
		
		System.out.println("------------Create a Password--------- \n-----------Enter a 4 Digits For Password--------------");
	
		int Psw=scan.nextInt();
		System.out.println("****************Password Created succsefully****************");
		UPsw=Psw;
		this.UPsw=UPsw;
		System.out.println("****************Account Created succssfully******************");		
	}
	
	

}
