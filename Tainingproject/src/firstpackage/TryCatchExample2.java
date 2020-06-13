package firstpackage;

public class TryCatchExample2 {
	
	public static void main(String[] args) {  
        try  
        {  
        int data=50/0; //may throw exception   
        }  
            //handling the exception  
        catch(ArithmeticException e)  
        {  
            System.out.println(e);  
        }  
        int a=10;
        int b=20;
        int c=a+b;
        System.out.println("The sum of two nos is :"  +c);  
    }  

}
