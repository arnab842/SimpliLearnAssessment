package Type6;

abstract class AnonymousInnerClass {
	public abstract void display();
}
class InnerClass4
{
public static void main(String[] args)
{
AnonymousInnerClass i = new AnonymousInnerClass()
{
 public void display()
 {
 System.out.println("Anonymous Inner Class");
 }
 };
 i.display();
 }
}
