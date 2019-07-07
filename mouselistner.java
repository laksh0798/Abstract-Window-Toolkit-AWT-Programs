package awt;

import java.applet.Applet;
import java.awt.event.ActionListener;
import java.awt.event.MouseListener;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.event.*;

public class mouselistner extends Frame implements MouseMotionListener{
    Label l = new Label();  
   mouselistner(){  
       addMouseMotionListener(this);  
       
       setSize(300,300);  
       setLayout(null);  
       setVisible(true);  
   }  
public void mouseDragged(MouseEvent e) {  
   Graphics g=getGraphics();  
   g.setColor(Color.RED);  
   g.fillOval(e.getX(),e.getY(),20,20);  
}  
public void mouseMoved(MouseEvent e) {}  
    public static void main(String args[])
    {
    	mouselistner m = new mouselistner();
    }
}

