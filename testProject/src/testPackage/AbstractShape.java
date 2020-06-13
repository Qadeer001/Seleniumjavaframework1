package testPackage;

public abstract class AbstractShape {
	
	void speak(){
	System.out.println("Hello");
	}
	abstract void draw();
	
	void ring(){
		System.out.println("Bell ring");
	}
	

}

class Rectangle extends AbstractShape{

	@Override
	void draw() {
		// TODO Auto-generated method stub
	System.out.println("Drawing Rectangle");	
	}
	//AbstractShape.speak();
}

class circle extends AbstractShape{
		
	@Override
	void draw() {
		// TODO Auto-generated method stub
	System.out.println("Drawing Circle");	
	}
}
    class TestAbstraction1{
	public static void main(String[] args){
		circle obj= new circle();
		obj.draw();
		Rectangle rect= new Rectangle();
		rect.draw();// abstract method
		obj.speak();//normal method
		obj.ring();
		
	}
	
}