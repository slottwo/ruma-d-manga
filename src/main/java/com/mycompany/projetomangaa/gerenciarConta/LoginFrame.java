package com.mycompany.projetomangaa.gerenciarConta;

import com.mycompany.projetomangaa.LogadoJFrame;
import javax.swing.*;

import com.mycompany.projetomangaa.usuarios.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {

    Container container = getContentPane();
    JLabel userLabel = new JLabel("NOME");
    JLabel passwordLabel = new JLabel("SENHA");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("ENTRAR");
    JButton resetButton = new JButton("RESET");
    JButton logonButton = new JButton("CRIAR NOVA CONTA");
    JCheckBox showPassword = new JCheckBox("Mostrar Senha");
    LogonFrame logonFrame;
    JFrame rootFrame;

    LoginFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }

    public void setLogon(LogonFrame frame) {
        logonFrame = frame;
    }

    void setRoot(JFrame frame) {
        rootFrame = frame;
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
        loginButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);
        logonButton.setBounds(75, 350, 200, 30);

    }

    public void addComponentsToContainer() {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
        container.add(logonButton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        logonButton.addActionListener(this);
        showPassword.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = new String(passwordField.getPassword());

            if (Usuario.login(userText, pwdText)) {
                JOptionPane.showMessageDialog(this, "Login bem sucedido");
                this.rootFrame.setEnabled(true);
                this.rootFrame.requestFocus();
                this.dispose();
                String[] args = {};
                LogadoJFrame.main(args);
                this.rootFrame.dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Nome ou Senha incorreta");
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
        if (e.getSource() == logonButton) {
            this.setVisible(false);
            logonFrame.setVisible(true);
        }
    }
}
