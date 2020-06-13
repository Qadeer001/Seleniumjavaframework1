package testPackage;

public class Stingsort {
	
	public static void main(String[] args){

		String a[]={"Henry","Asia","Software","Cool"};

		int i=0,size;
		size=a.length-1;
		for(i=0; i<=size; i++)
		{
			for(int j=i+1; j<=size; j++){
				if(a[i].compareTo(a[j])>0){
					String temp;
					int k;
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;

						
				}
				
			}
		System.out.println(a[i]);
		}
		System.out.println("end of program");


}
}