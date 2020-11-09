module JavaFXApplication {

    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.desktop;
    requires kotlin.stdlib;
    requires javafx.web;

    opens sample;
}