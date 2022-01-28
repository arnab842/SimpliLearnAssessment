public class Animal {
 Animal(int i)
{
	 System.out.println("Animals Lives in Forest ");
 }
}
class Dog extends Animal{
	Dog(){
		super(10);  // mandetory to write this super(10)
		System.out.println("Dogs are Domestic Animal");
	}
}
class Test3{
	public static void main(String[] args) {
		new Dog();
	}
}