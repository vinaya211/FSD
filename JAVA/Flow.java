import java.awt.*;  
import javax.swing.*;  
public class Flow {  
 JFrame f;  
 public Flow() {  
  f = new JFrame();  
  JButton b1 = new JButton("Red");  
  JButton b2 = new JButton("Green");  
  JButton b3 = new JButton("Yellow");  
  JButton b4 = new JButton("Purple");  
  JButton b5 = new JButton("Blue");  
  JButton b6 = new JButton("Pink");  
  JButton b7 = new JButton("Brown");  
  f.add(b1);  
  f.add(b2);  
  f.add(b3);  
  f.add(b4);  
  f.add(b5);  
  f.add(b6);  
  f.add(b7);  
  f.setLayout(new FlowLayout(FlowLayout.LEFT));  
  f.setSize(400, 200);  
  f.setVisible(true);  
 }  
 public static void main(String[] args) {  
  new Flow();  
 }  
}