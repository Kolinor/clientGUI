package com.codebin;

import javax.swing.*;
import java.awt.*;

public class square extends JComponent {

    public square(){



    }





        public void paintComponent(Graphics g){
            //Vous verrez cette phrase chaque fois que la méthode sera invoquée
            System.out.println("Je suis un petit carre !");
            g.fillRect(5,5,18,18);

        }

}
