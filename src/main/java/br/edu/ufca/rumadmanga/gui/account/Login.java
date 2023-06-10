package br.edu.ufca.rumadmanga.gui.account;

import br.edu.ufca.rumadmanga.account.Client;
import br.edu.ufca.rumadmanga.account.ExistentUserException;
import javax.swing.JFrame;

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

        try {
            new Client("ana", "1234");
        } catch (ExistentUserException ex) {
            System.out.println("ana alread exists... what?!");
        }

        loginFrame.setResizable(false);
        logonFrame.setResizable(false);
        loginFrame.setVisible(true);
        logonFrame.setVisible(false);
    }
}
