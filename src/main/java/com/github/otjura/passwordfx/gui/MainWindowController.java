/*
 * Copyright Otso Rajala <ojrajala@gmail.com>, 2021
 */
package com.github.otjura.passwordfx.gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

import com.github.otjura.passwordfx.core.Logic;

public class MainWindowController implements Initializable
{
    @FXML
    private TextField resultField;
    @FXML
    private Button generateButton;

    private void generatePassword() {
        resultField.setText(Logic.randomAlphanumeric(20));
        resultField.requestFocus();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        resultField.setEditable(false);
        resultField.setPromptText("Generated password appears here");

        generateButton.setText("Generate password");

        generateButton.setOnAction(e -> {
            generatePassword();
        });
    }
}
