import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code = CheckBoxDemo width = 300 height = 300 > </applet>*/
public class CheckBoxDemo extends Applet implements ItemListener
{
	Checkbox a,b,c;
	String msg = " ";
	public void init()
	{
		setLayout(new FlowLayout());
		a = new Checkbox("M.Tech");
		b = new Checkbox("B.Tech");
		c = new Checkbox("Ph.D");
		add(b);
		add(a);
		add(c);
		a.addItemListener(this);
		b.addItemListener(this);
		c.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent i)
	{
		repaint();
	}
	
	public void paint(Graphics g)
	{
		msg = "Current Qualification";
		g.drawString(msg,10,40);
		msg = "B.Tech "+ b.getState();
		g.drawString(msg,10,50);
		msg = "M.Tech "+ a.getState();
		g.drawString(msg,10,70);
		msg = "ph.D "+ c.getState();
		g.drawString(msg,10,90);
	}
}