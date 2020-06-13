package firstpackage;

public class Paramconstructor {
	
	    int id;  
	    String name;  
	    //creating a parameterized constructor  
	   Paramconstructor(int i,String n){  
	    id = i; //111 
	    name = n; //karan 
	    }  
	    //method to display the values  
	    void display()
	   {
	    System.out.println(id+" "+name);
	   }  
	   
	    public static void main(String[] args)
	    {  
	    //creating objects and passing values  
	    	Paramconstructor s1 = new Paramconstructor(111,"Karan");

	    	Paramconstructor s2 = new Paramconstructor(222,"Aryan");  
	    //calling method to display the values of object  
	    s1.display();  
	    s2.display();  
	   }  
	}


