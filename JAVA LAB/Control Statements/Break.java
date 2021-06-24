class Base  //HIERARCHICAL INHERITANCE
{
	int a = 10;
}
class Child extends Base  
{
	int b = 20;
	void sum()
	{
		System.out.println("Sum of a and b is : " +(a + b));
	}
}

class ChildChild extends Child
{
	int c = 5;
	void mul()
	{
		System.out.println("Multiplication of a and b and c is : " +(a * b * c));
	}
}
class Hierarchical
{
public static void main(String[] args)
{
	Child obj1 = new Child();
	obj1.sum();
	ChildChild obj2 = new ChildChild();
	obj2.mul();
}
}
