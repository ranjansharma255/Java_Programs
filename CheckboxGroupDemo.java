import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code = CheckboxGroupDemo width = 300 height = 300 > </applet>*/
public class CheckboxGroupDemo extends Applet implements ItemListener
{
	Checkbox a,b,c;
	public void init()
	{
		CheckboxGroup g = new CheckboxGroup();
		a = new Checkbox("Red",g,false);
		b = new Checkbox("Pink",g,false);
		c = new Checkbox("Green",g,false);
		add(a);
		add(b);
		add(c);
		a.addItemListener(this);
		b.addItemListener(this);
		c.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		if(a.getState() == true)
			setBackground(Color.red);
		else if(b.getState() == true)
			setBackground(Color.pink);
		else if(c.getState() == true)
			setBackground(Color.green);
	}
	public void paint(Graphics g)
	{
		showStatus("Radio Button Selected color is displayed");
	}
}