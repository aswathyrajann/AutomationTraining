package Abstractclass;

public class HDFC extends Bank {

	void getInterest()
	{
		System.out.println("Interest is 7%");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank b=new HDFC();
		b.getInterest();
	}

}
