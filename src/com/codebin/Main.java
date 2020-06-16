package com.codebin;

import javax.swing.*;
import java.io.IOException;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException, ClassNotFoundException, UnsupportedLookAndFeelException, InstantiationException, IllegalAccessException {



        mastermindgui mgui = new mastermindgui();

        JFrame frame = new JFrame("Mastermind");
        frame.setContentPane(mgui.panel1());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(1350,700);
        frame.setLocationRelativeTo(null);

        String monAdresseIP;
        int monPort ;
        String monPseudo =null;
        ArrayList<String> couleur = new ArrayList<>();
        couleur = mgui.getCouleur();

        ArrayList<circle> l1 = new ArrayList<>();
        ArrayList<circle> l2 = new ArrayList<>();
        ArrayList<circle> l3 = new ArrayList<>();
        ArrayList<circle> l4 = new ArrayList<>();
        ArrayList<circle> l5 = new ArrayList<>();
        ArrayList<circle> l6 = new ArrayList<>();
        ArrayList<circle> l7 = new ArrayList<>();
        ArrayList<circle> l8 = new ArrayList<>();
        ArrayList<circle> l9 = new ArrayList<>();
        ArrayList<circle> l10 = new ArrayList<>();

        ArrayList<ArrayList<circle>> lignesC = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            switch (i) {
                case 0:
                    l1.add(mgui.getCircle1());
                    l1.add(mgui.getCircle2());
                    l1.add(mgui.getCircle3());
                    l1.add(mgui.getCircle4());
                    lignesC.add(l1);
                    break;
                case 1:
                    l2.add(mgui.getCircle5());
                    l2.add(mgui.getCircle6());
                    l2.add(mgui.getCircle7());
                    l2.add(mgui.getCircle8());
                    lignesC.add(l2);
                    break;
                case 2:
                    l3.add(mgui.getCircle9());
                    l3.add(mgui.getCircle10());
                    l3.add(mgui.getCircle11());
                    l3.add(mgui.getCircle12());
                    lignesC.add(l3);
                        break;
                case 3:
                    l4.add(mgui.getCircle13());
                    l4.add(mgui.getCircle14());
                    l4.add(mgui.getCircle15());
                    l4.add(mgui.getCircle16());
                    lignesC.add(l4);
                    break;
                case 4:
                    l5.add(mgui.getCircle17());
                    l5.add(mgui.getCircle18());
                    l5.add(mgui.getCircle19());
                    l5.add(mgui.getCircle20());
                    lignesC.add(l5);
                    break;
                case 5:
                    l6.add(mgui.getCircle21());
                    l6.add(mgui.getCircle22());
                    l6.add(mgui.getCircle23());
                    l6.add(mgui.getCircle24());
                    lignesC.add(l6);
                    break;
                case 6:
                    l7.add(mgui.getCircle25());
                    l7.add(mgui.getCircle26());
                    l7.add(mgui.getCircle27());
                    l7.add(mgui.getCircle28());
                    lignesC.add(l7);
                    break;
                case 7:
                    l8.add(mgui.getCircle29());
                    l8.add(mgui.getCircle30());
                    l8.add(mgui.getCircle31());
                    l8.add(mgui.getCircle32());
                    lignesC.add(l8);
                    break;
                case 8:
                    l9.add(mgui.getCircle33());
                    l9.add(mgui.getCircle34());
                    l9.add(mgui.getCircle35());
                    l9.add(mgui.getCircle36());
                    lignesC.add(l9);
                    break;
                case 9:
                    l10.add(mgui.getCircle37());
                    l10.add(mgui.getCircle38());
                    l10.add(mgui.getCircle39());
                    l10.add(mgui.getCircle40());
                    lignesC.add(l10);
                    break;
            }
        }

        while(true) {


            int retour = 0;
            retour  = mgui.getInfoConnexionOk();
            Thread.sleep(1000);
            if (retour == 0) {

                System.out.println("merde");


            } else {
                System.out.println("yes");
                monAdresseIP = mgui.getTextAdresseIP();
                monPort = Integer.parseInt(mgui.getTextPort());
                System.out.println(monPort);
                System.out.println(monAdresseIP);
                mgui.writeTextArea1("Connexion réussie");
                mgui.writeTextArea1("Adresse IP : " + monAdresseIP + " Port : " + monPort);

                break;

            }
        }

        //UIManager.setLookAndFeel("com.sun.java.swing.plaf.motif.MotifLookAndFeel");

        Utility u = new Utility(mgui.getLittlecircle1(), mgui.getLittlecircle2(), mgui.getLittlecircle3(), mgui.getLittlecircle4(), mgui.getTextArea1());
        IOCommand command = new IOCommand(u);

        boolean connexion = command.connexion(monAdresseIP, monPort);

        //UIManager.setLookAndFeel(javax.swing.plaf.metal.MetalLookAndFeel);

        // c'est un début elle est pas encore terminé
        //oui sauf le mode duel là je travail sur le chargement de la partie
        if(!connexion) return;
        command.run();
        String str = "";
        String choix = "";
        int menuChoix;
        int difficulty;
        int select;

        mgui.afficherElementsPseudo();

        mgui.writeTextArea1("Quel est ton login ?");

        while(true){

            int r =0;
            String verifieChaine;

            r = mgui.getInfoPseudoOk();
            verifieChaine = mgui.getTextPseudo();

            System.out.println(verifieChaine);
            
            Thread.sleep(1000);
            if ((r != 0) && (!verifieChaine.equals(""))) {

               monPseudo = mgui.getTextPseudo();
               mgui.writeTextArea1("Votre pseudo : " +monPseudo);


               break;
            }
        }

        command.ecrireEcran("Quel est ton login ?");

        //command.ecrireReseau(command.lireEcran(""));
        command.ecrireReseau(monPseudo);
        Thread.sleep(100);

        mgui.writeTextArea1("Tu peux maintenant choisir ton mode de jeu");
        int tour = 0;
        String c1;
        String c2;
        String c3;
        String c4;
        String getCircle;

        do {

            //mgui.writeTextArea1("Tu peux maintenant choisir ton mode de jeu");
            //command.ecrireEcran("Que voulez vous faire ?");
            //command.ecrireEcran("1. Mode classique\n2. Mode compétition\n3. Mode aventure\n5. quit");

            //choix = command.lireEcran("");

           menuChoix = mgui.getChoixCombo();
            System.out.println(menuChoix);

          // if(choix.equals("2"))
            if (menuChoix == 1) {

                mgui.afficherElementsDifficulte();

                System.out.print(menuChoix);
                System.out.print("nique ta mère");

                while(mgui.getInfoChoixDiffClicked() == 0) Thread.sleep(1000);

                //str = command.lireEcran("Quel niveaux de difficultés voulez-vous ?");

                str = new String(String.valueOf(mgui.getChoixDifficulte()));
                System.out.println(str);

                difficulty = Integer.parseInt(str);
                //System.out.println(str);
                command.ecrireReseau("!1 " + str);
                tour = 0;

                while (true) {
                    if (u.getWin()) break;
                    if (u.getLoose()) break;
                    command.ecrireEcran("Choisir une combinaison");
                    str = "";

                    while (!mgui.getButtonClicked()) Thread.sleep(100);
                    mgui.setButtonClicked(false);

                    if (tour == 1) {
                        System.out.println("aaa");
                    }

                    for (int i = 0; lignesC.get(tour).size() > i; i++) {
                        getCircle = lignesC.get(tour).get(i).getToolTipText();
                        System.out.println(couleur.indexOf(mgui.getCircleColor().get(getCircle)));
                        str += couleur.indexOf(mgui.getCircleColor().get(getCircle)) + " ";
                    }

                    if (str.equals("quit")) {
                        command.ecrireReseau("stop");
                        break;
                    }
                    command.ecrireReseau("!1 " + str);
                    tour++;
                }
           // } else if (choix.equals("2")) {
            } else if (menuChoix == 2) {

                System.out.println("pas de mode compétition");

            //} else if (choix.equals("3")) {
            } else if (menuChoix == 3) {
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
