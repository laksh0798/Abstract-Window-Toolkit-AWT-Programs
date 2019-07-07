package awt;
import java.awt.*;
import java.applet.Applet;
import java.applet.*;
import java.awt.event.*;
public class check extends Applet implements ActionListener{
	Checkbox ch1 , ch2;	
	Label l;
	check(){
		Frame f = new Frame();
		f.setVisible(true);
		f.setLayout(null);
		f.setBounds(100, 100, 500, 400);
		ch1 = new Checkbox("java");
		ch1.setBounds(50, 100, 50, 50);
		ch2 = new Checkbox("c++");
		ch2.setBounds(50, 150, 50, 50);
		f.add(ch1);
		f.add(ch2);
		l = new Label();
		l.setBounds(50, 250, 150, 50);
		f.add(l);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		}); 
		ch1.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				l.setText("java checkbox"
						+(e.getStateChange()==1?"checked":"unchecked"));
			}
		});
		
		ch2.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				
				l.setText("c++ checkbox"
						+(e.getStateChange()==1?"checked":"unchecked"));
			}
		});
}
	
	
	
	public static void main(String args[])
		{
			check ch = new check();
		}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
