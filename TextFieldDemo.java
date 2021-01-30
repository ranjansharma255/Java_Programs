import java.awt.*;
import java.awt.event.*;
import java.applet.*;
/*<applet code="TextFieldDemo" width=300 height=400> </applet>*/

public class TextFieldDemo extends Applet implements TextListener
{
TextField t1, t2;
Label l1, l2;
public void init()
{
l1=new Label("Enter Username");
t1=new TextField(20);
l2=new Label("Enter Password");
t2=new TextField(20);
t2.setEchoChar('*');
add(l1); add(t1);  t1.addActionListener(this);
add(l2);  add(t2); t2.addActionListener(this);
}
public void actionPerformed(ActionEvent ae)
{
repaint();
}
public void paint(Graphics g)
{
g.drawString("UserName :"+t1.getText(),10,200);
g.drawString("Password :"+t2.getText(),300,200);
showStatus("Press enter after typing");
}
}
