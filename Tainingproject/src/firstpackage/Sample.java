package firstpackage;

public class Sample {

	//method with Arguments and return value(Non Static Method)
	public int add(int a ,int b){
		int result;
		result=a+b;
		return result;
	}
	//Create a Method no Arguments and no return value(Non Static Method)
	public void comparison(){
		int a=10,b=20;
		if(a>b){
			System.out.println("a is bigger no");
		}
		else{
			System.out.println("a is smaller no");
		}
	}
	
	//Method with Arguments and return value(Static Method)
	public static int sub(int a, int b){
		int res=a-b;
		return(res);
	}
	//Method with without Arguments and no return value(Static Method)
	public static void comparison1(){
		int a=100,b=20;
		if(a>b){
			System.out.println("a is bigger no");
		}else
		{
			System.out.println("b is bigger no");
		}
	}
	



public static void main (String [] args){

	//Create Object to call Non Static methods

	//Classname obj= new Classname();

	Sample obj = new Sample();

	int res = obj.add(100, 200);
	System.out.println("Non Static method"  +res);//300
	//Or
	System.out.println("Non Static method"  +obj.add(100, 200));//300
    System.out.println("Non Static Method");
	obj.comparison();//X is a Big Number

	//Call Static Methods using Class name
	res = Sample.sub(100, 50);
	System.out.println("Static Method"   +res);//50
	//Or
	System.out.println("Static Method "   +Sample.sub(200, 100));//100
    
	System.out.println("Static Method");
	Sample.comparison1();//B is a Big Number

	//Call Static Methods without using Class name
	int x= sub(10, 5);
	System.out.println(x);//5

	System.out.println(sub(20,10));//10
	System.out.println("Static Method");
	comparison1();//B is a Big Number

	int a;//Variable Declaration
	a=100; //Initialization
	int b=200; //Variable Declaration with Initialization
	int c, d, e; //Declare multiple variables
	int f=40, g=50, h=60; //Declare multiple variables with initialization

	double l=123.45678;
	char m = '*';
	boolean p=true;
	String q= "Selenium Testing";

	System.out.println(q);//Selenium Testing
	System.out.println(l);//123.45678
	System.out.println("Hello Java");

	final int price =100;
	System.out.println(price);

	if (a>b){
	System.out.println("A is a Big Number");
	}
	else
	{
	System.out.println("B is a Big Number");
	}

	
	char grade='U';
	switch (grade){
	case 'A':
	System.out.println("Excellent");
	break;
	case 'B':
	System.out.println("Good");
	break;
	case 'C':
	System.out.println("Better");
	break;

	default:
	System.out.println("Invalid Grade");
	}

	//Print 1 to 5 Numbers except 4 using for loop
	for (int i=1; i<=5; i++){
	if (i != 4) {
	System.out.println(i);
	}
	}
	//Print 1 to 5 numbers using while loop
	int j=10;
	while (j<=15){
	System.out.println(j);
	j++;
	}

	//do while loop
	int k=100;
	do
	{
	System.out.println(k);
	k++;
	} while (k<=8);

	//Enhanced for loop
	String [] tools ={"Selenium", "UFT", "RFT", "SilkTest"};

	for (String mytool: tools){
	System.out.println(mytool);
	}
	}
	}
