import java.applet.*;
import java.awt.*;
import java.lang.*;
/*<applet code=Scene.class width=400 height=400>
</applet>*/
public class Scene extends Applet implements Runnable
{
	Thread t1;
	Thread t2;
	public void init()
	{
	t1=new Thread(this);
	t1.start();
	t2=new Thread(this);
	t2.start();
	setBackground(Color.cyan);
	
	}
	
	
	public void run() {
	while (true) {
	try {
	if (Thread.currentThread() == t1) {
	setBackground(Color.cyan);
	Thread.sleep(1000);
	setBackground(Color.black);
	Thread.sleep(1000);
	}
	}
	catch (InterruptedException ie) { }
	repaint();
	}
	}
	public void paint(Graphics g)
	{
	int x1[]={100,130,160};
	int x2[]={110,140,110,140};
	int y1[]={250,200,250};
	int y2[]={300,300,280,280};
	int nop1=3;
	Polygon p1=new Polygon(x1,y1,nop1);
	Color c2=new Color(165,42,42);
	Color c3=new Color(250,0,0);
	Color c4=new Color(250,250,0);
	Color c5=new Color(255,165,0);
	Color c7=new Color(0,0,0);
	Color c9=new Color(255,255,255);
	g.setColor(c2);
	g.drawRect(0,300,400,300);
	g.fillRect(0,300,400,300);
	g.setColor(c3);
	g.drawPolygon(p1);
	g.fillPolygon(p1);
	g.setColor(c4);
	g.drawRect(110,250,40,50);
	g.fillRect(110,250,40,50);
	g.setColor(c5);
	g.drawOval(300,30,50,50);
	g.fillOval(300,30,50,50);
	
	try{
	for(int i=0;i<2;i++)
	{
	if(i%2==0)
	{
	g.setColor(c5);
	g.fillOval(300,30,50,50);
	Thread.sleep(1000);
	}
	
	else{
	g.setColor(c9);
	g.fillOval(300,30,50,50);
	}
	Thread.sleep(1000);
	}
	}
	catch(InterruptedException ie)
	{
	
	}
	
	}
}	
	