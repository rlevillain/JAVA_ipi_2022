package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Scanner;

import static org.example.RequestUtils.loadWeather;

public class WeatherIHM extends JFrame {
    private JButton jbPositive;
    private JLabel jlQuestion;
    private JLabel jlMessage;
    private JTextField jtfAnswer;
    private JProgressBar progressBar;

    public WeatherIHM() {
        //Appel du constructeur parent
        super("Weather");

        //construct components
        jbPositive = new JButton("Chercher");
        jlQuestion = new JLabel("Donne une ville : ");
        jtfAnswer = new JTextField(5);
        jlMessage = new JLabel("Ici pour écrire un message");
        progressBar = new JProgressBar();
        progressBar.setVisible(false);
        progressBar.setIndeterminate(false);


        //Conteneur
        JPanel pannel = new JPanel();
        pannel.setPreferredSize(new Dimension(408, 211));
        pannel.setLayout(null);

        //add components
        pannel.add(jbPositive);
        pannel.add(jlQuestion);
        pannel.add(jtfAnswer);
        pannel.add(jlMessage);
        pannel.add(progressBar);

        //set component bounds (only needed by Absolute Positioning)
        jbPositive.setBounds(285, 155, 95, 35);
        jlQuestion.setBounds(25, 15, 410, 70);
        jtfAnswer.setBounds(25, 80, 355, 30);
        jlMessage.setBounds(25, 110, 355, 30);
        progressBar.setBounds(25, 140, 355, 10);

        //Travail Sur la fenêtre
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(pannel);
        pack();
        setVisible(true);
        jbPositive.getRootPane().setDefaultButton(jbPositive);
        //clic
        jbPositive.addActionListener(e -> {
            //clic sur le bouton positif
            Thread thread = new Thread(() -> {
                progressBar.setVisible(true);
                progressBar.setIndeterminate(true);
                String Ville = jtfAnswer.getText();
                try {
                    jlMessage.setText("Dans la ville de : " + loadWeather(Ville).getName()+"\nIl fait "+  loadWeather(Ville).getMain().getTemp() + " °C avec un vent de " + loadWeather(Ville).getWind().getSpeed() + " km/h"); ;
                } catch (Exception f) {
                    f.printStackTrace();
                    jlMessage.setText("Erreur, ville non-trouvée");;
                }
                progressBar.setIndeterminate(false);
                progressBar.setVisible(false);

            });
            thread.start();
            //jlMessage.setText("coucou");
        });
    }

    public static void main(String[] args) {
        WeatherIHM popup = new WeatherIHM();
    }
}
