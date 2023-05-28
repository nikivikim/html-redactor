module com.example.task_web2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.example.task_web2 to javafx.fxml;
    exports com.example.task_web2;
}