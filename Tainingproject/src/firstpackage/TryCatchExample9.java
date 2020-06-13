package firstpackage;

//example for throw keyword
public class TryCatchExample9 {
	void m(){
		throw new ArithmeticException("sorry");
	}
	
	public static void main(String[]args){
		TryCatchExample9 obj= new TryCatchExample9();
		obj.m();
	
	}

}
