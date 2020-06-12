package com.codebin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;



public class mastermindgui extends Container {
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JComboBox comboBoxChoix;
    private JButton envoyerButton;
    private JButton sauvegarderMaPartieButton;
    private littlecircle littlecircle4;
    private littlecircle littlecircle5;
    private littlecircle littlecircle13;
    private littlecircle littlecircle14;
    private littlecircle littlecircle15;
    private littlecircle littlecircle16;
    private littlecircle littlecircle17;
    private littlecircle littlecircle19;
    private littlecircle littlecircle20;
    private littlecircle littlecircle21;
    private circle circle12;
    private circle circle11;
    private circle circle13;
    private circle circle14;
    private JTextArea textArea1;


    HashMap<String, Color> indice = new HashMap<>();
    ArrayList<String> couleur = new ArrayList<>();
    HashMap<String, String> circleColor = new HashMap<>();

    public JPanel panel1() {
        return panel1;
    }

    public void writeTextArea1(String str) {
        textArea1.setText(str);
    }

    public mastermindgui(){


        couleur.add("rouge");
        couleur.add("jaune");
        couleur.add("bleu");
        couleur.add("vert");
        couleur.add("noir");
        couleur.add("blanc");

        indice.put("rouge", new Color(255, 0, 15));
        indice.put("jaune", new Color(255, 224, 13));
        indice.put("bleu", new Color(40, 68, 227));
        indice.put("vert", new Color(44, 227, 0));
        indice.put("noir", new Color(0, 0, 0));
        indice.put("blanc", new Color(255, 255, 255));

        circleColor.put(couleur.get(0), circle11.getToolTipText());
        circleColor.put(couleur.get(0), circle12.getToolTipText());

        circle11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle11);

            }
        });
        circle12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle12);
            }
        });
        circle13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle13);
            }
        });
        circle14.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle14);
            }
        });
        comboBoxChoix.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        comboBoxChoix.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {

                System.out.println(comboBoxChoix.getSelectedItem());
            }
        });
    }

    public void setColorCircle(circle c) {

        String color = circleColor.get(c.getToolTipText());
        int i = couleur.indexOf(color);
        System.out.println(i);
        int maxSize = couleur.size();
        System.out.println(maxSize);
        i++;
        System.out.println(i);
        if (i == maxSize) i = 0;
        color = couleur.get(i);
        circleColor.remove(c.getToolTipText());
        circleColor.put(c.getToolTipText(), color);

        c.setForeground(this.indice.get(color));

    }

    public void ecrire (String t){
        textArea1.setText(t);

    }
}