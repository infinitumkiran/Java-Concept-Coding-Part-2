import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class radio extends JFrame implements ActionListener
{
  JRadioButton r1,r2;
  JTextField t;
  JButton b;
  JLabel l;
  Container c;
 public radio()
 {
  c=getContentPane();
  c.setLayout(new FlowLayout());
  b=new JButton("ok");
  r1=new JRadioButton("male");
  r2=new JRadioButton("female");
  r1.setBounds(100,100,40,70);
  r2.setBounds(100,120,30,60);
  t=new JTextField(15);
  l=new JLabel("Greetings");
   l.setBounds(100,140,40,50);
  t.setBounds(100,60,20,50);
  //ButtonGroup bg=new ButtonGroup();
  c.add(r1);
  c.add(r2);
  c.add(b);
  c.add(t);
  c.add(l);
  b.addActionListener(this);
  t.addActionListener(this);
  setSize(400,400);
  setVisible(true);
 
 }
 public void actionPerformed(ActionEvent ae)
{
 String name=t.getText();
 if(r1.isSelected())
 {
  name="mr."+name;
 }
 else
 {
  name="mrs."+name;
 }
 l.setText(name+" ");
}
}
public class user
{
  public static void main(String args[])
 {
  radio r=new radio();
 }
 }
