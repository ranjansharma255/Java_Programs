import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code=MouseEventsDemo width=500 height=500></applet>*/
public class MouseEventsDemo extends Applet implements MouseListener, MouseMotionListener
{
	int x=30,y=30;
	String msg="Mouse Events";
	public void init()
	{
		addMouseListener(this); 
		addMouseMotionListener(this);
	}
	public void mouseEntered(MouseEvent me)
	{
		msg="Mouse Entered";
		showStatus("Mouse Entered");
		repaint();
	}
	public void mouseExited(MouseEvent me)
	{
		msg="Mouse Exited";
		showStatus("Mouse Exited");
		repaint();
	}
	public void mousePressed(MouseEvent me)
	{
		msg="Mouse Pressed";
		showStatus("Mouse Pressed");
		repaint();
	}
	public void mouseReleased(MouseEvent me)
	{
		msg="Mouse Released";
		showStatus("Mouse Released");
		repaint();
	}
	public void mouseMoved(MouseEvent me)
	{
		msg="Mouse Moved";
		x=me.getX();
		y=me.getY();
		showStatus("Mouse Moved");
		repaint();
	}
	public void mouseClicked(MouseEvent me)
	{
		msg="Mouse Clicked";
		x=me.getX();
		y=me.getY();
		showStatus("Mouse Clicked");
		repaint();
	}
	public void mouseDragged(MouseEvent me)
	{
		showStatus("Mouse Dragged ("+me.getX()+","+me.getY()+")");
		repaint();
	}
	
	public void paint(Graphics g)
	{
		g.drawString(msg,x,y);
	}
}











