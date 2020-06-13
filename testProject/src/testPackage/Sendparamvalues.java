package testPackage;

public class Sendparamvalues {
	
	public void add(int a,int b){
		int sum;
		sum=a=b;
		System.out.println(sum);
	}
	
	public static void main(String[] args){
		
		
		//Create a object
		//Classname obj=new Classname();
		Sendparamvalues obj= new Sendparamvalues();
		//Call the method and pass values
		obj.add(10,20);
		
		
	}

}
