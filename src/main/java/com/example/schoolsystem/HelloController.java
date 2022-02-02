package com.example.schoolsystem;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class HelloController implements Initializable {
    @FXML
    private ComboBox<Subjects> comboSubjects;
    @FXML
    private ListView<Student> listView;
    @FXML
    private ComboBox<Integer> comboGrades;
    @FXML
    private TextField tfStudent;
    @FXML
    private ComboBox<String> comboStudent;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        comboGrades.getItems().add(1);
        comboGrades.getItems().add(2);
        comboGrades.getItems().add(3);
        comboGrades.getItems().add(4);
        comboGrades.getItems().add(5);

        comboSubjects.getItems().add(Subjects.MATH);
        comboSubjects.getItems().add(Subjects.CZECH);
        comboSubjects.getItems().add(Subjects.ENGLISH);
        comboSubjects.getItems().add(Subjects.GEOGRAPHY);
        comboSubjects.getItems().add(Subjects.CHEMISTRY);
        comboSubjects.getItems().add(Subjects.PP);
    }

    public void addStudent() {
        comboStudent.getItems().add(tfStudent.getText());
    }

    public void studentInit() {
        Student student = new Student(comboStudent.getSelectionModel().getSelectedItem(), comboSubjects.getSelectionModel().getSelectedItem(), comboGrades.getSelectionModel().getSelectedItem());
        listView.getItems().add(student);
        tfStudent.setText("");
    }

    public void deleteStudent() {
        listView.getItems().remove(listView.getSelectionModel().getSelectedItem());
    }
}
