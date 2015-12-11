package pac1;

public class Variabbletype {
	
	int i;//non static variable (or) instance variable
	static int j;//static variable or class variable
	public void new1(){//non static or instance method
		int k=10;//local variable
	System.out.println("local variable value="+k);
	}
	
	public static void main(String[] args) {
		Variabbletype i=new Variabbletype();//object creation
	i.new1();//Method calling for using reference variable
	}
}

