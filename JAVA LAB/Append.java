class Append
{
 public static void main(String[] args)
 {
    
  StringBuffer name=new StringBuffer("welcome");
  StringBuffer age=new StringBuffer("23 yrs");
  name.append(age);
  System.out.println(name);
 }
}     