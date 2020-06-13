package firstpackage;

public class Arrayorder {
	
	public static void main(String[] args){
		int a[]={23,12,45,20,5,2},size;

		size=a.length;
		for(int i=0;i<size;i++)
		{
			for(int j=i+1;j<size;j++)
			
			if(a[i]>a[j])
			{
				int temp=a[i];
			    a[i]=a[j];
				a[j]=temp;
			}
		}
		System.out.println("Assendingorder");
	  for(int i=0;i<a.length;i++)
		 System.out.println(a[i]);

     System.out.println("Desending order");
	  for(int i=a.length-1;i>=0;i--)
		 System.out.println(a[i]);
}
}
