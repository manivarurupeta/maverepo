package pac1;

public class ConstructorExam {

	ConstructorExam(){
		System.out.println("Default construstor");
		
	}
	 ConstructorExam(int i){
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		
		
		ConstructorExam c=new ConstructorExam();
        ConstructorExam c1=new ConstructorExam(55555);

	}

}
