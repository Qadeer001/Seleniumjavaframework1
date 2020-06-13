package firstpackage;

public class Reversearray {
	public static void main(String[] args){
		int a[]={1,2,3,4,5};
		int i,size;
		size=a.length-1;
		System.out.println(size);
		for(i=size;i>=0;i--){
			System.out.println(a[i]);
		}
		System.out.println("Execution completed");
	}

}
