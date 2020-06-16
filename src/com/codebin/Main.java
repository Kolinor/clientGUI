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


        Utility u = new Utility();
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

                while(mgui.getInfoChoixDiffClicked() == 0) System.out.println("boucled"); Thread.sleep(1000);

                //str = command.lireEcran("Quel niveaux de difficultés voulez-vous ?");

                str = new String(String.valueOf(mgui.getChoixDifficulte()));
                System.out.println(str);

                difficulty = Integer.parseInt(str);
                //System.out.println(str);
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
