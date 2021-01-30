import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code = "ButtonDemo" width = 500 height = 300>
</applet>
*/

public class ButtonDemo extends Applet implements ActionListener 
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
	public void actionPerformed(ActionEvent ae)
	{
		String s = ae.getActionCommand();
		if(s.equals("RED"))
		{
			setBackground(Color.red);
			msg = "I pressed on red color";
		}
		else if(s.equals("GREEN"))
		{
			setBackground(Color.green);
			msg = "I pressed on green color";
		}
		else 
		{
			if(s.equals("BLUE"))
			{
				setBackground(Color.blue);
				msg = "I pressed on blue color";		
			}
		}
		repaint();

	}
	
	public void paint (Graphics g)
	{
		
		g.drawString(msg,0,100);
		
	}
}