interface ParentInterface{
void parentMethod();
}
interface ChildInterface extends ParentInterface{
void childMethod();
}
class A implements ChildInterface{
public void childMethod(){
System.out.println("Child Interface method!!");
}
public void parentMethod(){
System.out.println("Parent Interface method!!");
}
}
public class ExtInt_main{
public static void main(String args[]){
A a=new A();
a.childMethod();
a.parentMethod();
}
}
