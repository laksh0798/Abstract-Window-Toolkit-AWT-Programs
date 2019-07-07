package awt;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class list {
	
	public list()
	{
		Frame f = new Frame();
		f.setBounds(100, 100, 500, 500);
		List l = new List(5);
		l.setBounds(100, 100, 150, 50);
		Label lb = new Label();
		lb.setBounds(100, 150, 200, 50);
		Button btn = new Button("Submit");
		btn.setBounds(100, 200, 50, 50);
		l.add("laxman");
		l.add("niraj");
		l.add("vijay");
		l.add("krushna");
		l.add("gopal");
		f.add(l);
		f.add(btn);
		f.add(lb);
		f.setLayout(null);
		f.setVisible(true);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		}); 
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				String data = "selected item from list is " + l.getSelectedItem();
				lb.setText(data);
			}
		});
	}
		public static void main(String args[])
		{
			list l = new  list();
		}
}
