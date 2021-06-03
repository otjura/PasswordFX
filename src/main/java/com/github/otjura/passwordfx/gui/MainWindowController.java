package com.github.otjura.passwordfx.gui;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class MainWindowController implements Initializable
{
    @FXML
    private AnchorPane anchorPane;
    @FXML
    private MenuBar menuBar;
    @FXML
    private Menu fileMenu;
    @FXML
    private MenuItem closeMenuItem;
    @FXML
    private Menu editMenu;
    @FXML
    private MenuItem deleteMenuItem;
    @FXML
    private Menu helpMenu;
    @FXML
    private MenuItem aboutMenuItem;
    @FXML
    private TextField resultField;
    @FXML
    private Button generateButton;

    @Override
    public void initialize(URL location, ResourceBundle resources)
    {
        // TODO logics
    }
}
