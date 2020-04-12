package Abstractclass;

public class SBI extends Bank {

	void getInterest()
	{
		System.out.println("Interest is 7.5%");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b=new SBI();
		b.getInterest();
	}

}
