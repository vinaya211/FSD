import java.io.*;
class ByteCopy
{
    public static void main(String arr[])
{
if(arr.length<2)
{
System.out.println("please enter valid array");
System.exit(0);
}
try
{
FileInputStream fis=new FileInputStream(arr[0]);
FileOutputStream fos=new
FileOutputStream(arr[1]);
long t1=System.currentTimeMillis();
while(true)
{
int c=fis.read();
System.out.println("hello");
if(c==-1)
break;
fos.write(c);
System.out.println("hello");
}
long t2=System.currentTimeMillis();
long t=t2-t1;
fis.close();
fos.close();
System.out.println("operation is complete in"+t+"Secs");
}
catch(Exception e)
{
System.out.println("operation is done");
}
}
}