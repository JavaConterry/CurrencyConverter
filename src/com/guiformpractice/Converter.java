package com.guiformpractice;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Converter {
    private JButton messegeButton;
    private JPanel pannel1;

    public Converter() {
        messegeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "HelloWorld");
            }
        });
    }

    public static void main(String[] args) {
        JFrame Frame = new JFrame("App");
        Frame.setContentPane(new Converter().pannel1);
        Frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Frame.pack();
        Frame.setVisible(true);
    }

}
