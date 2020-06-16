package com.codebin;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.HashMap;

public class Utility {
    private ArrayList<String> couleur = new ArrayList<>();
    private boolean isWin = false;
    private boolean isLoose = false;
    private int difficulty;
    private LittleCircle c1;
    private LittleCircle c2;
    private LittleCircle c3;
    private LittleCircle c4;
    private JTextArea area;
    private HashMap<String, Color> indice = new HashMap<>();


    public Utility(LittleCircle c1, LittleCircle c2, LittleCircle c3, LittleCircle c4, JTextArea area) {
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;
        this.c4 = c4;
        this.area = area;
        indice.put("rouge", new Color(255, 0, 0));
        indice.put("orange", new Color(255, 127, 0));
        indice.put("vert", new Color(24, 227, 21));
    }

    public void couleurDisponible() {
        for (int i = 0; i < couleur.size(); i++) {
            System.out.println(i + " : " + couleur.get(i));
        }
    }

    public void setCouleurDisponible(String response) {
        String[] arrOfStr = response.split(" ");

        for (String s : arrOfStr)
            if (!s.equals("!couleur")) couleur.add(s);
    }

    public void getIndiceCouleur(String response) {
        String[] arrOfStr = response.split(" ");

        for (int i = 0; i < arrOfStr.length; i++) {
            switch (i) {
                case 1:
                    c1.setForeground(indice.get(arrOfStr[i]));
                    break;
                case 2:
                    c2.setForeground(indice.get(arrOfStr[i]));
                    break;
                case 3:
                    c3.setForeground(indice.get(arrOfStr[i]));
                    break;
                case 4:
                    c4.setForeground(indice.get(arrOfStr[i]));
                    break;
            }
        }
    }

    public void win(String response) {
        String[] arrOfStr = response.split(" ");
        isWin = true;
        this.area.append("Tu as gagné en " + arrOfStr[1] + " essai(s) !");
    }

    public boolean getWin() throws InterruptedException {
        Thread.sleep(100);
        if (isWin) {
            isWin = false;
            return true;
        }
        return isWin;
    }

    public void loose(String response) {
        String[] arrOfStr = response.split(" ");
        isLoose = true;
        this.area.append("Tu as perdu en " + arrOfStr[1] + " essai(s) !");
    }

    public boolean getLoose() throws InterruptedException {
        Thread.sleep(100);
        if (isLoose) {
            isLoose = false;
            return true;
        }
        return isLoose;
    }

    public void level(String response) {
        String[] arrOfStr = response.split(" ");
        difficulty = Integer.parseInt(arrOfStr[1]);

        System.out.println("Vous allez débuter le niveau : " + arrOfStr[1]);
    }

    public int getDifficulty() {
        return difficulty;
    }
}
