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
    private ListView listView;
    @FXML
    private ComboBox comboGrades;

    @FXML
    private TextField tfStudent;

    @FXML
    private ComboBox comboStudent;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        listView.getItems().add("name                              subject                              grade");

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

    private void fList(){
        comboStudent.getItems().add(tfStudent.getText());

    }

    public void studentInit() {
       Student student = new Student((String) comboStudent.getSelectionModel().getSelectedItem(), (Subjects) comboSubjects.getSelectionModel().getSelectedItem(), (Integer) comboGrades.getSelectionModel().getSelectedItem());
       studentList.getItems().add(student.getName());
       comboChooseSubject.getItems().add(student.getSubjects());
    }

    public void deleteStudent() {
       listView.getItems().remove(listView.getSelectionModel().getSelectedItem());
    }
}
