package firstpackage;

public class Removewhitespaces {
	
	public static void main(String[] args){
		String str="Thi  s   i s the fir  st c la ss";
		
		System.out.println("Original string is  "  +str);
		
		str= str.replaceAll("\\s","");
		System.out.println("After Replacement  "  +str);
	}

}
