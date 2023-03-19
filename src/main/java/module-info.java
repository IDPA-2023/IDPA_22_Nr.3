module notenrechner {
    requires javafx.controls;
    requires javafx.fxml;


    opens kbw.stragiotti to javafx.fxml;
    exports kbw.stragiotti;
}