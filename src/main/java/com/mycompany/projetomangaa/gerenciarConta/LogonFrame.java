package com.mycompany.projetomangaa.gerenciarConta;

import javax.swing.*;

import com.mycompany.projetomangaa.usuarios.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LogonFrame extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel userLabel = new JLabel("NOME");
    JLabel passwordLabel = new JLabel("SENHA");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton createButton = new JButton("CRIAR");
    JButton resetButton = new JButton("RESET");
    JButton backButton = new JButton("JÁ TENHO UMA CONTA");
    JCheckBox showPassword = new JCheckBox("Mostrar Senha");
    LoginFrame loginFrame;

    LogonFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }

    public void addLogin(LoginFrame frame) {
        loginFrame = frame;
    }

    public void setLayoutManager() {
        container.setLayout(null);
    }

    public void setLocationAndSize() {
        userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        createButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);
        backButton.setBounds(75, 350, 200, 30);
    }

    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(createButton);
        container.add(resetButton);
        container.add(backButton);
    }

    public void addActionEvent() {
        createButton.addActionListener(this);
        resetButton.addActionListener(this);
        backButton.addActionListener(this);
        showPassword.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == createButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = new String(passwordField.getPassword());

            if (Usuario.buscarUsuario(userText) != null) {
                JOptionPane.showMessageDialog(this, "Usuário Existente");
            } else {
                new Cliente(userText, pwdText);
                JOptionPane.showMessageDialog(this, "Usuário Criado com Sucesso.");
            }

        }
        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }
        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }
        }
        if (e.getSource() == backButton) {
            setVisible(false);
            loginFrame.setVisible(true);
        }
    }
}
