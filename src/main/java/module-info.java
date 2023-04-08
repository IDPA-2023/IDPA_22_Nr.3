module com.example.test_weil_trash {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens idpa to javafx.fxml;
    exports idpa;
}