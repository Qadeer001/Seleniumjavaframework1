package firstpackage;

public class TryCatchExample6 {
	
	public static void main(String[] args){
	int i=50;
	int j=0;
	try{
		int data=i/j;	
	}catch(Exception e){
		System.out.println(e);
		System.out.println(i/(j+2));
	}
	
	

}
}