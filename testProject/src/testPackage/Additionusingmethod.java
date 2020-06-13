package testPackage;

//creating a class
public class Additionusingmethod {
	//creating a method
	 void add(){
			int a,b,sum;
			a=10;
			b=20;
			sum=a+b;
			System.out.println("The sum of two nos is sum  :"  +sum);
		}
    
	public static void main(String[] args){
		
		//Creating object for the class add
		Additionusingmethod obj= new Additionusingmethod();
		obj.add();
		
	
}
}
