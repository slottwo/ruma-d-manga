package br.edu.ufca.rumadmanga;

import br.edu.ufca.rumadmanga.gui.InícioJFrame;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) {
        var javaVersion = SystemInfo.javaVersion();
        var javafxVersion = SystemInfo.javafxVersion();

        var label = new Label("Olá Otaku!\n\n"
                + "Bem Vindo ao Ruma d'Mangá\n"
                // + "Aguarde enquanto concentramos nosso Ki...\n"
                + "\nMe feche para adentrar no\nintrigante mundo dos Mangá");
        label.setFont(new Font(14));
        label.setTextAlignment(TextAlignment.CENTER);
        var scene = new Scene(new StackPane(label), 400, 300);
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
        InícioJFrame.main(args);

    }

}
