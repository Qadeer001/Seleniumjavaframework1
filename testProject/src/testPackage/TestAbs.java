package testPackage;

public abstract class TestAbs {
	
	abstract void run();

}

class bike extends TestAbs{
	
	void run(){
		System.out.println("bike riding");
	}
	
	public static void main(String[] args){
		TestAbs obj= new bike();
		obj.run();
	}
}
