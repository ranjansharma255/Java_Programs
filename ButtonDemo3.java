import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="ButtonDemo3" width=500  height=500></applet>*/
public class ButtonDemo3 extends Applet implements ActionListener {
    Button b1, b2, b3;
    String msg = "  ";
    public void init() {
        b1 = new Button("red");
        b2 = new Button("green");
        b3 = new Button("blue");
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
		if(s.equals("red"))
		{
			setBackground(Color.red);
			showStatus("the red button is pressed");
		}
		else if(s.equals("green"))
		{
			setBackground(Color.green);
			showStatus("the green button is pressed");
		}
		else if(s.equals("blue"))
		{
			setBackground(Color.blue);
			showStatus("the blue button is pressed");
		}
        repaint();
    }
    public void paint(Graphics g) {
        g.drawString(msg, 0, 100);

    }
}