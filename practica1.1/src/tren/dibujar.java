package tren;
import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JOptionPane;

public class dibujar  extends JPanel{
	public void paintComponent(Graphics h) 
	{
		super.paintComponent(h);
		this.setBackground(Color.WHITE);
		
		
		h.setColor(Color.BLACK);
		h.fillOval(25, 40, 40, 40);
		h.setColor(Color.BLACK);
		h.fillOval(85, 40, 40, 40);
		h.setColor(Color.RED);
		h.fillRect(25, 25, 100, 30);
		h.setColor(Color.BLUE);
		h.fillRect(125, 50, 30, 10);
		
		
		h.setColor(Color.BLACK);
		h.fillOval(155, 40, 40, 40);
		h.setColor(Color.BLACK);
		h.fillOval(215, 40, 40, 40);
		h.setColor(Color.YELLOW);
		h.fillRect(155, 25, 100, 30);
		h.setColor(Color.BLUE);
		h.fillRect(255, 50, 30, 10);
		
		
		h.setColor(Color.BLACK);
		h.fillOval(280, 40, 40, 40);
		h.setColor(Color.BLACK);
		h.fillOval(340, 40, 40, 40);
		h.setColor(Color.GREEN);
		h.fillRect(280, 25, 100, 30);
		h.setColor(Color.BLUE);
	
	}

}
