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
    private JButton button1;
    private JTextField textField1;
    private JTextField textField2;
    private JButton envoyerInfosButton;
    private JLabel monPseudo;
    private JTextField textField3;
    private JButton boutonPseudo;
    private JComboBox comboBoxDiff;
    private JLabel labelDiff;
    private JTextField textFieldDiff;
    private int choixCombo;
    private int infoConnexionOk;
    private int infoPseudoOk;
    private int choixDifficulte;
    private int infoChoixDiffClicked;



    HashMap<String, Color> indice = new HashMap<>();
    ArrayList<String> couleur = new ArrayList<>();
    HashMap<String, String> circleColor = new HashMap<>();



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
        comboBoxChoix.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                String choix1 = "Mode classique";
                String choix2 = "Mode compétition";
                String choix3 = "Mode aventurier";

                if(comboBoxChoix.getSelectedItem().equals(choix1)){
                    choixCombo = 1;
                    System.out.println("hmmmmm");
                }else if(comboBoxChoix.getSelectedItem().equals(choix2)){
                    choixCombo = 2;
                }else if (comboBoxChoix.getSelectedItem().equals(choix3)){

                    choixCombo = 3;

                };
            }
        });


        envoyerInfosButton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                infoConnexionOk++;
            }
        });
        boutonPseudo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infoPseudoOk++;
                System.out.println(infoPseudoOk);
            }
        });

        envoyerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                infoChoixDiffClicked ++;
                choixDifficulte = 0;
                choixDifficulte =Integer.parseInt(textFieldDiff.getText());
                menuDifficulte(choixDifficulte, textArea1);

            }
        });
    }

    public void setColorCircle(circle c) {

        String color = circleColor.get(c.getToolTipText());
        int i = couleur.indexOf(color);

        int maxSize = couleur.size();
        i++;
        if (i == maxSize) i = 0;
        color = couleur.get(i);

        circleColor.remove(c.getToolTipText());
        circleColor.put(c.getToolTipText(), color);

        c.setForeground(this.indice.get(color));

        System.out.println(color);

    }





    public void ecrire (String t){
        textArea1.setText(t);

    }

    public int getChoixCombo(){


        return choixCombo;


    }

    public void removeTextArea1() {
        textArea1.removeAll();
    }


    public JPanel panel1() {
        return panel1;
    }

    public void writeTextArea1(String str) {
        textArea1.append(" - " + str +"\n");

    }

    public String getTextAdresseIP(){

        return textField1.getText();


    }
    public String getTextPort(){

        return textField2.getText();
    }


    public int getInfoConnexionOk(){

        return infoConnexionOk;



    }

    public String getTextPseudo(){

        return textField3.getText();

    }
    public void afficherElementsPseudo(){

        textField3.setVisible(true);
        boutonPseudo.setVisible(true);
        monPseudo.setVisible(true);

    }

    public void afficherElementsDifficulte(){

        labelDiff.setVisible(true);
        textFieldDiff.setVisible(true);


    }

    public int getInfoPseudoOk(){

        return infoPseudoOk;

    }

    public static void menuDifficulte(int choixDifficulte, JTextArea a) {

        String str = new String("- Difficulté " + choixDifficulte + "\n");

        switch (choixDifficulte) {

            case (1):
                a.append(str);
                break;
            case (2):
                a.append(str);
                break;
            case (3):
                a.append(str);
                break;
            case (4):
                a.append(str);
                break;
            case (5):
                a.append(str);
                break;
            case (6):
                a.append(str);
                break;
            default:
                a.append("Hacked by mastermind");

        }


    }

        public int getInfoChoixDiffClicked(){


        return infoChoixDiffClicked;

        }

    public int getChoixDifficulte() {
        return choixDifficulte;
    }
}



















