package awt;
import java.io.*;
public class exam {
			public static void main(String args[])throws FileNotFoundException, IOException
			{
				InputStream obj = new FileInputStream("/home/laksh/Desktop/new.txt");
				System.out.println(obj.available());
			}
}
