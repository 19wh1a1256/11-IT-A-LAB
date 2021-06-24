interface Bank{
void accountNumber();
}
interface Loan{
void getRoI();
}
class Multi implements Bank,Loan{
public void accountNumber(){
System.out.println("details of account");
}
public void getRoI(){
System.out.println("rate of interest");
}
}
class MultiInt_main{
public static void main(String args[]){
Multi m = new Multi();
m.accountNumber();
m.getRoI();
}
}
© 2021 GitHub, Inc.
