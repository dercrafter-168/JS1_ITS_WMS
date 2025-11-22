package de.dercrafter.gui;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

import java.util.Objects;

public class Start extends javafx.application.Application{

    @Override
    public void start(Stage primaryStage) {
        // Icon setzen
        primaryStage.getIcons().add(
                new Image(Objects.requireNonNull(getClass().getResourceAsStream("/icons/Logo_Team.png")))
        );

        // Button erstellen
        Button btn = new Button("Klick mich!");
        btn.setOnAction(e -> System.out.println("Hallo JavaFX – es funktioniert!"));

        Button btn2 = new Button("Toogle view");
        btn2.setOnAction(e -> primaryStage.setFullScreen(!primaryStage.isFullScreen()));

        // Layout
        BorderPane root = new BorderPane();
        root.setCenter(btn);
        root.setTop(btn2);

        // Szene
        Scene scene = new Scene(root, 500, 500);

        // Stage konfigurieren
        primaryStage.setTitle("BBS - WMS 2025");
        primaryStage.setScene(scene);

        // Direkt maximiert starten (sichtbare Taskleiste bleibt)
        primaryStage.setMaximized(true);

        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args); // Startet die JavaFX-Anwendung
    }

}
