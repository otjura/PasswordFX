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

import org.apache.commons.lang3.RandomStringUtils;

public class MainWindowController implements Initializable
{
    @FXML
    private TextField resultField;
    @FXML
    private Button generateAlphanumericPasswordButton;
    @FXML
    private Button generateCharacterPasswordButton;

    private void generateAlphanumericPassword()
    {
        resultField.setText(RandomStringUtils.randomGraph(20));
        resultField.requestFocus();
    }

    private void generateCharacterPassword()
    {
        resultField.setText(RandomStringUtils.randomAlphanumeric(20));
        resultField.requestFocus();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        resultField.setEditable(false);
        resultField.setPromptText("Generated password appears here");

        generateAlphanumericPasswordButton.setOnAction(e -> generateAlphanumericPassword());

        generateCharacterPasswordButton.setOnAction(e -> generateCharacterPassword());

    }
}
