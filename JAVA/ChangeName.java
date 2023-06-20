import java.io.*;
class ChangeName
{
public static void main(String arr[])
{
if(arr.length<2)
System.out.println("usage:change name src target");
System.exit(0);
File f1=new File(arr[0]);
File f2=new File(arr[1]);
if(f1.exists()&&!f2.exists())
{
if(f1.renameTo(f2))
System.out.println("successfully renamed");
else
System.out.println("cannot be renamed");
}
else
{
System.out.println("either source doesn't exist or target already exist");
}
}
}