import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code ="Applet2" width=250 height=200>
</applet> */
public class Applet2 extends Applet implements ActionListener,ItemListener
{
Label label1,label2,label3;
TextField tf1,tf2,tf3;
Checkbox ck1,ck2;
checkbox Group cb;
public void init()
{
System.out.println("initializing an applet");
label1=new Label("enter your name:");
tf1=new TextField(10);
label2=new Label("enter your city:");
tf2=new TextField(10);
label3=new Label("gender:");
cb=new checkboxGroup();
ck1=new checkbox("male",cb,false);
ck2=new checkbox("female",cb,false);
add(label1);
add(tf1);
add(label2);
add(tf2);
add(label3);
add(ck1);
add(ck2);
tf1.addActionListener(this);
tf2.addActionListener(this);
ck1.addItemListener(this);
ck2.addItemListener(this);
}
public void actionPerformed(ActionEvent ae)
{
repaint();
}
public void itemStateChanged(ItemEvent ie)
selected
{
repaint();
}
public void paint(Graphics g)
{
g.drawString("Your name is"+tf1.getText(),10,150);
g.drawString("your city is"+tf2.getText(),10,170);
if(cb.getselectedCheckbox()!=null)
{
g.drawString("your gender is"+cb.getSelectedCheckbox().getLabel(),10,190);
}
}
}