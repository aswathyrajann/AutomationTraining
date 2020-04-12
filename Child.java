package Abstractclass;

public class Child implements Parent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child c=new Child();
		c.height();
		c.nature();
		System.out.println(c.a);
		System.out.println(c.b);
	}

	@Override
	public void height() {
		System.out.println("Height implemented");
		
	}

	@Override
	public void nature() {
		// TODO Auto-generated method stub
		System.out.println("nature implemented");
	}

}
