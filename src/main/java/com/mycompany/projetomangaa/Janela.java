/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projetomangaa;
//import das coisas que usa na interface grafica
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Janela extends javax.swing.JFrame{
    public static void main() {
        JFrame janela = new JFrame("Título da janela");
        janela.setTitle("Manga");
        janela.setBounds(100, 200, 350, 300); // x, y, largura, altura
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        Container c = janela.getContentPane();

        // tentando em vao botar uma imagem nessa janela
        JLabel label = new JLabel();
        label.setIcon(new ImageIcon("src/interfaceGrafica/8c7ce9d58968ac08c88817457c789630.jpg"));
        // label.setBounds(0,0,icon.getIconWidth(),icon.getIconHeight());
        Dimension size = label.getPreferredSize();
        label.setBounds(50, 30, size.width, size.height);
        c.add(label);
        janela.setResizable(true);

        janela.setVisible(true); // Exibe a janela
    }
}
