import java.awt.*;
import java.applet.*;
/*<applet code=AppletRect width=500 height=500></applet>*/
public class AppletRect extends Applet
{
	public void paint(Graphics g)
	{
		g.drawString("Types of rectangles ",10,10);
		g.drawRect(20,20,100,60);
		g.fillRect(20,20,100,60);
		g.drawRoundRect(200,20,70,60,20,20);
		g.fillRoundRect(200,20,70,60,20,20);
		showStatus("This is Rectangles applet program");
	}
}