package awt;
import java.applet.Applet;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
public class scrollbar extends Applet {
	
	public scrollbar()
	{
		Frame f = new Frame();
		Label l =  new Label();
		l.setBounds(100, 50, 200, 400);
		f.setBounds(100, 100, 500, 400);
		Scrollbar s = new Scrollbar();
		s.setBounds(250, 100, 20, 100);
		TextArea ta = new TextArea();
		ta.setBounds(100, 100, 150, 100);
		f.add(s);
		
		f.setLayout(null);
		f.setVisible(true);
		f.add(ta);
		f.add(l);
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent we)
			{
				System.exit(0);
			}
		}); 
		s.addAdjustmentListener(new AdjustmentListener() {
			
			@Override
			public void adjustmentValueChanged(AdjustmentEvent e) {
				// TODO Auto-generated method stub
				l.setText("vertical scrollbar value is " + s.getValue());
			}
		});
	}
//		public static void main(String args[])
//		{
//			scrollbar sb= new scrollbar();
//		}
}
