import java.awt.*;  
import java.awt.event.*;  
import javax.swing.*;  
public class Grid extends JFrame implements ActionListener {  
 private JButton b[];  
 private String names[] = {  
  "Contacts",  
  "Message",  
  "Call Log",  
  "Games",  
  "Settings",  
  "Applications",  
  "Music",  
  "Gallery",  
  "Organiser"  
 };  
 private boolean toggle = true;  
 private Container c;  
 private GridLayout grid1, grid2, grid3;  
 public Grid() {  
  super("GridLayout");  
  grid1 = new GridLayout(2, 3, 5, 5);  
  grid2 = new GridLayout(3, 2);  
  grid3 = new GridLayout(3, 5);  
  c = getContentPane();  
  c.setLayout(grid3);  
  b = new JButton[names.length];  
  for (int i = 0; i < names.length; i++) {  
   b[i] = new JButton(names[i]);  
   b[i].addActionListener(this);  
   c.add(b[i]);  
  }  
  setSize(400, 400);  
  show();  
 }  
 public void actionPerformed(ActionEvent e) {  
  if (toggle)  
   c.setLayout(grid3);  
  else if (toggle)  
   c.setLayout(grid2);  
  else  
   c.setLayout(grid1);  
  toggle = !toggle;  
  c.validate();  
 }  
 public static void main(String args[]) {  
  Grid G = new Grid();  
  G.addWindowListener(new WindowAdapter() {  
   public void windowClosing(WindowEvent e) {  
    System.exit(0);  
   }  
  });  
 }  
}