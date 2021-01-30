import java.awt.*;
class FrameDemo extends Frame
{
	String s1,s2,s3;
	Font f1,f2,f3;
	FrameDemo()
	{
		s1 = "Hello-1";
		s2 = "Hello-2";
		s3 = "Hello-3";
	}
	public void paint(Graphics g)
	{
		f1 = new Font("Time New Roman",Font.BOLD, 20);
		g.setFont(f1);
		g.setColor(Color.red);
		g.drawString(s1,10,100);
		
		f2 = new Font("Serif",Font.ITALIC, 15);
		g.setFont(f2);
		g.setColor(Color.blue);
		g.drawString(s2,150,120);
		
		f3 = new Font("Time New Roman",Font.PLAIN, 35);
		g.setFont(f3);
		g.setColor(Color.green);
		g.drawString(s3,240,150);
	}
	public static void main(String [] args)
	{
		FrameDemo f = new FrameDemo();
		f.setTitle("Frame Demo");
		f.setVisible(true);
		f.setSize(500,500);
	}
}