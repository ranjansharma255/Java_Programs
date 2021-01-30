import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code = TextFieldDemoLab width = 300 height = 300 > </applet>*/
public class TextFieldDemoLab extends Applet implements ActionListener
{
	Label l1,l2;
	TextField t1,t2;
	public void init()
	{
		l1 = new Label("Enter Username");
		l2 = new Label("Enter Password");
		
		t1 = new TextField(10);
		t2 = new TextField(10);
		t2.setEchoChar('*');
		add(l1);
		add(t1);
		t1.addActionListener(this);
		
		add(l2);
		add(t2);
		t2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		repaint();
	}
	public void paint(Graphics g)
	{
		g.drawString("Username : "+t1.getText(),10,200);
		g.drawString("Password : "+t2.getText(),10,240);
		showStatus("Press Enter After Typing");
	}
}