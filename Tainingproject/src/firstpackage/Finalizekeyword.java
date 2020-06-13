package firstpackage;

public class Finalizekeyword {
	
	
			public void finalize(){System.out.println("finalize called");}  
			public static void main(String[] args){  
				Finalizekeyword f1=new Finalizekeyword();  
				Finalizekeyword f2=new Finalizekeyword();  
			f1=null;  
			f2=null;  
			System.gc();  
			}}  



