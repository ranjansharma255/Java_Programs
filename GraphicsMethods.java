import java.awt.*;
import java.applet.*;
/*<applet code="GraphicsMethods" width=500 height=500>	</applet>*/
public class GraphicsMethods extends Applet
{
	public void init()
	{
		setBackground(Color.white);
		setForeground(Color.blue);
	}
	public void paint(Graphics g)
	{
		g.drawString("Ranjan Sharma",200,250);
		g.drawRect(100,120,100,40);
		g.fillRect(100,170,100,40);
	}
}