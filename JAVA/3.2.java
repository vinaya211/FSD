class Main
{
private string name,city;
private int age;
public void getdata(String x,String y,int t)
{
name=x;
city=y;
age=t;
}
public void printdata()
{
System.out.println("student name="+name);
System.out.println("student city="+city);
System.out.println("student age="+age);
}
}
class stest
{
public static void main(String args[])
{
Main s1=new Main();
Main s2=new Main();
s2.getdata("kapil","delhi",23);
s2.printdata();
s1.getdata("amit","dehradun",22);
s1.printdata();
}
}