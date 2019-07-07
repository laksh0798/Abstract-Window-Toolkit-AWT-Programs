package awt;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class canvas  extends Applet{
	public void init()
	{
		
		
	}
	public void paint(Graphics g)
	{
		g.setColor(Color.black);
		g.fillRect(100, 100, 150, 150);
		g.setColor(Color.yellow);
		g.fillOval(100, 100, 150, 150);
		g.setColor(Color.white);
		g.fillOval(120, 150, 25, 40);
		g.fillOval(200, 150, 25, 40);
		g.setColor(Color.black);
		g.fillOval(130, 160, 15, 20);
		g.fillOval(210, 160, 15, 20);
		g.setColor(Color.pink);
		g.fillOval(130, 200, 80, 20);
	}
}
