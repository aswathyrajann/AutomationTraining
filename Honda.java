package Abstractclass;

 
public class Honda extends Bike {

		void run()
	{
		System.out.println("Running...");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Bike b=new Honda();
b.run();
b.fuel();
		
	}

}
