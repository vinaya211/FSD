import java.io.*;
class File1
{
public static void main(String args[])
{
File inf= new File("in.dat");
File outf=newFile("out.dat");
FileReader ins= null;
FileWriter outs= null;
try
{
ins=new FileReader(inf);
outs= new FileWriter(outf);
int ch;
while((ch=ins.read())!=-1)
{
outs.write(ch);
}
}
catch(IOException e)
{
System.out.println(e);
System.exit(-1);
}
finally
{
try
{
ins.close();
outs.close();
}
catch(IOException e){}
}
}
}