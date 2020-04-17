import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*<applet code=scroll.class width=400 height=400 ></applet>*/
public class scroll extends Applet implements AdjustmentListener
{
 Scrollbar s;
 Label l;
 public void init()
 {
 setLayout(new GridLayout(2,3));
 s=new Scrollbar();
 l=new Label("this is a scrollbar");
 l.setBounds(50,50,30,40);
 s.setBounds(100,100,30,70);
 add(s);
 add(l);
 s.addAdjustmentListener(this);
 }
 public void adjustmentValueChanged(AdjustmentEvent ee)
 {
		int x=ee.getValue();
		String str=x+"This is a scrollbar";
		l.setText(str);
		l.setForeground(Color.yellow);
 }
 
 }
 