package awt;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class menubar {
	public menubar()
	{
		Frame f = new Frame();
		f.setBounds(100, 100, 500, 500);
		MenuBar mb =  new MenuBar();
		Menu m = new Menu("file");
		Menu sub= new Menu("Submenu");
		MenuItem m1 = new MenuItem("New"); 
		MenuItem m2 = new MenuItem("OPen"); 	
		MenuItem m3 = new MenuItem("Save");
		MenuItem m4 = new MenuItem("Quit");
		MenuItem m5 = new MenuItem("sQuit");
		m.add(m1);
		m.add(m2);
		sub.add(m3);
		m.add(m4);
		sub.add(m5);
		f.setMenuBar(mb);
		mb.add(m);
		m.add(sub);
		f.setLayout(null);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		}); 
	}
	
	public static void main(String args[])
			{
		menubar m = new menubar();		
			}
}
