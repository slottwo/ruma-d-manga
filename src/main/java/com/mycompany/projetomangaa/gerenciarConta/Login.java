package com.mycompany.projetomangaa.gerenciarConta;

import com.mycompany.projetomangaa.MainJFrame;
import javax.swing.JFrame;

import com.mycompany.projetomangaa.usuarios.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Login {

    public static void main(JFrame rootFrame) {
        LoginFrame loginFrame = new LoginFrame();
        LogonFrame logonFrame = new LogonFrame();
        loginFrame.setLogon(logonFrame);
        loginFrame.setRoot(rootFrame);
        logonFrame.addLogin(loginFrame);

        rootFrame.setEnabled(false);

        loginFrame.setTitle("Login");
        loginFrame.setBounds(10, 10, 370, 600);
        logonFrame.setTitle("Criar nova conta");
        logonFrame.setBounds(10, 10, 370, 600);

        loginFrame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        loginFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                rootFrame.setEnabled(true);
                rootFrame.requestFocus();
                loginFrame.dispose();
            }
        });

        logonFrame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent event) {
                rootFrame.setEnabled(true);
                rootFrame.requestFocus();
                loginFrame.dispose();
            }
        });
        
        // teste
        new Cliente("ana", "1234");

        loginFrame.setResizable(false);
        logonFrame.setResizable(false);
        loginFrame.setVisible(true);
        logonFrame.setVisible(false);
    }
}
