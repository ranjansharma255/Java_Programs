import java.awt.*;
public class Myframe extends Frame
{
	Myframe()
	{
		this.setVisible(true);
		this.setSize(500,300);
		this.setTitle("This is my first Frame Program");
	}
	public static void main(String[] args)
	{
		FlowLayout f = new FlowLayout(FlowLayout.LEFT, 10,15);
		Myframe fr = new Myframe();
		fr.setLayout(f);
	}
}