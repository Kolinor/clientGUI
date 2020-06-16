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
    private circle circle1;
    private circle circle2;
    private circle circle3;
    private circle circle4;
    private circle circle5;
    private circle circle6;
    private circle circle7;
    private circle circle8;
    private circle circle9;
    private circle circle10;
    private circle circle13;
    private circle circle14;
    private circle circle15;
    private circle circle16;
    private circle circle17;
    private circle circle18;
    private circle circle19;
    private circle circle20;
    private circle circle21;
    private circle circle22;
    private circle circle23;
    private circle circle24;
    private circle circle25;
    private circle circle26;
    private circle circle27;
    private circle circle28;
    private circle circle29;
    private circle circle30;
    private circle circle31;
    private circle circle32;
    private circle circle33;
    private circle circle34;
    private circle circle35;
    private circle circle36;
    private circle circle37;
    private circle circle38;
    private circle circle39;

    public circle getCircle12() {
        return circle12;
    }

    public circle getCircle11() {
        return circle11;
    }

    public circle getCircle1() {
        return circle1;
    }

    public circle getCircle2() {
        return circle2;
    }

    public circle getCircle3() {
        return circle3;
    }

    public circle getCircle4() {
        return circle4;
    }

    public circle getCircle5() {
        return circle5;
    }

    public circle getCircle6() {
        return circle6;
    }

    public circle getCircle7() {
        return circle7;
    }

    public circle getCircle8() {
        return circle8;
    }

    public circle getCircle9() {
        return circle9;
    }

    public circle getCircle10() {
        return circle10;
    }

    public circle getCircle13() {
        return circle13;
    }

    public circle getCircle14() {
        return circle14;
    }

    public circle getCircle15() {
        return circle15;
    }

    public circle getCircle16() {
        return circle16;
    }

    public circle getCircle17() {
        return circle17;
    }

    public circle getCircle18() {
        return circle18;
    }

    public circle getCircle19() {
        return circle19;
    }

    public circle getCircle20() {
        return circle20;
    }

    public circle getCircle21() {
        return circle21;
    }

    public circle getCircle22() {
        return circle22;
    }

    public circle getCircle23() {
        return circle23;
    }

    public circle getCircle24() {
        return circle24;
    }

    public circle getCircle25() {
        return circle25;
    }

    public circle getCircle26() {
        return circle26;
    }

    public circle getCircle27() {
        return circle27;
    }

    public circle getCircle28() {
        return circle28;
    }

    public circle getCircle29() {
        return circle29;
    }

    public circle getCircle30() {
        return circle30;
    }

    public circle getCircle31() {
        return circle31;
    }

    public circle getCircle32() {
        return circle32;
    }

    public circle getCircle33() {
        return circle33;
    }

    public circle getCircle34() {
        return circle34;
    }

    public circle getCircle35() {
        return circle35;
    }

    public circle getCircle36() {
        return circle36;
    }

    public circle getCircle37() {
        return circle37;
    }

    public circle getCircle38() {
        return circle38;
    }

    public circle getCircle39() {
        return circle39;
    }

    public circle getCircle40() {
        return circle40;
    }

    private circle circle40;
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

        circleColor.put(couleur.get(0), circle1.getToolTipText());
        circleColor.put(couleur.get(0), circle2.getToolTipText());
        circleColor.put(couleur.get(0), circle3.getToolTipText());
        circleColor.put(couleur.get(0), circle4.getToolTipText());
        circleColor.put(couleur.get(0), circle5.getToolTipText());
        circleColor.put(couleur.get(0), circle6.getToolTipText());
        circleColor.put(couleur.get(0), circle7.getToolTipText());
        circleColor.put(couleur.get(0), circle8.getToolTipText());
        circleColor.put(couleur.get(0), circle9.getToolTipText());
        circleColor.put(couleur.get(0), circle10.getToolTipText());
        circleColor.put(couleur.get(0), circle11.getToolTipText());
        circleColor.put(couleur.get(0), circle12.getToolTipText());
        circleColor.put(couleur.get(0), circle13.getToolTipText());
        circleColor.put(couleur.get(0), circle14.getToolTipText());
        circleColor.put(couleur.get(0), circle15.getToolTipText());
        circleColor.put(couleur.get(0), circle16.getToolTipText());
        circleColor.put(couleur.get(0), circle17.getToolTipText());
        circleColor.put(couleur.get(0), circle18.getToolTipText());
        circleColor.put(couleur.get(0), circle19.getToolTipText());
        circleColor.put(couleur.get(0), circle20.getToolTipText());
        circleColor.put(couleur.get(0), circle21.getToolTipText());
        circleColor.put(couleur.get(0), circle22.getToolTipText());
        circleColor.put(couleur.get(0), circle23.getToolTipText());
        circleColor.put(couleur.get(0), circle24.getToolTipText());
        circleColor.put(couleur.get(0), circle25.getToolTipText());
        circleColor.put(couleur.get(0), circle26.getToolTipText());
        circleColor.put(couleur.get(0), circle27.getToolTipText());
        circleColor.put(couleur.get(0), circle28.getToolTipText());
        circleColor.put(couleur.get(0), circle29.getToolTipText());
        circleColor.put(couleur.get(0), circle30.getToolTipText());
        circleColor.put(couleur.get(0), circle31.getToolTipText());
        circleColor.put(couleur.get(0), circle32.getToolTipText());
        circleColor.put(couleur.get(0), circle33.getToolTipText());
        circleColor.put(couleur.get(0), circle34.getToolTipText());
        circleColor.put(couleur.get(0), circle35.getToolTipText());
        circleColor.put(couleur.get(0), circle36.getToolTipText());
        circleColor.put(couleur.get(0), circle37.getToolTipText());
        circleColor.put(couleur.get(0), circle38.getToolTipText());
        circleColor.put(couleur.get(0), circle39.getToolTipText());
        circleColor.put(couleur.get(0), circle40.getToolTipText());

        circle1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle1);

            }
        });
        circle2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle2);

            }
        });
        circle3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle3);

            }
        });
        circle4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle4);

            }
        });
        circle5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle5);

            }
        });
        circle6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle6);

            }
        });
        circle7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle7);
            }
        });
        circle8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle8);
            }
        });
        circle9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle9);
            }
        });
        circle10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle10);
            }
        });
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
        circle15.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle15);
            }
        });
        circle16.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle16);
            }
        });
        circle17.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle17);
            }
        });
        circle17.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle17);
            }
        });
        circle18.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle18);
            }
        });
        circle19.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle19);
            }
        });
        circle20.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle20);
            }
        });
        circle21.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle21);
            }
        });
        circle22.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle22);
            }
        });
        circle23.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle23);
            }
        });
        circle24.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle24);
            }
        });
        circle25.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle25);
            }
        });
        circle26.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle26);
            }
        });
        circle27.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle27);
            }
        });
        circle28.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle28);
            }
        });
        circle29.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle29);
            }
        });
        circle30.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle30);
            }
        });
        circle31.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle31);
            }
        });
        circle32.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle32);
            }
        });
        circle33.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle33);
            }
        });
        circle34.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle34);
            }
        });
        circle35.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle35);
            }
        });
        circle36.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle36);
            }
        });
        circle37.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle37);
            }
        });
        circle38.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle38);
            }
        });
        circle39.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle39);
            }
        });
        circle40.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(circle40);
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



















