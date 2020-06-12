package com.codebin;

import javax.swing.*;
import java.awt.*;

public class bigcircle extends JComponent {

    public  bigcircle(){


    }

    public void paintComponent(Graphics g){
        //Vous verrez cette phrase chaque fois que la méthode sera invoquée
        System.out.println("Je suis un gros cercle!");
        g.fillOval(0, 0, 50, 50 );
    }

}
