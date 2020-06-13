package testPackage;

public class Student1 {
	
	//Java Program to demonstrate having the main method in   
	//another class  
	//Creating Student class.  
	
	 int id=10;  
	 String name="Samad";  
	}  
	//Creating another class TestStudent1 which contains the main method  
	class TestStudent1{  
	 public static void main(String args[]){  
	  Student1 s1=new Student1();  
	  System.out.println(s1.id);  
	  System.out.println(s1.name);  
	 }  
	}  


