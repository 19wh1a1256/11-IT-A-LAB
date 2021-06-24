//parameterized constructor
class Base
{
Base(int x)
{
int a=x;
System.out.println("Values of a is "+a);
}
Base()
{
System.out.println("Base class constructor");
}
}
class Child extends Base
{
Child()
{
super(100);
System.out.println("child class constructor");
}
}
class ParameterizedConstructor
{
public static void main(String[] args)
{
Child obj=new Child();
}
}
© 2021 GitHub, Inc.
