
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.applet.*;
import javax.swing.*;
public class First implements ActionListener{

	TextField tf1,tf2;
	Button b1,b2;
	Label l  = new Label();
	First()
	{
		Frame f = new Frame();
		tf1.setBounds(100, 100, 150, 40);
		tf2.setBounds(100, 150, 150, 40);
		b1= new Button("+");
		b2= new Button("-");
		b1.setBounds(50, 200, 80, 50);
		b1.setBounds(50, 300, 80, 50);
		l.setBounds(80, 200, 50, 100);
		b2.addActionListener(this);
		f.setVisible(true);
		f.setBounds(200, 200, 300, 150);
		f.add(b1);
		f.add(b2);
		f.add(tf1);
		f.add(tf2);
		f.add(l);
		f.setLayout(null);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		}); 
	}
	
	public static void main(String args[])
		{
		First f = new First();
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		String s1 = tf1.getText();
		String s2 = tf2.getText();
		
		int a = Integer.parseInt(s1);
		int b = Integer.parseInt(s2);
		l.setText(s1);
		 if(e.getSource()==b1){  
	           int c=a+b;
	          
	        }else if(e.getSource()==b2){  
	            int c=a-b;  
	        }  
//		 l.setText(c);
		
	}
}
