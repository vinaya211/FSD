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
