package firstpackage;

/*he private access modifier is accessible only within the class.

Simple example of private access modifier

In this example, we have created two classes A and Simple. A class contains private data member and private method. We are accessing these private members from outside the class, so there is a compile-time error.*/

 class abc{
	
	 private int data=40;
	
	private void msg(){
		System.out.println("Hello");
	}
	
}

public class Privatemodifier {
	
	public static void main(String[] args){
		abc obj = new abc();
		System.out.println(obj.data);
		obj.msg();
		
	}

}
