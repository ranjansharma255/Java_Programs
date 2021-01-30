import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code= ButtonDemoLab1 width = 300 height = 300></applet>*/
public class ButtonDemoLab1 extends Applet implements ActionListener
{
	Button b1,b2,b3;
	String msg = " ";
	public void init(){
		b1 = new Button("Red");
		b2 = new Button("Green");
		b3 = new Button("Blue");
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
		if(s.equals("Red"))
		{
			setBackground(Color.red);
			showStatus("I pressed red Button");
		}
		else if(s.equals("Green"))
		{
			setBackground(Color.green);
			showStatus("I pressed green Button");
		}
		else if(s.equals("Blue"))
		{
			setBackground(Color.blue);
			showStatus("I pressed blue Button");
		}
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,0,100);
	}

}