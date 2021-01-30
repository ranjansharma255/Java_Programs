import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code = ButtonDemoLab width = 300 height = 300 > </applet>*/
public class ButtonDemoLab extends Applet implements ActionListener
{
	Button b1,b2,b3;
	String msg = " ";
	public void init()
	{
		b1 = new Button("RED");
		b2 = new Button("GREEN");
		b3 = new Button("BLUE");
		add(b1);
		add(b2);
		add(b3);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s = e.getActionCommand();
		if(s.equals("RED"))
		{
			setBackground(Color.red);
			showStatus("I pressed red button");
		}
		else if(s.equals("BLUE"))
		{
			setBackground(Color.blue);
			showStatus("I pressed blue button");
		}
		else if(s.equals("GREEN"))
		{
			setBackground(Color.green);
			showStatus("I pressed green button");
		}
		repaint();
			
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,0,100);
	}
}