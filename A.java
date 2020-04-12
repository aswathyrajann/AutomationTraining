package Abstractclass;

public class A implements Sample{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		A a=new A();
		a.get();
		a.set();
	}

	@Override
	public void get() {
		System.out.println("Got the values");
		
	}

	@Override
	public void set() {
		// TODO Auto-generated method stub
		System.out.println("Values displayed");
	}

}
