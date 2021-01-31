import java.awt.*;
import javax.swing.*;

/* <applet code= JTableDemo width = 300 height = 300></applet>*/
public class JTableDemo extends JApplet
{
	public void init(){
		setLayout(new BorderLayout());
		final Object[] colHeads = {"Name","Phone","Fax"};
		final Object[][] data = {{"Ajay","Ranjan","9908968372"},{"Ajay","Ranjan","9908968372"}};
		JTable table = new JTable(data,colHeads);
		add(table);
	}
}
