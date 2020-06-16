package com.codebin;


import javax.swing.JComponent;
import java.awt.*;

public class Circle extends JComponent {

    public Circle(){


    }

    public void paintComponent(Graphics g){
        //Vous verrez cette phrase chaque fois que la méthode sera invoquée
        //System.out.println("Je suis un cercle normal !");
        g.fillOval(0, 0, 50, 50 );
    }
}
