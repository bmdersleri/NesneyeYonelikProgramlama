package com.company;

import javax.swing.*;
public class Slider1 extends JFrame {
    public Slider1() {
        JSlider slider = new JSlider(JSlider.HORIZONTAL, 0, 50, 25);
        JPanel panel = new JPanel();
        panel.add(slider);
        add(panel);
    }

}