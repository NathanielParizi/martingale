// SqauresPanel.java
// by Nathaniel PArizi
// CSCI 1302
// Lab 2
// 7/12/2016

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.BorderFactory;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


import java.util.ArrayList;
import java.util.Random;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;

public class SquaresPanel extends JPanel
{
   private final int SIZE = 10, DELAY = 30; 
   private ArrayList<Point> pointList;
   private ImageIcon image;
   private Timer timer;
   private int  x, y;
   private Color[] w = new Color[1000]; private int q=0;
   private int[] z = new int[1000];
   private int g;
   private int a =2;
   private int[] Xrandom = new int[1000];
   private int[] Yrandom = new int[1000];
  
   int WHEELSIZE[] = new int[1000];
   
   
   //-----------------------------------------------------------------
   //  Constructor: for panel to listen to mouse events.
   //-----------------------------------------------------------------
   public SquaresPanel()
   {

      pointList = new ArrayList<Point>();
      SquaresListener listener = new SquaresListener();
      addMouseListener (listener);
      addMouseWheelListener(listener);

      addMouseMotionListener(listener);
      Random rand = new Random();
   	  timer = new Timer(DELAY, new ReboundListener());
   	  image = new ImageIcon("C:\\Users\\go\\workspace\\DotsLAB2\\src\\square.png");
   	   
   			  Xrandom= new int [1000];
   	  		  Yrandom= new int [1000];
   	  		  
   
   	  		  
   	  		  
   	  		  
   	  		  //============ Color Loop ========================================================
   	  		
    	 
    	  
    	  for(int c=0; c <= 999; c++){
    		  
    	int	 R = rand.nextInt(255);
    	int G = rand.nextInt(255);
    	int B = rand.nextInt(255);
    		  
    	
    	
    		  Color customColor = new Color(G,B,R);
    		
    		
    	  w[c] = (customColor);
    	   
    	  
    	  }
   	  		  
   	  		  
   	  		  
   //===============Random Motion	  		  
   	  		for(int i=0; i<Xrandom.length; i++){	
   	 int g = rand.nextInt(2); 
   	  		Xrandom[i] = rand.nextInt(10)+1;
  
   	  			if (g == 1)
   	  			{ Xrandom[i] = Xrandom[i]*-1;}  		}
   	  		
   	  		
   	  		for(int i=0; i < Yrandom.length; i++){
   	  			Yrandom[i] = rand.nextInt(10)+1;
   	  			
   	  		if (g == 1)
	  			{ Yrandom[i] = Yrandom[i]*-1;}

   	  		}
      setBackground(Color.black);
      setPreferredSize(new Dimension(400, 300));

      timer.start();
   }

   //-----------------------------------------------------------------
   //Draws squares
   //-----------------------------------------------------------------
   public void paintComponent(Graphics page)
   {
	   
      super.paintComponent(page);
      image.paintIcon(this, page, x, y);
      int R = (int)(Math.random()*256);
      int G = (int)(Math.random()*256);
      int B = (int)(Math.random()*256);
      
    
      Color randomColor = new Color(R, G, B);
     
      int e = 0;
      
      //page.setColor(w[q]);
     

      for (Point spot : pointList){
    	 
    	  page.setColor(w[e]);
    
    	  
		  for(int f=0; f <= 999; f++){
			 page.fillRect(spot.x, spot.y, SIZE+a, SIZE+a);
	    	  
	    	  }
    	  
    	
   
      page.drawString("Count: " + pointList.size(), 5, 15);
      e++;
   }}
   


   //*****************************************************************
   //  Mouse Listener
   //*****************************************************************
   private class SquaresListener implements MouseListener, MouseMotionListener, MouseWheelListener
   {
      //--------------------------------------------------------------
      //  Adds the current point to the list of points and redraws
      //  the panel whenever the mouse button is pressed.
      //--------------------------------------------------------------
      public void mousePressed(MouseEvent event)
      {
    	  ////////////////////////
    	  
    	q++;
    	  
    	
    	  
         pointList.add(event.getPoint());
         repaint();
      }
    
      
      
      public void mouseDragged(MouseEvent event)
      {
    	
    	
    	
          pointList.add(event.getPoint());
          repaint();
    
      }
      

      //--------------------------------------------------------------
      //  Mouse 
      //--------------------------------------------------------------
      public void mouseClicked(MouseEvent event) {}
      public void mouseReleased(MouseEvent event) {}
      public void mouseEntered(MouseEvent event) {}
      public void mouseExited(MouseEvent event) {}
      
      public void mouseMoved(MouseEvent event){}
   
    
    	    



	@Override
	public void mouseWheelMoved(MouseWheelEvent event) {
// Increase Blocks size by wheel
		
		int steps = event.getWheelRotation();

		  if (steps < 0) {

   a = a +5;



		  } else {

	
		
		a = a - 5;

		  }



		//============ Size Loop 
		

	  		
   	 


		
	}
   }
   private class ReboundListener implements ActionListener
   {
	   public void actionPerformed(ActionEvent event)
	   {
		   
		   Random rand = new Random();
	
		    int counter =0;
		   for (Point spot : pointList)
		   {
			   counter += 1;
			  
			   
			   spot.x += Xrandom[counter];	
		       spot.y += Yrandom[counter]; 
		   
		   if (spot.x <= SIZE || spot.x >= getWidth() - SIZE)
	   			Xrandom[counter] = Xrandom[counter]  * -1;		   		
		   if (spot.y <= SIZE || spot.y >= getHeight() - SIZE )
			   Yrandom[counter] = Yrandom[counter] * -1;
		   }
	   		repaint();
		   	
	   }
   }
}