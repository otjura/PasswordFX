/*
 * Copyright Otso Rajala <ojrajala@gmail.com>, 2021
 */
package com.github.otjura.passwordfx.gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

import org.apache.commons.lang3.RandomStringUtils;

public class MainWindowController implements Initializable
{
    @FXML
    private Label mainLabel;
    @FXML
    private TextField resultTextField;
    @FXML
    private Button alphanumButton;
    @FXML
    private Button anycharButton;

    private int passwordLength;

    private void generateAlphanumericPassword()
    {
        resultTextField.setText(RandomStringUtils.randomAlphanumeric(passwordLength));
        resultTextField.requestFocus();
    }

    private void generateCharacterPassword()
    {
        resultTextField.setText(RandomStringUtils.randomGraph(passwordLength));
        resultTextField.requestFocus();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        passwordLength = 20;

        resultTextField.setEditable(false);

        alphanumButton.setOnAction(e -> generateAlphanumericPassword());

        anycharButton.setOnAction(e -> generateCharacterPassword());

    }
}
