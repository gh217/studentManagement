module com.example.studentmanagemt {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.studentmanagemt to javafx.fxml;
    exports com.example.studentmanagemt;
}