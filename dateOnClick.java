package awt;
import java.applet.Applet;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.SimpleDateFormat;
public class dateOnClick extends Applet{
	Font f1;
	public dateOnClick ()
	{
		Frame f = new Frame();
		f.setBounds(100, 100, 600, 500);
		Label l = new Label();
		l.setBounds(100, 100, 400, 20);
		f1 = new Font("Times New Roman", Font.BOLD, 24);
		f.add(l);
		f.setLayout(null);
		f.setVisible(true);
		l.setFont(f1);
		   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		f.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e)
			{
				l.setText(dtf.format(now));
			}
		
		});
	}
	
}
