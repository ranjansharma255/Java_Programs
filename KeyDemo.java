import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/* <applet code= KeyDemo width = 300 height = 300></applet>*/
public class KeyDemo extends Applet implements KeyListener
{
	String msg = " ";
	int x = 30, y = 30;
	public void init()
	{
		addKeyListener(this);
		requestFocus(true);
	}
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}
	public void keyPressed(KeyEvent e)
	{
		showStatus("key Pressed");
		repaint();
	}
	public void keyReleased(KeyEvent e)
	{
		showStatus("key Released");
		repaint();
	}
	public void keyTyped(KeyEvent e)
	{
		char ch = e.getKeyChar();
		if(ch == 'M' || ch == 'm')
			msg = "Good morning";
		else if(ch == 'E' || ch == 'e')
			msg = "Good Evening";
		else if(ch == 'A' || ch == 'a')
			msg = "Good Afternoon";
		repaint();
	}

}