package com.github.otjura.passwordfx.core;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;

import java.io.IOException;
import java.util.Objects;

public class Main extends Application
{

    public static void main(String[] args)
    {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage)
    {
        try
        {
            Scene scene = new Scene(FXMLLoader.load(Objects.requireNonNull(
                    getClass().getClassLoader().getResource("MainWindow.fxml"))));
            scene.getStylesheets().add("style.css");

            // this arg just pops into existence from somewhere, dwi
            primaryStage.setTitle("PasswordFX");
            //primaryStage.getIcons().add(new Image("icon.png"));
            primaryStage.setScene(scene);
            primaryStage.show();
        }
        catch (NullPointerException | IOException e)
        {
            e.printStackTrace();
        }
    }
}
