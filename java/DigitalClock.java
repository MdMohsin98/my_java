import java.util.*;
 import java.applet.*;
 import java.awt.*;
 import java.text.*;
 /*<applet code=DigitalClock.class width=450 height=100></applet>*/
 public class DigitalClock extends Applet implements Runnable
{
 Thread t;
 Calendar c;
 Date d;
 DateFormat df;
 public void init()
{
 t=new Thread(this,"Time Thread");
 t.start();
 df=DateFormat.getInstance();
}
 public void run()
{
 for(;;)
 {
 try{
 c=Calendar.getInstance();
 d=c.getTime();
 Thread.sleep(1000);
}
 catch(Exception e){}
 repaint();
 }
}
 public void paint(Graphics g)
{
 g.setFont(new Font("Algerian", Font.ITALIC, 50));
 g.drawString(d.toString(),30,20);
 g.drawString("Different Format " +df.format(d),30,40);
}
}