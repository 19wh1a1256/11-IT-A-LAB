class Base     //SINGLE LEVEL INHERITANCE
{
	int a = 10;
}
class Child extends Base  //we need to create obj for child class only
{
	int b;
	void sum()
	{
		b = 20;
		System.out.println("Sum of a and b is : " +(a + b));
	}
}
class Single
{
public static void main(String[] args)
{
	Child obj = new Child();
	obj.sum();
}
}
