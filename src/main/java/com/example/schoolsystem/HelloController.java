package com.example.schoolsystem;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ComboBox comboChooseSubject;
    @FXML
    private ComboBox comboGrades;

    @FXML
    private TextField tfStudent;

    @FXML
    private ComboBox comboStudent;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        comboGrades.getItems().add(Grades.ONE.getValue());
        comboGrades.getItems().add(Grades.TWO.getValue());
        comboGrades.getItems().add(Grades.THREE.getValue());
        comboGrades.getItems().add(Grades.FOUR.getValue());
        comboGrades.getItems().add(Grades.FIVE.getValue());

        comboSubjects.getItems().add(Subjects.MATH);
        comboSubjects.getItems().add(Subjects.CZECH);
        comboSubjects.getItems().add(Subjects.ENGLISH);
        comboSubjects.getItems().add(Subjects.GEOGRAPHY);
        comboSubjects.getItems().add(Subjects.CHEMISTRY);
        comboSubjects.getItems().add(Subjects.PP);

    }

    private void fList(){
        comboStudent.getItems().add(tfStudent.getText());
    }
}
