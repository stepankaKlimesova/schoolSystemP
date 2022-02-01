package com.example.schoolsystem;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ComboBox comboGrades;

    @FXML
    private TextField tfStudent;

    @FXML
    private ComboBox comboStudent;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboGrades.getItems().add(1);
        comboGrades.getItems().add(2);
        comboGrades.getItems().add(3);
        comboGrades.getItems().add(4);
        comboGrades.getItems().add(5);

    }

    private void fList(){
        comboStudent.getItems().add(tfStudent.getText());
    }

}