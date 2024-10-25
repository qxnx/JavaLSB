module com.example.lsb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.lsb to javafx.fxml;
    exports com.example.lsb;
}