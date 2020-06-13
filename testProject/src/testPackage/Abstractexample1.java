package testPackage;

public abstract class Abstractexample1 {
	
	 abstract void run();

}

class Honda4 extends Abstractexample1{
	void run(){
		System.out.println("Running safely");
	}
	
	public static void main(String[] args){
		Abstractexample1 obj= new Honda4();
		obj.run();
	}
}
