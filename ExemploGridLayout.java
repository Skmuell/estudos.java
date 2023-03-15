import java.awt.*;

import javax.swing.*;
public class ExemploGridLayout {
    public static void main(String[] args){



        JButton bt1 = new JButton("Botão 1");

        JButton bt2 = new JButton("Botão 2");

        JButton bt3 = new JButton("Botão 3");

        //JButton bt4 = new JButton("Botão 4");

        //JButton bt5 = new JButton("Botão 5");

        //JButton bt6 = new JButton("Botão 6");

        //JButton bt7 = new JButton("Botão 7");

        JFrame.setDefaultLookAndFeelDecorated(true);

        JFrame minhaJanela = new JFrame("Apresentação");



        minhaJanela.setSize(400,400);

        minhaJanela.setLocation(100,100);



        minhaJanela.getContentPane().setLayout(new GridLayout(1,1));

        minhaJanela.getContentPane().add(bt1);

        minhaJanela.getContentPane().add(bt2);

        minhaJanela.getContentPane().add(bt3);

        //minhaJanela.getContentPane().add(bt4);

        //minhaJanela.getContentPane().add(bt5);

        //minhaJanela.getContentPane().add(bt6);

        //minhaJanela.getContentPane().add(bt7);

        minhaJanela.setVisible(true);



    }

}