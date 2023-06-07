module com.mycompany.projetomangaa {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires javafx.base;
    requires javafx.graphics;
    requires java.base;
    requires java.logging;

    opens com.mycompany.projetomangaa to javafx.fxml;
    exports com.mycompany.projetomangaa;
}
