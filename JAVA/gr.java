import java.awt.*;
import java.io.*;
import java.lang.*;
import java.applet.*;
public class gr extends applet
{
public void init()
{
setBackground(Color.white);
setForeground(Color.red);
}
public void paint(Graphics g)
{
g.drawRect(10,100,50,70);
g.fillOval(10,100,50,70);
g.drawString("vishal",50,7);
g.drawLine(100,20,400,70);
g.setColor(Color.blue);
g.drawOval(100,200,50,10);
}
}
