package firstpackage;

/*If you don't use any modifier, it is treated as default by default. 
 * The default modifier is accessible only within package. 
 * It cannot be accessed from outside the package.
*/

public class Defaultmodifier {
	
	public static void main(String[] args){
		
		A obj= new A();
		obj.msg();
		
	}

}
