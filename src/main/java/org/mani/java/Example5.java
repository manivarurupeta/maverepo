package pac1;

public class Example5 {
	int j;
	public  void addmethod(){
		
	
		System.out.println(j);
	}
	public void localvariable(){
		int k=30;
		System.out.println(k);
	}
	static int i=10;
	static int l;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.out.println(i);
Example5 x=new Example5();
System.out.println();
x.addmethod();
System.out.println();

x.localvariable();
System.out.println();
System.out.println(l);
System.out.println();

	}

}
