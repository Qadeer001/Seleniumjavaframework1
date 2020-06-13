package firstpackage;

public class Numberslist {
	
	public static void main(String[] args){
		int i;
		for(i=1;i<=10;i++){
			System.out.println(i);
			if(i==5){
				break;
			}
		}
		System.out.println("Execution stops due to if cond is true :");
	}

}
