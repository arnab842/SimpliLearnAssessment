public class J {
J(){
	System.out.println("Default constructor in J");
}
}
class K extends J{
	K(){
		System.out.println("Default Constructor in K");
	}
	K(int i){
		this();
		System.out.println("Parameterised Constructor in K");
	}
}
class Test4{
	public static void main(String[] args) {
		new K(10);
		System.out.println("--------");
		new K();
	}
}
