package awt;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class toolkit {
		public static void main(String args[])
		{
		    Frame f=new Frame("ToolkitExample");  
		    Button b=new Button("beep");  
		    b.setBounds(50,100,60,30);  
		    f.add(b);     
		    f.setSize(300,300);  
		    f.setLayout(null);  
		    f.setVisible(true);  
		    b.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					Toolkit.getDefaultToolkit().beep();
				}
			});
		}
}
