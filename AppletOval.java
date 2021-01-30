import java.awt.*;
import java.applet.*;
/*<applet code=AppletOval width=500 height=500></applet>*/
public class AppletOval extends Applet
{
	public void paint(Graphics g)
	{
		showStatus("applet oval program");
		g.drawOval(20,20,50,50);
		g.fillOval(20,20,50,50);
		g.drawOval(60,60,30,40);
		g.fillOval(250,250,30,40);
	}
}