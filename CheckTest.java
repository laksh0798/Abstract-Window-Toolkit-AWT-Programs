package awt;

import java.awt.*;
import java.awt.event.*;
public class CheckTest extends Frame implements ItemListener
{
  Checkbox nameBox, boldBox, italicBox, exitBox;
  Label lab;
  public CheckTest()
  {
    nameBox = new Checkbox("Monospaced");
    boldBox = new Checkbox("Bold", true);
    italicBox = new Checkbox("Italic");
    lab = new Label("Way 2 Java");

    exitBox = new Checkbox();
    exitBox.setLabel("Close");
    exitBox.setState(false);
    exitBox.setBackground(Color.cyan);
    exitBox.setForeground(Color.blue);
    exitBox.setFont(new Font("Serif", Font.BOLD, 12));

    nameBox.addItemListener(this);
    boldBox.addItemListener(this);
    italicBox.addItemListener(this);
    exitBox.addItemListener(this);

    add(nameBox, "North");
    add(boldBox, "West");
    add(italicBox, "East");
    add(exitBox, "South");
    add(lab, "Center");

    System.out.println("exit box label: " + exitBox.getLabel());
    System.out.println("exit box state: " + exitBox.getState());

    setTitle("Check Boxes in Action");
    setSize(300, 300);               
    setVisible(true);
  }
  public void itemStateChanged(ItemEvent e)
  {
    String fontName = "";
    int b = 0, i = 0;
 
    if(nameBox.getState() == true)
         fontName = "Monospaced";
    else
         fontName = "Dialog";    

    if(boldBox.getState() == true)
         b = Font.BOLD;
    else
         b = Font.PLAIN;

    if(italicBox.getState() == true)
         i = Font.ITALIC;
    else
         i = Font.PLAIN;

    if(exitBox.getState() == true)
         System.exit(0);

    Font f1 = new Font(fontName, b+i, 20);
    lab.setFont(f1);
  }
  public static void main(String args[])
  {
    new CheckTest();
  }
}
