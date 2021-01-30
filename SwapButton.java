import java.awt.*;
import java.awt.event.*;

public class SwapButton extends Frame implements ActionListener
{
	Label l1,l2;
	TextField t1,t2;
	Button b;
	SwapButton()
	{
		super("My Frame");
		l1 = new Label("First");
		l2 = new Label("Second");
		
		t1 = new TextField(10);
		t2 = new TextField(10);
		
		b = new Button("Swap Cheysey");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		setLayout(new FlowLayout());
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String temp = t1.getText();
		t1.setText(t2.getText());
		t2.setText(temp);
	}
	public static void main(String[] args)
	{
		SwapButton f = new SwapButton();
		f.setSize(300,300);
		f.setVisible(true);
	}
	
}