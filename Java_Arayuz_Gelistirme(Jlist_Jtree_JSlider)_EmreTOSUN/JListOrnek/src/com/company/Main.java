package com.company;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        new Jlistornek();

    }


    private static class Jlistornek{
        Jlistornek(){
            JFrame f = new JFrame();
            DefaultListModel<String> liste = new DefaultListModel<>();
            liste.addElement("C#");
            liste.addElement("Python");
            liste.addElement("Java");
            liste.addElement("C++");
            JList<String> l = new JList<>(liste);
            l.setBounds(100,100,75,75);
            f.add(l);
            f.setLayout(null);
            f.setSize(400,400);
            f.setVisible(true);




        }


    }
}


