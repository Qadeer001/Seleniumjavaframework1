package firstpackage;

public class StringMethods {
	
	public static void main(String[] args){
	
		String s="Automation Testing";
		char ch[]=s.toCharArray();
		String str1="Software";
		String str2="Testing";
		System.out.println(s);
		System.out.println("The character at index is "  +s.charAt(2));
		System.out.println("The character at index is "  +s.charAt(17));
		System.out.println("The length of the string is :" +s.length());
		System.out.println("The String after trim is :" +s.trim());
		System.out.println("The substring from 4th index is:" +s.substring(4));
		System.out.println("The substring from 11th index to 17th index is" +s.substring(11, 17));
		System.out.println("The final String after adding two strings :" +str1.concat(str2));
		System.out.println("Changing the String to Lowercase :" +s.toLowerCase());
		System.out.println("Changing the String to Lowercase :" +s.toUpperCase());
		System.out.println("displaying string after ignoring the case of the string :" +s.compareToIgnoreCase(str2));
		System.out.println("comparing two strings it returns true if every char matches else false :"  +str1.equals(str2));
		System.out.println(s.replace('i', 'e'));
		for(int i=0;i<ch.length;i++){
			System.out.println(ch[i]);
		}
		
		
	}

}
