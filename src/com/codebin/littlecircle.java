package com.codebin;

import javax.swing.*;
import java.awt.*;

public class littlecircle extends JComponent {

    public littlecircle(){




    }


    public void paintComponent(Graphics g){
        //Vous verrez cette phrase chaque fois que la méthode sera invoquée
        System.out.println("Je suis un petit cercle !");
        g.fillOval(5, 5, 15, 15);
    }


}
