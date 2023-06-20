import jav.io.*;
class Copy
{
public static void main(String arr[])
{
if(arr.length<2)
{
System.out.println("usage.javaline copy source to target file");
System.exit(0);
}
try
{
FileInputStream fis=new FileInputStream(arr[0]);
FileOutputStream fos=new FileOutputStream(arr[1]);
long t1=System.CurrentTimeMillis();
while(true)
{
String str=fis.readLine();
if(str==null)
break;
fos.println(str);
}
long t2=System.CurrentTimeMillis();
long t=t2-t1;
fis.close();
fos.close();
System.out.println("successfully copied in"+t+"milliseconds");
}
catch(Exception ex)
{
System.out.println(ex);
}
}
}