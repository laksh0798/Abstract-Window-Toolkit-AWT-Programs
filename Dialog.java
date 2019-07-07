package awt;
import java.awt.*;
public class Dialog {
	static Dialog d;
	public Dialog()
	{
		Frame f= new Frame();
		f.setBounds(100, 100, 500, 500);
//		 d = new Dialog(f , "Dialog Example", true);  
		
	}
	
	
	public static void main(String args[])
		{
		Dialog d = new Dialog();	
		}
}
