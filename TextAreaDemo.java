import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code = TextAreaDemo width = 300 height = 300 > </applet>*/
public class TextAreaDemo extends Applet implements TextListener
{
	Label l1,l2;
	TextArea t1,t2;
	public void init()
	{
		setLayout(new GridLayout(2,2));
		l1 = new Label("Editable Text");
		l2 = new Label("Non-Editable Text");
		t1 = new TextArea(10,50);
		t2 = new TextArea(10,50);
		t2.setEditable(false);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		t1.addTextListener(this);
		t2.addTextListener(this);
	}
	public void textValueChanged(TextEvent t)
	{
		t2.setText(t1.getText());
		
	}
	public void paint(Graphics g)
	{
		showStatus("TextArea is Displayed");
	}
}