package Type3;

public class EmpInfo {
	int id;
	String name;

void display() {
	System.out.println(id+" "+name);
	}
}

class Std{
	int id;
	String name;

	Std(int i,String n)
	{
	id=i;
	name=n;
	}

	void display() {
	System.out.println(id+" "+name);
	}
}
class Constructor {

	public static void main(String[] args) {
		EmpInfo emp1=new EmpInfo();
		EmpInfo emp2=new EmpInfo();

		emp1.display();
		emp2.display();
		
		Std std1=new Std(5,"Arnab");
		Std std2=new Std(8,"Roy");
		std1.display();
		std2.display();



	}

}
