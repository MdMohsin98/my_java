import java.awt.Graphics;
import java.applet.Applet;
public class MyApplet extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Welcome!!", 300,300);
		g.drawLine(10, 10, 50, 50);
		g.drawRect(10, 60, 40, 30);
		g.fillRect(60, 10, 30, 80);
		
		
	}
}
//<Applet Code = "MyApplet.class", height = 5000 width = 4000></Applet>