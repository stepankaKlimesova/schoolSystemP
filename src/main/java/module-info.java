module com.example.schoolsystem {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;


    opens com.example.schoolsystem to javafx.fxml;
    exports com.example.schoolsystem;
}