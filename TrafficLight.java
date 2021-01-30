import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code = TrafficSignal width = 500 height = 500></applet>*/
public class TrafficSignal extends Applet implements ItemListener
{
	String msg = " ";
	Checkbox red,green,yellow;
	CheckboxGroup grp;
	public void init()
	{
		grp = new CheckboxGroup();
		red = new Checkbox("Red",grp,false);
		green = new Checkbox("Green",grp,false);
		yellow = new Checkbox("Yellow",grp,false);
		add(red);
		add(green);
		add(yellow);
		red.addItemListener(this);
		green.addItemListener(this);
		yellow.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent e)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		msg = grp.getSelectedCheckbox().getLabel();
		setBackground(Color.white);
		g.drawOval(50, 50, 52, 52); 
		g.drawOval(50, 103, 52, 52);
		g.drawOval(50, 156, 52, 52);
		if(msg.equalsIgnoreCase("Green"))
		{
			g.setColor(Color.green);
			g.fillOval(50, 156, 52, 52); 
			g.drawString("Go",110,190);
		}
		else if(msg.equalsIgnoreCase("yellow"))
		{
			g.setColor(Color.yellow);
			g.fillOval(50, 103, 52, 52); 
			g.drawString("Ready",110,135);
		}
		else if(msg.equalsIgnoreCase("red"))
		{
			g.setColor(Color.red);
			g.fillOval(50, 50, 52, 52); 
			g.drawString("Stop!",110,85);
		}
	}
	
