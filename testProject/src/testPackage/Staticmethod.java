package testPackage;

public class Staticmethod {
	public static int sub(){
		int a,b,sub;
		a=20;
		b=10;
		 int res=a-b;
		 return res;
	}


	static void main(String[] args){
	
//Calling the static method
	int Result=Staticmethod.sub();
	System.out.println(Result);
	
	System.out.println(Staticmethod.sub());
}
}