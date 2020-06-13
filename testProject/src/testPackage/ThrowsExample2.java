package testPackage;
import java.io.*;

public class ThrowsExample2 {
	  
	  
	 void method() throws IOException{  
	  throw new IOException("device error");  
	 }  
	
	 
	   public static void main(String args[]){  
	    try{  
	    	ThrowsExample2 te=new ThrowsExample2();  
	     te.method();  
	    }catch(Exception e){System.out.println("exception handled");}     
	  
	    System.out.println("normal flow...");  
	  }  
	} 


