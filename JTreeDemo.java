import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;
/* <applet code= JTreeDemo width = 300 height = 300></applet>*/
public class JTreeDemo extends JApplet
{
	JTree t;
	public void init(){
		// Container c = getContentPane();
		// c.setLayout(new BorderLayout());
		DefaultMutableTreeNode top = new DefaultMutableTreeNode("Options");
		DefaultMutableTreeNode a = new DefaultMutableTreeNode("A");
		top.add(a);
		DefaultMutableTreeNode a1 = new DefaultMutableTreeNode("A1");
		a.add(a1);
		DefaultMutableTreeNode a2 = new DefaultMutableTreeNode("A2");
		a.add(a2);
		DefaultMutableTreeNode b = new DefaultMutableTreeNode("B");
		top.add(b);
		DefaultMutableTreeNode b1 = new DefaultMutableTreeNode("B1");
		b.add(b1);
		DefaultMutableTreeNode b2 = new DefaultMutableTreeNode("B2");
		b.add(b2);
		t = new JTree(top);
		add(t);
		
	}


}