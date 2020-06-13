package testPackage;

public class Stringduplicate {

	public static void main(String[] args){
		
		String a[]={"String","String","Auto","Software","Testing","Auto","Test"};
		int i,size;
		int count=0;
		size=a.length-1;
		for(i=0;i<=size;i++){
			for(int j=i+1;j<=size; j++){
				if (a[i] == a[j] && i != j) {
					System.out.println("Element '" + a[i] + "' is duplicated.");
					count++;
				}
			}
			//System.out.println(a[i]);
		}
	}
}
