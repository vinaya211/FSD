class Student
{
String name,city;
int age;
static int m;
void PrintData()
{
System.out.println("Student name="+name);
System.out.println("Student city="+city);
System.out.println("Student age="+age);
}
}
class Stest
{
public static void main(String args[])
{
Student s1=new Student();
Student s2=new Student();
s1.name="vinaya";
s1.city="palakol";
s1.age=19;
s2.name="ronniee";
s2.city="rajamundry";
s2.age=20;
s2.PrinData();
s1.PrintData();
s1.m=20;
s2.m=24;
Student.m=27;
System.out.println("s1.m="+s1.m);
System.out.println("s2.m="+s2.m);
System.out.println("Student.m="+Student.m);
}
} 
