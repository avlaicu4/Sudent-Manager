module org.example.studentmanagertest {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.studentmanagertest to javafx.fxml;
    exports org.example.studentmanagertest;
}