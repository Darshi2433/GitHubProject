package mainPage;



public class FirstClass {

	public static void main(String[] args) {


		System.out.println("this is a main method");
		FirstClass f1 = new FirstClass();
		SecondClass s2 = new SecondClass();
        s2.fourth();
        FirstClass.second();
        f1.third();
        
	}
	
	public static void second() {
		System.out.println("this is a second method");
	}
	
	public void third() {
		System.out.println("this is a non static third method");
	}

}
