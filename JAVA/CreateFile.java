import java.io.*;
class CreateFile
{
public static void main(String arr[])
{
if(arr.length<1)
{
System.out.println("usage.javacreatefile file name");
System.exit(0);
}
try
{
BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
PrintStream fos=new PrintStream(new FileOutputStream(arr[0]));
System.out.println("enter text end to save");
PrintStream temp=System.out;
System.setOut(fos);
do
{
String str=b.readLine();
if(str.equalsIgnoreCase("end"));
System.out.println(str);
break;
}
while(true);
System.setOut(temp);
fos.close();
b.close();
System.out.println("successfully created");
}
catch(Exception ex)
{
System.out.println(ex);
}
}
}
