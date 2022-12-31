package com.ibik.pbo.praktikum;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Latihan01 extends JFrame implements ActionListener {

    private JButton btn_hello, btn_halo, btn_ibik;

    Latihan01() {
        setTitle("Latihan 01");
        setVisible(true);
        pack();
        setSize(300, 150);
        setLocationRelativeTo(null);
        GenerateMenuButton(this);
    }

    public static void main(String[] args) {
        new Latihan01();
    }

    public void GenerateMenuButton(JFrame frame) {
        JPanel upperPanel = new JPanel();
        btn_halo = new JButton("Halo");
        btn_hello = new JButton("Hello");

        upperPanel.add(btn_halo);
        upperPanel.add(btn_hello);

        JPanel bottomPanel = new JPanel();
        btn_ibik = new JButton("IBIK");
        
        bottomPanel.add(btn_ibik);
        
        frame.add(upperPanel, BorderLayout.NORTH);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        btn_halo.addActionListener(this);
        btn_hello.addActionListener(this);
        btn_ibik.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btn_halo) {
            JOptionPane.showMessageDialog(null, "Halo");
        } else if(e.getSource() == btn_hello) {
            JOptionPane.showMessageDialog(null, "Hello");
        } else if(e.getSource() == btn_ibik) {
            JOptionPane.showMessageDialog(null, "Intitut Bisnis Informatika Kesatuan");
        }
    }
}