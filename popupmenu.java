package awt;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
public class popupmenu {
	public popupmenu()
	{
		Frame f = new Frame();
		f.setBounds(100, 100, 500, 500);
		PopupMenu p =  new PopupMenu("popup menu");
		MenuItem m1 = new MenuItem("cut");
		MenuItem m2 = new MenuItem("copy");
		MenuItem m3 = new MenuItem("paste");
		p.add(m1);
		p.add(m2);
		p.add(m3);
		f.add(p);
		f.setLayout(null);
		f.setVisible(true);
		f.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				p.show(f, e.getX(), e.getY());
			}
		});
	}
	
		public static void main(String args[])
		{
			popupmenu pop = new  popupmenu();
		}
}
