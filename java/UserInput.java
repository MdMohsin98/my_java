/* User input through applet */
import java.applet.*;
import java.awt.event.*;
import java.awt.*;
public class UserInput extends Applet
{
	TextField T1,T2;	
	public void init()
	{
		T1=new TextField(8);
		T2=new TextField(8);
		add(T1);
		add(T2);
		T1.setText("0");
		T2.setText("0");
	}
	public void paint(Graphics g)
	{
		String rollNo = "";
		String name = "";
		g.drawString("Input your RollNo and Name in each box",10,50);
		try
		{
			rollNo = T1.getText();
			name= T2.getText();
		}
		catch(Exception e)
		{
		}
	
	g.drawString("Your roll no is",10,75);
	g.drawString("Roll No",100,75);
	g.drawString("Your Name is:",10,95);
	g.drawString("Name",100,95);
}
public boolean action(Event event,Object obj)
{
repaint();
return(true);
}
}
//<applet code="UserInput.class" Height=500 Width=500></applet>