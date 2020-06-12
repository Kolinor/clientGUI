package com.codebin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;



public class mastermindgui  {
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




    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {







        Utility u = new Utility();
        IOCommand command = new IOCommand(u);

        boolean connexion = command.connexion("192.168.1.17", 6002);



         //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");



        JFrame frame = new JFrame("Mastermind");
        frame.setContentPane(new mastermindgui().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1350,700);
        frame.setLocationRelativeTo(null);

        textArea1.ecrire();
        //UIManager.setLookAndFeel(javax.swing.plaf.metal.MetalLookAndFeel);

        // c'est un début elle est pas encore terminé
        //oui sauf le mode duel là je travail sur le chargement de la partie
        if(!connexion) return;
        command.run();
        String str = "";
        String choix = "";
        int difficulty;
        int select;



        command.ecrireEcran("Quel est ton login ?");
        command.ecrireReseau(command.lireEcran(""));
        Thread.sleep(100);

        do {
            command.ecrireEcran("Que voulez vous faire ?");
            command.ecrireEcran("1. Mode classique\n2. Mode compétition\n3. Mode aventure\n5. quit");
            choix = command.lireEcran("");

            if (choix.equals("1")) {
                str = command.lireEcran("Quel niveaux de difficultés voulez-vous ?");
                difficulty = Integer.parseInt(str);
                System.out.println(str);
                command.ecrireReseau("!1 " + str);

                while (true) {
                    if (u.getWin()) break;
                    if (u.getLoose()) break;
                    command.ecrireEcran("Choisir une combinaison");
                    u.couleurDisponible();
                    str = command.lireEcran("Rentrer une combinaison de " + difficulty + " couleurs ou 'quit'");
                    if (str.equals("quit")) {
                        command.ecrireReseau("stop");
                        break;
                    }
                    command.ecrireReseau("!1 " + str);
                }
            } else if (choix.equals("2")) {

            } else if (choix.equals("3")) {
                command.ecrireEcran("Bienvenue dans le mode aventure !");
                str = command.lireEcran("1. Nouvelle partie\n2. Charger une partie");
                select = Integer.parseInt(str);
                command.ecrireReseau("!3 " + str);
                if (select == 1) {
                    difficulty = 1;
                    while (difficulty == 10 || !str.equals("quit")) {
                        command.ecrireReseau("!3 " + difficulty);
                        while (true) {
                            Thread.sleep(100);
                            if (u.getWin()) break;
                            if (u.getLoose()) break;
                            command.ecrireEcran("Choisir une combinaison");
                            u.couleurDisponible();
                            str = command.lireEcran("Rentrer une combinaison de " + u.getDifficulty() + " couleurs ou 'quit' ou save");
                            if (str.equals("save")) {
                                str = command.lireEcran("Rentrer un nom à la sauvegarde");
                                command.ecrireReseau("!3 " + "save " + str + " " + difficulty);
                                Thread.sleep(100);
                                str = "quit";
                            }
                            if (str.equals("quit")) {
                                command.ecrireReseau("stop");
                                break;
                            }
                            command.ecrireReseau("!1 " + str);
                        }
                        if (difficulty == 10) command.ecrireEcran("Vous avez terminé le mode aventure !");
                        difficulty++;
                    }
                } else {

                }
            }

            ArrayList<String> t = new ArrayList<>();



        } while(!choix.equals("5"));
        command.ecrireReseau("quit");
        command.deconnexion();















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