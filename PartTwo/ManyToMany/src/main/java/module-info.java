module com.example.manytomany {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.manytomany to javafx.fxml;
    exports com.example.manytomany;
}