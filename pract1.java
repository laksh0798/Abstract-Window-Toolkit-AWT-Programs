package awt;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class pract1 extends Applet {
	public pract1()
	{
		Frame f = new Frame();
		f.setBounds(100, 100, 500, 500);
		Choice c = new Choice();
		c.setBounds(100, 100, 150, 20);
		Button btn = new Button("Get Capital");
		btn.setBounds(100, 150, 150, 20);
		TextField tf = new TextField();
		tf.setBounds(100, 300, 300, 50);
		c.add("maharashtra");
		c.add("Gujrat");
		c.add("Rajsthan");
		f.add(c);
		f.add(btn);
		f.add(tf);
		f.setLayout(null);
		f.setVisible(true);
		btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String data = c.getSelectedItem();
				if(data == "maharashtra")
				{
					tf.setText("The capital of "+ data + " is mumbai");
				}else {
					if(data == "Gujrat")
					{
						tf.setText("The capital of "+ data + " is Ahamdabad");
					}
					else {
						if(data == "Rajsthan")
						{
						tf.setText("The capital of "+ data + " is Jaipur");
						}
					}
				}
			}
		});
		
	}
//		public static void main(String args[]) {
//			pract1 p = new pract1();
//		}
}
