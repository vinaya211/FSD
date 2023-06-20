class Printer
{
public synchronized void print(String msg)
{
System.out.println("[");
try
{
Thread.sleep(1000);
System.out.println(msg);
Thread.sleep(1000);
}catch(Exception e)
{}
System.out.println("]");
}
}
class User extends Thread
{
String msg;
Printer p;
public User(Printer p,String m)
{
this.p=p;
msg=m;
}
public void run()
{
p.Print(msg);
}
}
class SynDemo
{
public static void main(String arr[])
{
System.out.println("creating a pointer.....");
Priner p=new Printer();
System.out.println("creating two user threads and giving them reference of the printer....");
Use u1=new user(p,"it is user one");
User u2=new user(p,"it is user two");
System.out.println("starting user threads.....");
u1.start();u2.start();
}
}
