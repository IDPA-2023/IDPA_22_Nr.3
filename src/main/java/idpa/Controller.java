package idpa;

import java.util.ArrayList;
import java.util.List;

import idpa.FaecherManager;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller {
    FaecherManager f = new FaecherManager();

    @FXML
    private TextField d;
    @FXML
    private TextField d1;
    @FXML
    private TextField d2;
    @FXML
    private TextField d3;
    @FXML
    private TextField d4;
    @FXML
    private TextField d5;
    @FXML
    private TextField d6;
    @FXML
    private TextField dM;
    @FXML
    private TextField dS;

    /*@FXML
    private void berechnen() {
        f.faecher.add(new Fach(d.getText(), !(dS.getText().isBlank()), !(dM.getText().isBlank())));
        ArrayList<Double> noten = new ArrayList<>(List.of(
                Double.parseDouble(d1.getText()),
                Double.parseDouble(d2.getText()),
                Double.parseDouble(d3.getText()),
                Double.parseDouble(d4.getText()),
                Double.parseDouble(d5.getText()),
                Double.parseDouble(d6.getText())));
        f.faecher.get(0).setZeugnisnoten(noten);
        if(f.faecher.get(0).isSchriftlich_exist()) {
            f.faecher.get(0).setSchriftlich(Double.parseDouble(dS.getText()));
        }
        if(f.faecher.get(0).isMuendlich_exist()) {
            f.faecher.get(0).setMuendlich(Double.parseDouble(dM.getText()));
        }
    }

     */
}
