package awt;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class panel {
	public panel()
	{
		Frame f =  new Frame();
		f.setBounds(100, 100, 500, 500);
		Panel p =  new Panel();
		p.setBounds(150, 150, 120, 120);
		p.setBackground(Color.WHITE);
		Button btn1 = new Button("Orange");
		btn1.setBackground(Color.CYAN);
		Button btn2 = new Button("Red");
		btn2.setBackground(Color.MAGENTA);
		btn1.setBounds(50, 50, 50, 20);
		btn2.setBounds(120, 50, 50, 20);
		p.add(btn1);
		p.add(btn2);
		f.add(p);
		f.setLayout(null);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		}); 
		btn1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				p.setBackground(Color.ORANGE);
			}
		});
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				p.setBackground(Color.RED);
			}
		});
	}
	
	public static void main(String args[])
		{
		panel p = new panel();	
		}
}
