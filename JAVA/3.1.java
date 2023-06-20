class Main
{
String name,city;
int age;
static int m;
void printdata()
{
System.out.println("Student name="+name);
System.out.println("student city="+city);
System.out.println("student age="+age);
}
}
class stest extends Main
{
public static void main(String args[])
{
Main s1=new Main();
Main s2=new Main();
s1.name="amit";
s1.city="dehradun";
s1.age="22";
s2.name="kapil";
s2.city="delhi";
s2.age="23";
s2.printdata();
s1.printdata();
s1.m=20;
s2.m=22;
student.m=27;
System.out.println("s1.m="+s1.m);
System.out.println("s2.m="+s2.m);
Sytem.out.println("Main.m="+Main.m);
}
}