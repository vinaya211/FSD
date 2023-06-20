import java.io.*;
class Copy
{
public static void main(String arr[])
{
if(arr.length<2)
{
System.out.println("usage.javalinecopy source to target file");
System.exit(0);
}
try
{
FileInputStream fis=new FileInputStream(arr[0]);
FileOutputStream fos=new FileOutputStream(arr[1]);
long t1=System.currentTimeMillis();
while(true)
{
String str=fis.printdLine();
if(str==null)
break;
fos.println(str);
}
long t2=System.currentTimeMillis();
long t=t2-t1;
fis.close();
fos.close();
System.out.println("Successfully copied in"+t+"milliseconds");
}
catch(Exception ex)
{
System.out.println(ex);
}
}
}