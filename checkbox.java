package awt;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
public class checkbox extends Applet{
		
			public checkbox()
			{
				Frame f = new Frame();
				f.setBounds(100, 100, 500, 500);
				Label l = new Label();
				l.setBounds(100, 250, 250, 25);
				l.setText("hiii i am laxman");
				Checkbox ch1= new Checkbox("Bold");
				Checkbox ch2 = new Checkbox("Italic");
				Checkbox ch3 = new Checkbox("Underline");
				ch1.setBounds(100, 100, 60, 20);
				ch2.setBounds(100, 150, 60, 20);
				ch3.setBounds(100, 180, 60, 20);
				Font f1 = new Font("", Font.BOLD, 15);
				Font f2 = new Font("", Font.ITALIC, 15);
				f.add(ch1);
				f.add(ch2);
				f.add(ch3);
				f.add(l);
				f.setLayout(null);
				f.setVisible(true);
				ch1.addItemListener(new ItemListener() {
					
					@Override
					public void itemStateChanged(ItemEvent e) {
						// TODO Auto-generated method stub
						l.setFont(f1);
//						e.getStateChange() ==1? (l.setFont(f1)): (l.setFont(f2));
					}
				});
ch2.addItemListener(new ItemListener() {
					
					@Override
					public void itemStateChanged(ItemEvent arg0) {
						// TODO Auto-generated method stub
						l.setFont(f2);
					}
				});
			}
}
