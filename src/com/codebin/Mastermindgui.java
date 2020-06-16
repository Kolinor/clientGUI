package com.codebin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;



public class Mastermindgui extends Container {
    private JPanel panel1;
    private JTabbedPane tabbedPane1;
    private JComboBox comboBoxChoix;
    private JButton envoyerButton;
    private LittleCircle LittleCircle4;

    public LittleCircle getLittleCircle4() {
        return LittleCircle4;
    }

    public LittleCircle getLittleCircle3() {
        return LittleCircle3;
    }

    public LittleCircle getLittleCircle2() {
        return LittleCircle2;
    }

    public LittleCircle getLittleCircle1() {
        return LittleCircle1;
    }

    private LittleCircle LittleCircle3;
    private LittleCircle LittleCircle2;
    private LittleCircle LittleCircle1;
    private Circle Circle12;
    private Circle Circle11;

    public JTextArea getTextArea1() {
        return textArea1;
    }

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
    private Circle Circle1;
    private Circle Circle2;
    private Circle Circle3;
    private Circle Circle4;
    private Circle Circle5;
    private Circle Circle6;
    private Circle Circle7;
    private Circle Circle8;
    private Circle Circle9;
    private Circle Circle10;
    private Circle Circle13;
    private Circle Circle14;
    private Circle Circle15;
    private Circle Circle16;
    private Circle Circle17;
    private Circle Circle18;
    private Circle Circle19;
    private Circle Circle20;
    private Circle Circle21;
    private Circle Circle22;
    private Circle Circle23;
    private Circle Circle24;
    private Circle Circle25;
    private Circle Circle26;
    private Circle Circle27;
    private Circle Circle28;
    private Circle Circle29;
    private Circle Circle30;
    private Circle Circle31;
    private Circle Circle32;
    private Circle Circle33;
    private Circle Circle34;
    private Circle Circle35;
    private Circle Circle36;
    private Circle Circle37;
    private Circle Circle38;
    private Circle Circle39;
    private Boolean buttonClicked = false;

    public Boolean getButtonClicked() {
        return buttonClicked;
    }

    public void setButtonClicked(Boolean buttonClicked) {
        this.buttonClicked = buttonClicked;
    }

    public Circle getCircle12() {
        return Circle12;
    }

    public Circle getCircle11() {
        return Circle11;
    }

    public Circle getCircle1() {
        return Circle1;
    }

    public Circle getCircle2() {
        return Circle2;
    }

    public Circle getCircle3() {
        return Circle3;
    }

    public Circle getCircle4() {
        return Circle4;
    }

    public Circle getCircle5() {
        return Circle5;
    }

    public Circle getCircle6() {
        return Circle6;
    }

    public Circle getCircle7() {
        return Circle7;
    }

    public Circle getCircle8() {
        return Circle8;
    }

    public Circle getCircle9() {
        return Circle9;
    }

    public Circle getCircle10() {
        return Circle10;
    }

    public Circle getCircle13() {
        return Circle13;
    }

    public Circle getCircle14() {
        return Circle14;
    }

    public Circle getCircle15() {
        return Circle15;
    }

    public Circle getCircle16() {
        return Circle16;
    }

    public Circle getCircle17() {
        return Circle17;
    }

    public Circle getCircle18() {
        return Circle18;
    }

    public Circle getCircle19() {
        return Circle19;
    }

    public Circle getCircle20() {
        return Circle20;
    }

    public Circle getCircle21() {
        return Circle21;
    }

    public Circle getCircle22() {
        return Circle22;
    }

    public Circle getCircle23() {
        return Circle23;
    }

    public Circle getCircle24() {
        return Circle24;
    }

    public Circle getCircle25() {
        return Circle25;
    }

    public Circle getCircle26() {
        return Circle26;
    }

    public Circle getCircle27() {
        return Circle27;
    }

    public Circle getCircle28() {
        return Circle28;
    }

    public Circle getCircle29() {
        return Circle29;
    }

    public Circle getCircle30() {
        return Circle30;
    }

    public Circle getCircle31() {
        return Circle31;
    }

    public Circle getCircle32() {
        return Circle32;
    }

    public Circle getCircle33() {
        return Circle33;
    }

    public Circle getCircle34() {
        return Circle34;
    }

    public Circle getCircle35() {
        return Circle35;
    }

    public Circle getCircle36() {
        return Circle36;
    }

    public Circle getCircle37() {
        return Circle37;
    }

    public Circle getCircle38() {
        return Circle38;
    }

    public Circle getCircle39() {
        return Circle39;
    }

    public Circle getCircle40() {
        return Circle40;
    }

    private Circle Circle40;
    private int choixCombo;
    private int infoConnexionOk;
    private int infoPseudoOk;
    private int choixDifficulte;
    private int infoChoixDiffClicked;



    HashMap<String, Color> indice = new HashMap<>();
    ArrayList<String> couleur = new ArrayList<>();
    HashMap<String, String> CircleColor = new HashMap<>();



    public Mastermindgui(){


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

        CircleColor.put(couleur.get(0), Circle1.getToolTipText());
        CircleColor.put(couleur.get(0), Circle2.getToolTipText());
        CircleColor.put(couleur.get(0), Circle3.getToolTipText());
        CircleColor.put(couleur.get(0), Circle4.getToolTipText());
        CircleColor.put(couleur.get(0), Circle5.getToolTipText());
        CircleColor.put(couleur.get(0), Circle6.getToolTipText());
        CircleColor.put(couleur.get(0), Circle7.getToolTipText());
        CircleColor.put(couleur.get(0), Circle8.getToolTipText());
        CircleColor.put(couleur.get(0), Circle9.getToolTipText());
        CircleColor.put(couleur.get(0), Circle10.getToolTipText());
        CircleColor.put(couleur.get(0), Circle11.getToolTipText());
        CircleColor.put(couleur.get(0), Circle12.getToolTipText());
        CircleColor.put(couleur.get(0), Circle13.getToolTipText());
        CircleColor.put(couleur.get(0), Circle14.getToolTipText());
        CircleColor.put(couleur.get(0), Circle15.getToolTipText());
        CircleColor.put(couleur.get(0), Circle16.getToolTipText());
        CircleColor.put(couleur.get(0), Circle17.getToolTipText());
        CircleColor.put(couleur.get(0), Circle18.getToolTipText());
        CircleColor.put(couleur.get(0), Circle19.getToolTipText());
        CircleColor.put(couleur.get(0), Circle20.getToolTipText());
        CircleColor.put(couleur.get(0), Circle21.getToolTipText());
        CircleColor.put(couleur.get(0), Circle22.getToolTipText());
        CircleColor.put(couleur.get(0), Circle23.getToolTipText());
        CircleColor.put(couleur.get(0), Circle24.getToolTipText());
        CircleColor.put(couleur.get(0), Circle25.getToolTipText());
        CircleColor.put(couleur.get(0), Circle26.getToolTipText());
        CircleColor.put(couleur.get(0), Circle27.getToolTipText());
        CircleColor.put(couleur.get(0), Circle28.getToolTipText());
        CircleColor.put(couleur.get(0), Circle29.getToolTipText());
        CircleColor.put(couleur.get(0), Circle30.getToolTipText());
        CircleColor.put(couleur.get(0), Circle31.getToolTipText());
        CircleColor.put(couleur.get(0), Circle32.getToolTipText());
        CircleColor.put(couleur.get(0), Circle33.getToolTipText());
        CircleColor.put(couleur.get(0), Circle34.getToolTipText());
        CircleColor.put(couleur.get(0), Circle35.getToolTipText());
        CircleColor.put(couleur.get(0), Circle36.getToolTipText());
        CircleColor.put(couleur.get(0), Circle37.getToolTipText());
        CircleColor.put(couleur.get(0), Circle38.getToolTipText());
        CircleColor.put(couleur.get(0), Circle39.getToolTipText());
        CircleColor.put(couleur.get(0), Circle40.getToolTipText());

        Circle1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle1);

            }
        });
        Circle2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle2);

            }
        });
        Circle3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle3);

            }
        });
        Circle4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle4);

            }
        });
        Circle5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle5);

            }
        });
        Circle6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle6);

            }
        });
        Circle7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle7);
            }
        });
        Circle8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle8);
            }
        });
        Circle9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle9);
            }
        });
        Circle10.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle10);
            }
        });
        Circle11.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle11);

            }
        });
        Circle12.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle12);
            }
        });
        Circle13.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle13);
            }
        });
        Circle14.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle14);
            }
        });
        Circle15.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle15);
            }
        });
        Circle16.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle16);
            }
        });
        Circle17.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle17);
            }
        });
        Circle17.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle17);
            }
        });
        Circle18.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle18);
            }
        });
        Circle19.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle19);
            }
        });
        Circle20.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle20);
            }
        });
        Circle21.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle21);
            }
        });
        Circle22.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle22);
            }
        });
        Circle23.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle23);
            }
        });
        Circle24.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle24);
            }
        });
        Circle25.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle25);
            }
        });
        Circle26.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle26);
            }
        });
        Circle27.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle27);
            }
        });
        Circle28.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle28);
            }
        });
        Circle29.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle29);
            }
        });
        Circle30.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle30);
            }
        });
        Circle31.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle31);
            }
        });
        Circle32.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle32);
            }
        });
        Circle33.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle33);
            }
        });
        Circle34.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle34);
            }
        });
        Circle35.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle35);
            }
        });
        Circle36.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle36);
            }
        });
        Circle37.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle37);
            }
        });
        Circle38.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle38);
            }
        });
        Circle39.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle39);
            }
        });
        Circle40.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                setColorCircle(Circle40);
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
        button1.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e the event to be processed
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                setButtonClicked(true);
            }
        });
    }

    public void setColorCircle(Circle c) {
        String color = CircleColor.get(c.getToolTipText());
        int i = couleur.indexOf(color);

        int maxSize = couleur.size();
        i++;
        if (i == maxSize) i = 0;
        color = couleur.get(i);

        CircleColor.remove(c.getToolTipText());
        CircleColor.put(c.getToolTipText(), color);

        c.setForeground(this.indice.get(color));
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

    public ArrayList<String> getCouleur() {
        return couleur;
    }

    public static void menuDifficulte(int choixDifficulte, JTextArea a) {

        String str = new String("- Difficulté " + choixDifficulte + "\n");

        switch (choixDifficulte) {

            case (4):
                a.append(str);
                break;
            case (5):
                a.append(str);
                break;
            case (6):
                a.append(str);
                break;
            case (7):
                a.append(str);
                break;
            case (8):
                a.append(str);
                break;
            case (9):
                a.append(str);
                break;
            case (10):
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

    public HashMap<String, String> getCircleColor() {
        return CircleColor;
    }

    public void afficherCercle(){

        Circle1.setVisible(true);
        Circle2.setVisible(true);
        Circle3.setVisible(true);
        Circle4.setVisible(true);
        Circle5.setVisible(true);
        Circle6.setVisible(true);
        Circle7.setVisible(true);
        Circle8.setVisible(true);
        Circle9.setVisible(true);
        Circle10.setVisible(true);
        Circle11.setVisible(true);
        Circle12.setVisible(true);
        Circle13.setVisible(true);
        Circle14.setVisible(true);
        Circle15.setVisible(true);
        Circle16.setVisible(true);
        Circle17.setVisible(true);
        Circle18.setVisible(true);
        Circle19.setVisible(true);
        Circle20.setVisible(true);
        Circle21.setVisible(true);
        Circle22.setVisible(true);
        Circle23.setVisible(true);
        Circle24.setVisible(true);
        Circle25.setVisible(true);
        Circle26.setVisible(true);
        Circle27.setVisible(true);
        Circle28.setVisible(true);
        Circle29.setVisible(true);
        Circle30.setVisible(true);
        Circle31.setVisible(true);
        Circle32.setVisible(true);
        Circle33.setVisible(true);
        Circle34.setVisible(true);
        Circle35.setVisible(true);
        Circle36.setVisible(true);
        Circle37.setVisible(true);
        Circle38.setVisible(true);
        Circle39.setVisible(true);
        Circle40.setVisible(true);

    }

    public void reinitialiserColorCercle(){



        Circle1.setForeground(Color.GRAY);
        Circle2.setForeground(Color.GRAY);
        Circle3.setForeground(Color.GRAY);
        Circle4.setForeground(Color.GRAY);
        Circle5.setForeground(Color.GRAY);
        Circle6.setForeground(Color.GRAY);
        Circle7.setForeground(Color.GRAY);
        Circle8.setForeground(Color.GRAY);
        Circle9.setForeground(Color.GRAY);
        Circle10.setForeground(Color.GRAY);
        Circle11.setForeground(Color.GRAY);
        Circle12.setForeground(Color.GRAY);
        Circle13.setForeground(Color.GRAY);
        Circle14.setForeground(Color.GRAY);
        Circle15.setForeground(Color.GRAY);
        Circle16.setForeground(Color.GRAY);
        Circle17.setForeground(Color.GRAY);
        Circle18.setForeground(Color.GRAY);
        Circle19.setForeground(Color.GRAY);
        Circle20.setForeground(Color.GRAY);
        Circle21.setForeground(Color.GRAY);
        Circle22.setForeground(Color.GRAY);
        Circle23.setForeground(Color.GRAY);
        Circle24.setForeground(Color.GRAY);
        Circle25.setForeground(Color.GRAY);
        Circle26.setForeground(Color.GRAY);
        Circle27.setForeground(Color.GRAY);
        Circle28.setForeground(Color.GRAY);
        Circle29.setForeground(Color.GRAY);
        Circle30.setForeground(Color.GRAY);
        Circle31.setForeground(Color.GRAY);
        Circle32.setForeground(Color.GRAY);
        Circle33.setForeground(Color.GRAY);
        Circle34.setForeground(Color.GRAY);
        Circle35.setForeground(Color.GRAY);
        Circle36.setForeground(Color.GRAY);
        Circle37.setForeground(Color.GRAY);
        Circle38.setForeground(Color.GRAY);
        Circle39.setForeground(Color.GRAY);
        Circle40.setForeground(Color.GRAY);





    }



}



















