package firstpackage;

//displaying string in order.the compareTo method is will return below
/*if s1 > s2, it returns positive number  
if s1 < s2, it returns negative number  
if s1 == s2, it returns 0 */
public class ArrangingStrings {
	
	public static void main(String[] args){
		
		String[] str={"Auto","String","Universe","Testing","Henry"};
		int i,size;
		size=str.length;
		for(i=0; i<=size-1; i++){
		  for(int j=i+1; j<=size-1; j++){
			  if(str[i].compareTo(str[j])>0){
				  String temp;
				  temp=str[i];
				  str[i]=str[j];
				  str[j]=temp;
				  			  
			  }
		  }
		  
		  }
		for(i=0; i<=size-1; i++){
			  System.out.println(str[i]);
		}
	}

}
