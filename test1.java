import java.applet.*;
import java.awt.*;
import java.io.*;
import java.net.*;
/*<applet code=test1.java width=400 height=400>
	</applet>*/
public class test1 extends Applet implements Runnable {
volatile Thread t1,t2;
volatile int i,j;

public void init() {
t1 = new Thread(this);
t1.start();
t2 = new Thread(this);
t2.start();
}

public void run() {
while (true) {
try {
if (Thread.currentThread() == t1) {
i++;
Thread.sleep(50);
}
if (Thread.currentThread() == t2) {
j += 2;
Thread.sleep(100);
}
} catch (InterruptedException ie) { }
repaint();
}
}

public void paint(Graphics g) {
g.drawString(Integer.toString(i),20,20);
g.drawString(Integer.toString(j),20,40);
}
}