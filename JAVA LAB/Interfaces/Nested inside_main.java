class OuterClass{
interface InnerInterface{
void innerMethod();
}
}
class A implements OuterClass.InnerInterface{
public void innerMethod(){
System.out.println("This is InnerInterface method");
}
}
public class Nes_inside_main{
public static void main(String args[]){
A obj=new A();
obj.innerMethod();
}
}
