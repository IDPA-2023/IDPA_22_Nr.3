module com.example.idpa {
    requires javafx.controls;
    requires javafx.fxml;
    requires android.json;
    requires json.simple;


    opens idpa to javafx.fxml;
    exports idpa;
}