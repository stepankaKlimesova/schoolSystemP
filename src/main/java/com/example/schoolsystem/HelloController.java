package com.example.schoolsystem;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    @FXML
    private ComboBox studentList;
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
        comboGrades.getItems().add((Integer)1);
        comboGrades.getItems().add((Integer)2);
        comboGrades.getItems().add((Integer)3);
        comboGrades.getItems().add((Integer)4);
        comboGrades.getItems().add((Integer)5);

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

    public void studentInit() {
       Student student = new Student(tfStudent.getText(), (Subjects) comboSubjects.getSelectionModel().getSelectedItem(), (Integer) comboGrades.getSelectionModel().getSelectedItem());
       studentList.getItems().add(student.getName());
       comboChooseSubject.getItems().add(student.getSubjects());
    }

}
