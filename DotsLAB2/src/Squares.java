//********************************************************************
//  Dots.java       Author: Lewis/Loftus
//
//  Demonstrates mouse events.
//********************************************************************

import javax.swing.JFrame;

public class Squares
{
   //-----------------------------------------------------------------
   //  Creates and displays the application frame.
   //-----------------------------------------------------------------
   public static void main(String[] args)
   {
      JFrame frame = new JFrame("Dots");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      frame.getContentPane().add(new SquaresPanel());
      

      frame.pack();
      frame.setVisible(true);
   }
}
