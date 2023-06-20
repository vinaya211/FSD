class Buffer
{
int value;
boolean produced=false;
public synchronized void produce(int x)
{
if(produced)
{
System.out.println("producer enter monitor out of turn......suspend.....");
try
{
wait();
}
catch(Exception e)
{}
}
value=x;
System.out.println(value+"is produced");
produced=true;
notify();
}
public synchronized void consume()
{
if(!produced)
{
System.out.println("consumer entered the monitor out of turn,suspend.......");
try{
wait();
}catch(Exception e)
{}
}
System.out.println(value+"is consumed");
prodced=false;
notify();
}
}
class producer extends Thread
{
Buffer buffer;
public producer(Buffer b)
{
buffer=b;
}
public void run()
{
System.out.println("producer started,producing value.....");
for(inti=1;i<=10;i++);
buffer.produce(i);
}
class Consumer extends Thread
{
Buffer buffer;
public Consumer(Buffer b)
{
buffer=b;
}
public void run()
{
System.out.println("producer started,producing value.....");
fo(int i=1;i<=10;i++)
buffer.Consume();
}
}
class pc1
{
public static void main(String arr[])
{
Buffer b=new Buffer();
producer p=new producer(b);
consumer c=new consumer(b);
p.start();
c.start();
}
}

