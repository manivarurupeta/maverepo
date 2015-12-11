package pac1;

public class Example4 {
	
	public void addMethod(){
		System.out.println("Addition of numbers....!!!");
	}
	
	public void subMethod(){
		System.out.println("Subtraction of numbers....!!!");
	}

	public static void main(String[] args) {
		Example4 sandya=new Example4();
		Example4 mani=new Example4();
		sandya.addMethod();
		sandya.subMethod();
		System.out.println();
		mani.subMethod();
		mani.addMethod();
		//sandya.subMethod();

	}

}
