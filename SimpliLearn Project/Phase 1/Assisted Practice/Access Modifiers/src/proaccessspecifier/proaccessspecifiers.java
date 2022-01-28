package proaccessspecifier;

public class proaccessspecifiers {
	protected void display() 
	 { 
	 System.out.println("This is protected access specifier"); 
	 } 
	public static void main(String[] args) {
		proaccessspecifiers p1 = new proaccessspecifiers();
		p1.display();
	}
}
