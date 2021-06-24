class Base{
int num=10;
}
class Child extends Base{
int num=20;
void show()
{
System.out.println(+num);
System.out.println(+super.num);
}
}
class SuperConstructor{
public static void main(String args[]){
Child obj=new Child();
obj.show();
}
}
