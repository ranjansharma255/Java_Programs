import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code = ChoiceDemo width = 300 height = 300 > </applet>*/
public class ChoiceDemo extends Applet implements ItemListener
{
	TextField t;
	Choice a,b;
	String msg = " ";
	public void init()
	{
		setLayout(new FlowLayout());
		t = new TextField(30);
		a = new Choice();
		a.addItemhi("CSE");
		a.addItemhi("CSIT");
		a.addItemhi("MECH");
		a.addItemhi("ECE");
		b = new Choice();
		b.addItem("1st Year");
		b.addItem("2nd Year");
		b.addItem("3rd Year");
		b.addItem("4th Year");
		a.addItemListener(this);
		b.addItemListener(this);
		add(new Label("This is MREC Student"));
		add(new Label("Enter your Branch"));
		add(a);
		add(new Label("Enter the year"));
		add(b);
		add(t);
	}
	public void itemStateChanged(ItemEvent e)
	{
		t.setText("I am "+a.getSelectedItem()+" "+b.getSelectedItem()+"Student");
	}
	public void paint(Graphics g)
	{
		showStatus("MREC STUDENT DETAILS");
	}
}















