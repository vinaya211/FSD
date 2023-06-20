																														import java.io.*;
class MakeFolder
{
public static void main(String arr[])
{
if(arr.length==0)
{
System.out.println("usage:java make folder name or path");
System.exit(0);
}
File f=new File(arr[0]);
if(f.exists()&&f.isDirectory())
System.out.println("already exist");
else if(f.mkdir())
System.out.println("successfully created");
else            
System.out.println("cannot be created");
}
}
