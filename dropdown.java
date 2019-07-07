package awt;
import java.sql.*;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class dropdown extends Applet {
			
	public dropdown()
	{
		Frame f = new Frame();
		Choice c = new Choice();
		Label l = new Label();
        c.setBounds(100,100, 200,20);  
		c.add("java");
		c.add("c++");
		c.add("php");
		c.add("mysql");
		f.add(c);
		Button btn = new Button("Show");
		btn.setBounds(150, 100, 50, 50);
		f.add(btn);
		f.add(l);
		l.setBounds(150, 200,	200 , 100);
		f.setBounds(100, 100, 400, 400);
		f.setLayout(null);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		});
		btn.addActionListener(
				new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String data = "language selected = " + c.getItem(c.getSelectedIndex());
				l.setText(data);
			}
		});
	}
	
	
	
	
	public static void main(String args[])
			{
				dropdown dd = new dropdown();
			
			}
}
