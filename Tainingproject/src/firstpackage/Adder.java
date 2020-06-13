package firstpackage;

public class Adder {
	
			static float add(float a, int b)
			{
				return a+b;
			}  
			static int add(int a, int b )
			{
				return  a+b;
			}  

			//class TestOverloading2{  
			public static void main(String[] args){  
			  
			System.out.println(Adder.add(11, 12)); 
			System.out.println(Adder.add(11,23));
			}
			
}  



