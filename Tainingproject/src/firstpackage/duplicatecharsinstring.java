package firstpackage;

public class duplicatecharsinstring {
	
	public static void main(String[] args){
		//to print duplicate chars in a given string
		String str="Automation";
		int count=0;
		char[] ch=str.toCharArray();//ch={w,3,S,c,h,o,o,l,s}
		System.out.println(ch);
		for(int i=0; i<ch.length-1; i++){
		for(int j=i+1; j<=ch.length-1; j++){
			if(ch[i]==ch[j]){
				System.out.print("Duplicate chars are : "    +ch[i]);
				System.out.println();
		
		count++;
		
		break;
		}
		
		}
		
	}
		
		System.out.println("The no of duplicate chars are:  "  +count);
	}
}
