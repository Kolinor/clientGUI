package com.codebin;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {
        Utility u = new Utility();
        IOCommand command = new IOCommand(u);

        boolean connexion = command.connexion("192.168.1.25", 6002);



        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");

        mastermindgui mgui = new mastermindgui();

        JFrame frame = new JFrame("Mastermind");
        frame.setContentPane(mgui.panel1());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1350,700);
        frame.setLocationRelativeTo(null);

        mgui.writeTextArea1("str");
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
}
