//default constructor using inheritance
class Base
{
Base()
{
System.out.println("Base class constructor");
}
}
class Child extends Base
{
Child()
{
System.out.println("child class constructor");
}
}
class DefaultConstructor
{
public static void main(String[] args)
{
Child obj=new Child();
}
}
