import java.io.*; 
class Input2 
{ 
public static void main(String arr[]) 
{ 
if(arr.length<1) 
{ 
System.out.println("please enter valid array"); 
System.exit(0); 
} 
try 
{ 
BufferedReader f= new BufferedReader(new InputStreamReader(new FileInputStream(arr[0]))); 
PrintStream fos=new PrintStream(new FileOutputStream("k.text")); 
int c=f.read(); 
while((c=f.read())!=-1) 
{ 
fos.write(c); 
} 
f.close(); 
fos.close(); 
}catch(IOException ex) 
{} 
System.out.println("operation is complete");
}
}