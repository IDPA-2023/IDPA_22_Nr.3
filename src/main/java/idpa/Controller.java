package idpa;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Alert;
import javafx.scene.control.DialogPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    @FXML
    private LineChart<Number, Number> lineChart;

    @FXML
    private GridPane grid1;

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
    @FXML
    private Label pD;
    @FXML
    private Label zD;
    @FXML
    private Label FnD;

    @FXML
    private TextField m1;
    @FXML
    private TextField m2;
    @FXML
    private TextField m3;
    @FXML
    private TextField m4;
    @FXML
    private TextField mS;
    @FXML
    private Label pM;
    @FXML
    private Label zM;
    @FXML
    private Label FnM;

    @FXML
    private TextField f1;
    @FXML
    private TextField f2;
    @FXML
    private TextField f3;
    @FXML
    private TextField f4;
    @FXML
    private TextField fS;
    @FXML
    private TextField fM;
    @FXML
    private Label pF;
    @FXML
    private Label zF;
    @FXML
    private Label FnF;

    @FXML
    private TextField e1;
    @FXML
    private TextField e2;
    @FXML
    private TextField e3;
    @FXML
    private TextField e4;
    @FXML
    private TextField e5;
    @FXML
    private TextField e6;
    @FXML
    private TextField eS;
    @FXML
    private TextField eM;
    @FXML
    private Label pE;
    @FXML
    private Label zE;
    @FXML
    private Label FnE;

    @FXML
    private TextField wr1;
    @FXML
    private TextField wr2;
    @FXML
    private TextField wr3;
    @FXML
    private TextField wr4;
    @FXML
    private TextField wr5;
    @FXML
    private TextField wr6;
    @FXML
    private TextField wrS;
    @FXML
    private Label pWR;
    @FXML
    private Label zWR;
    @FXML
    private Label FnWR;

    @FXML
    private TextField rw1;
    @FXML
    private TextField rw2;
    @FXML
    private TextField rw3;
    @FXML
    private TextField rw4;
    @FXML
    private TextField rw5;
    @FXML
    private TextField rw6;
    @FXML
    private TextField rwS;
    @FXML
    private Label pRW;
    @FXML
    private Label zRW;
    @FXML
    private Label FnRW;

    @FXML
    private TextField g1;
    @FXML
    private TextField g2;
    @FXML
    private TextField g3;
    @FXML
    private TextField g4;
    @FXML
    private Label zG;
    @FXML
    private Label FnG;

    @FXML
    private TextField tu3;
    @FXML
    private TextField tu4;
    @FXML
    private Label zTU;
    @FXML
    private Label FnTU;

    @FXML
    private TextField idaf3;
    @FXML
    private TextField idaf4;
    @FXML
    private Label zIDAF;
    @FXML
    private Label FnIDAF;

    @FXML
    private TextField idpa6;
    @FXML
    private Label zIDPA;
    @FXML
    private Label FnIDPA;

    @FXML
    private Label gesamtnote;
    @FXML
    private Label anzahl_tiefnoten;
    @FXML
    private Label tiefpunkte;

    boolean allFieldsFilled = true;
    String filePath = "data.json";
    ArrayList<Fach> faecher = new ArrayList<>();

    public void initial() {
        try (FileReader fileReader = new FileReader(filePath)) {
            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(fileReader);

            d1.setText((String) jsonObject.get("d1"));
            d2.setText((String) jsonObject.get("d2"));
            d3.setText((String) jsonObject.get("d3"));
            d4.setText((String) jsonObject.get("d4"));
            d5.setText((String) jsonObject.get("d5"));
            d6.setText((String) jsonObject.get("d6"));
            dM.setText((String) jsonObject.get("dM"));
            dS.setText((String) jsonObject.get("dS"));

            m1.setText((String) jsonObject.get("m1"));
            m2.setText((String) jsonObject.get("m2"));
            m3.setText((String) jsonObject.get("m3"));
            m4.setText((String) jsonObject.get("m4"));
            mS.setText((String) jsonObject.get("mS"));

            e1.setText((String) jsonObject.get("e1"));
            e2.setText((String) jsonObject.get("e2"));
            e3.setText((String) jsonObject.get("e3"));
            e4.setText((String) jsonObject.get("e4"));
            e5.setText((String) jsonObject.get("e5"));
            e6.setText((String) jsonObject.get("e6"));
            eM.setText((String) jsonObject.get("eM"));
            eS.setText((String) jsonObject.get("eS"));

            f1.setText((String) jsonObject.get("f1"));
            f2.setText((String) jsonObject.get("f2"));
            f3.setText((String) jsonObject.get("f3"));
            f4.setText((String) jsonObject.get("f4"));
            fM.setText((String) jsonObject.get("fM"));
            fS.setText((String) jsonObject.get("fS"));

            wr1.setText((String) jsonObject.get("wr1"));
            wr2.setText((String) jsonObject.get("wr2"));
            wr3.setText((String) jsonObject.get("wr3"));
            wr4.setText((String) jsonObject.get("wr4"));
            wr5.setText((String) jsonObject.get("wr5"));
            wr6.setText((String) jsonObject.get("wr6"));
            wrS.setText((String) jsonObject.get("wrS"));

            rw1.setText((String) jsonObject.get("rw1"));
            rw2.setText((String) jsonObject.get("rw2"));
            rw3.setText((String) jsonObject.get("rw3"));
            rw4.setText((String) jsonObject.get("rw4"));
            rw5.setText((String) jsonObject.get("rw5"));
            rw6.setText((String) jsonObject.get("rw6"));
            rwS.setText((String) jsonObject.get("rwS"));

            g1.setText((String) jsonObject.get("g1"));
            g2.setText((String) jsonObject.get("g2"));
            g3.setText((String) jsonObject.get("g3"));
            g4.setText((String) jsonObject.get("g4"));

            tu3.setText((String) jsonObject.get("tu3"));
            tu4.setText((String) jsonObject.get("tu4"));

            idaf3.setText((String) jsonObject.get("idaf3"));
            idaf4.setText((String) jsonObject.get("idaf4"));

            idpa6.setText((String) jsonObject.get("idpa6"));

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
    }

    public void save() {
        JSONObject jsonObject = new JSONObject();

        // Define the names and order of the TextFields
        String[] fieldNames = {"d1", "d2", "d3", "d4", "d5", "d6", "dM", "dS",
                "m1", "m2", "m3", "m4", "mS",
                "e1", "e2", "e3", "e4", "e5", "e6", "eS", "eM",
                "f1", "f2", "f3", "f4", "fS", "fM",
                "wr1", "wr2", "wr3", "wr4", "wr5", "wr6", "wrS",
                "rw1", "rw2", "rw3", "rw4", "rw5", "rw6", "rwS",
                "g1", "g2", "g3", "g4",
                "tu3", "tu4",
                "idaf3", "idaf4",
                "idpa6"
        };
        TextField[] fields = {d1, d2, d3, d4, d5, d6, dM, dS,
                m1, m2, m3, m4, mS,
                e1, e2, e3, e4, e5, e6, eS, eM,
                f1, f2, f3, f4, fS, fM,
                wr1, wr2, wr3, wr4, wr5, wr6, wrS,
                rw1, rw2, rw3, rw4, rw5, rw6, rwS,
                g1, g2, g3, g4,
                tu3, tu4,
                idaf3, idaf4,
                idpa6
        };

        // Loop through the TextFields and add their values to the JSONObject
        for (int i = 0; i < fieldNames.length; i++) {
            String value = fields[i].getText();
            if (value != null && !value.isEmpty()) {
                jsonObject.put(fieldNames[i], value);
            } else {
                jsonObject.put(fieldNames[i], "");
            }
        }


        try (FileWriter fileWriter = new FileWriter(filePath)) {
            fileWriter.write(JSONValue.toJSONString(jsonObject));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initialize() {
        initial();
    }

    public void import_csv() {
        String line = " ";
        String splitBy = ",";
        try {
            // parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader(String.valueOf(App.class.getResource("data.csv").getPath())));
            for(int i = 0; (line = br.readLine()) != null; i++) {
                String[] faecherCSV = line.split(splitBy);
                if (i>=1) {
                    // add read data as "Fach" to faecher list
                    faecher.add(new Fach(faecherCSV[0]));
                    ArrayList<Double> noten = new ArrayList<>(List.of(
                            Double.parseDouble(faecherCSV[1]),
                            Double.parseDouble(faecherCSV[2]),
                            Double.parseDouble(faecherCSV[3]),
                            Double.parseDouble(faecherCSV[4]),
                            Double.parseDouble(faecherCSV[5]),
                            Double.parseDouble(faecherCSV[6])));
                    faecher.get(i-1).setZeugnisnoten(noten);
                    faecher.get(i-1).setSchriftlich(Double.parseDouble(faecherCSV[7]));
                    faecher.get(i-1).setMündlich(Double.parseDouble(faecherCSV[8]));
                    faecher.get(i-1).setErfahrungsnotePos1(Double.parseDouble(faecherCSV[9]));
                    faecher.get(i-1).setPrüfungsnotePos2(Double.parseDouble(faecherCSV[10]));

                }
            }
            d1.setText(faecher.get(0).getZeugnisnotenBySemester(1)+"");
            d2.setText(faecher.get(0).getZeugnisnotenBySemester(2)+"");
            d3.setText(faecher.get(0).getZeugnisnotenBySemester(3)+"");
            d4.setText(faecher.get(0).getZeugnisnotenBySemester(4)+"");
            d5.setText(faecher.get(0).getZeugnisnotenBySemester(5)+"");
            d6.setText(faecher.get(0).getZeugnisnotenBySemester(6)+"");
            dM.setText(faecher.get(0).getMündlich()+"");
            dS.setText(faecher.get(0).getSchriftlich()+"");
            zD.setText(faecher.get(0).getErfahrungsnotePos1()+"");
            pD.setText(faecher.get(0).getPrüfungsnotePos2()+"");
            FnD.setText(faecher.get(0).getFachnote()+"");

            f1.setText(faecher.get(1).getZeugnisnotenBySemester(1)+"");
            f2.setText(faecher.get(1).getZeugnisnotenBySemester(2)+"");
            f3.setText(faecher.get(1).getZeugnisnotenBySemester(3)+"");
            f4.setText(faecher.get(1).getZeugnisnotenBySemester(4)+"");
            fM.setText(faecher.get(1).getMündlich()+"");
            fS.setText(faecher.get(1).getSchriftlich()+"");
            zF.setText(faecher.get(1).getErfahrungsnotePos1()+"");
            pF.setText(faecher.get(1).getPrüfungsnotePos2()+"");
            FnF.setText(faecher.get(1).getFachnote()+"");

            e1.setText(faecher.get(2).getZeugnisnotenBySemester(1)+"");
            e2.setText(faecher.get(2).getZeugnisnotenBySemester(2)+"");
            e3.setText(faecher.get(2).getZeugnisnotenBySemester(3)+"");
            e4.setText(faecher.get(2).getZeugnisnotenBySemester(4)+"");
            e5.setText(faecher.get(2).getZeugnisnotenBySemester(5)+"");
            e6.setText(faecher.get(2).getZeugnisnotenBySemester(6)+"");
            eS.setText(faecher.get(2).getSchriftlich()+"");
            zE.setText(faecher.get(2).getErfahrungsnotePos1()+"");
            pE.setText(faecher.get(2).getPrüfungsnotePos2()+"");
            FnE.setText(faecher.get(2).getFachnote()+"");

            m1.setText(faecher.get(3).getZeugnisnotenBySemester(1)+"");
            m2.setText(faecher.get(3).getZeugnisnotenBySemester(2)+"");
            m3.setText(faecher.get(3).getZeugnisnotenBySemester(3)+"");
            m4.setText(faecher.get(3).getZeugnisnotenBySemester(4)+"");
            mS.setText(faecher.get(3).getSchriftlich()+"");
            zM.setText(faecher.get(3).getErfahrungsnotePos1()+"");
            pM.setText(faecher.get(3).getPrüfungsnotePos2()+"");
            FnM.setText(faecher.get(3).getFachnote()+"");

            wr1.setText(faecher.get(4).getZeugnisnotenBySemester(1)+"");
            wr2.setText(faecher.get(4).getZeugnisnotenBySemester(2)+"");
            wr3.setText(faecher.get(4).getZeugnisnotenBySemester(3)+"");
            wr4.setText(faecher.get(4).getZeugnisnotenBySemester(4)+"");
            wr5.setText(faecher.get(4).getZeugnisnotenBySemester(5)+"");
            wr6.setText(faecher.get(4).getZeugnisnotenBySemester(6)+"");
            wrS.setText(faecher.get(4).getSchriftlich()+"");
            zWR.setText(faecher.get(4).getErfahrungsnotePos1()+"");
            pWR.setText(faecher.get(4).getPrüfungsnotePos2()+"");
            FnWR.setText(faecher.get(4).getFachnote()+"");

            rw1.setText(faecher.get(5).getZeugnisnotenBySemester(1)+"");
            rw2.setText(faecher.get(5).getZeugnisnotenBySemester(2)+"");
            rw3.setText(faecher.get(5).getZeugnisnotenBySemester(3)+"");
            rw4.setText(faecher.get(5).getZeugnisnotenBySemester(4)+"");
            rw5.setText(faecher.get(5).getZeugnisnotenBySemester(5)+"");
            rw6.setText(faecher.get(5).getZeugnisnotenBySemester(6)+"");
            rwS.setText(faecher.get(5).getSchriftlich()+"");
            zRW.setText(faecher.get(5).getErfahrungsnotePos1()+"");
            pRW.setText(faecher.get(5).getPrüfungsnotePos2()+"");
            FnRW.setText(faecher.get(5).getFachnote()+"");

            g1.setText(faecher.get(6).getZeugnisnotenBySemester(1)+"");
            g2.setText(faecher.get(6).getZeugnisnotenBySemester(2)+"");
            g3.setText(faecher.get(6).getZeugnisnotenBySemester(3)+"");
            g4.setText(faecher.get(6).getZeugnisnotenBySemester(4)+"");
            zG.setText(faecher.get(6).getErfahrungsnotePos1()+"");
            FnG.setText(faecher.get(6).getFachnote()+"");

            tu3.setText(faecher.get(7).getZeugnisnotenBySemester(1)+"");
            tu4.setText(faecher.get(7).getZeugnisnotenBySemester(2)+"");
            zTU.setText(faecher.get(7).getErfahrungsnotePos1()+"");
            FnTU.setText(faecher.get(7).getFachnote()+"");

            idpa6.setText(faecher.get(8).getZeugnisnotenBySemester(1)+"");
            zIDPA.setText(faecher.get(8).getErfahrungsnotePos1()+"");
            FnIDPA.setText(faecher.get(8).getFachnote()+"");

            idaf3.setText(faecher.get(9).getZeugnisnotenBySemester(1)+"");
            idaf4.setText(faecher.get(9).getZeugnisnotenBySemester(2)+"");
            zIDAF.setText(faecher.get(9).getErfahrungsnotePos1()+"");
            FnIDAF.setText(faecher.get(9).getFachnote()+"");
            save();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void export_csv() throws IOException {
        berechnen();
        String csv = "Fach,1. Semester,2. Semester,3. Semester,4. Semester,5. Semester,6. Semester,schriftlich,mündlich,prüfungsnote,erfahrungsnote,fachnote\n";
        for(Fach fach : faecher) {
            csv += fach.toCSV();
        }
        try {
            FileWriter file = new FileWriter(String.valueOf(App.class.getResource("data.csv").getPath()));
            file.write(csv);
            file.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public void delete() {
        faecher.clear();
        for (Node node : grid1.getChildren()) {
                if (node instanceof TextField) {
                    TextField textField = (TextField) node;
                    textField.clear();
                }
            }
    }

    public void prognose() {
        for (Node node : grid1.getChildren()) {
            if (node instanceof TextField) {
                TextField textField = (TextField) node;
                if (textField.getText() != null && !textField.getText().isEmpty()) {
                    try {
                        double v = Double.parseDouble(textField.getText());
                        if (!textField.getText().matches("^([1-5](\\.5)?)$|^([0-6])$|^([1-6](\\.0)?)$")) {
                            allFieldsFilled = false;
                            break;
                        } else {
                            allFieldsFilled = true;
                        }
                    } catch (NumberFormatException e) {
                        allFieldsFilled = false;
                        break;
                    }
                }
            }
        }

        if (allFieldsFilled) {

            TextField[][] ziele = {
                    {dS, dM},
                    {eS, eM},
                    {mS},
                    {fS, fM},
                    {wrS},
                    {rwS}
            };

            TextField[][] textFields = {
                    {d1, d2, d3, d4, d5, d6},
                    {e1, e2, e3, e4, e5, e6},
                    {m1, m2, m3, m4},
                    {f1, f2, f3, f4},
                    {wr1, wr2, wr3, wr4, wr5, wr6},
                    {rw1, rw2, rw3, rw4, rw5, rw6}
            };

            for (Node node : grid1.getChildren()) {
                if (node instanceof TextField) {
                    TextField textField = (TextField) node;
                    if (textField.getText() != null && !textField.getText().isEmpty()) {

                    } else {
                        if (textField.getId().matches(".\\d.")) {
                            textField.setText("4");
                        }
                    }
                }
            }

            for (int i = 0; i < textFields.length; i++) {
                double sum = 0;
                int count = 0;
                for (int j = 0; j < textFields[i].length; j++) {
                    sum += Double.parseDouble(textFields[i][j].getText());
                    count++;
                }
                double average = sum / count;
                double rounded = Math.round(average * 2) / 2.0;
                average = rounded;
                double prognoseSchnitt = 7.5-average;
                double prognoseEinzeln= prognoseSchnitt- 0.25;
                double prognoseS= prognoseEinzeln+0.25;
                double prognoseM=prognoseEinzeln-0.25;
                for (int k=0; k<1; k++){
                    switch (ziele[i].length){
                        case 1:
                            ziele[i][k].setText(Double.toString(prognoseS));
                            break;
                        case 2:
                            ziele[i][k].setText(Double.toString(prognoseS));
                            ziele[i][k+1].setText(Double.toString(prognoseM));
                            break;
                    }
                }
                System.out.println("Average of row " + (i + 1) + ": " + average);
            }
        }
        else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Ups...");
            alert.setContentText("Bitte verwenden Sie Zahlen von 1-6 \nmit einem Abstand von 0.5");

            //Set icon for error Message
            Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
            stage.getIcons().add(new Image("prohibition.png"));

            DialogPane dialogPane = alert.getDialogPane();
            dialogPane.setStyle("-fx-background-color: #FFC0CB;");
            dialogPane.getStyleClass().add("alert");
            Node header = dialogPane.lookup(".dialog-pane .header-panel");
            header.setStyle("-fx-background-color: #FFC0CB;");

            // Show the alert dialog
            alert.showAndWait();
        }
    }

    // ToDo: Error handling (zB null)
    public void berechnen() throws IOException {
        for (Node node : grid1.getChildren()) {
            if (node instanceof TextField) {
                TextField textField = (TextField) node;
                if (textField.getText() != null && !textField.getText().isEmpty()) {
                    try {
                        double v = Double.parseDouble(textField.getText());
                        if (!textField.getText().matches("^([1-5](\\.5)?)$|^([0-6])$")) {
                            allFieldsFilled = false;
                            break;
                        } else {
                            allFieldsFilled = true;
                        }
                    } catch (NumberFormatException e) {
                        allFieldsFilled = false;
                        break;
                    }
                }
            }
        }

        if (allFieldsFilled) {
            faecher.clear();
            // daten als "Fach" objekt speichern und berechnen
            Fach d = new Fach("Deutsch");
            d.setZeugnisnoten(new ArrayList<>(Arrays.asList(
                    Double.parseDouble(d1.getText()),
                    Double.parseDouble(d2.getText()),
                    Double.parseDouble(d3.getText()),
                    Double.parseDouble(d4.getText()),
                    Double.parseDouble(d5.getText()),
                    Double.parseDouble(d6.getText()))));
            d.setSchriftlich(Double.parseDouble(dS.getText()));
            d.setMündlich(Double.parseDouble(dM.getText()));
            d.setErfahrungsnotePos1(d.getPos1());
            d.setPrüfungsnotePos2(d.getPos2());
            zD.setText(d.getErfahrungsnotePos1()+"");
            pD.setText(d.getPrüfungsnotePos2()+"");
            FnD.setText(d.getFachnote()+"");
            faecher.add(d);

            Fach f = new Fach("Französisch");
            f.setZeugnisnoten(new ArrayList<>(Arrays.asList(
                    Double.parseDouble(f1.getText()),
                    Double.parseDouble(f2.getText()),
                    Double.parseDouble(f3.getText()),
                    Double.parseDouble(f4.getText()))));
            f.setSchriftlich(Double.parseDouble(fS.getText()));
            f.setMündlich(Double.parseDouble(fM.getText()));
            f.setErfahrungsnotePos1(f.getPos1());
            f.setPrüfungsnotePos2(f.getPos2());
            zF.setText(f.getErfahrungsnotePos1()+"");
            pF.setText(f.getPrüfungsnotePos2()+"");
            FnF.setText(f.getFachnote()+"");
            faecher.add(f);

            Fach e = new Fach("Englisch");
            e.setZeugnisnoten(new ArrayList<>(Arrays.asList(
                    Double.parseDouble(e1.getText()),
                    Double.parseDouble(e2.getText()),
                    Double.parseDouble(e3.getText()),
                    Double.parseDouble(e4.getText()),
                    Double.parseDouble(e5.getText()),
                    Double.parseDouble(e6.getText()))));
            e.setSchriftlich(Double.parseDouble(eS.getText()));
            e.setMündlich(Double.parseDouble(eM.getText()));
            e.setErfahrungsnotePos1(e.getPos1());
            e.setPrüfungsnotePos2(e.getPos2());
            zE.setText(e.getErfahrungsnotePos1()+"");
            pE.setText(e.getPrüfungsnotePos2()+"");
            FnE.setText(e.getFachnote()+"");
            faecher.add(e);

            Fach m = new Fach("Mathematik");
            m.setZeugnisnoten(new ArrayList<>(Arrays.asList(
                    Double.parseDouble(m1.getText()),
                    Double.parseDouble(m2.getText()),
                    Double.parseDouble(m3.getText()),
                    Double.parseDouble(m4.getText()))));
            m.setSchriftlich(Double.parseDouble(mS.getText()));
            m.setErfahrungsnotePos1(m.getPos1());
            m.setPrüfungsnotePos2(m.getPos2());
            zM.setText(m.getErfahrungsnotePos1()+"");
            pM.setText(m.getPrüfungsnotePos2()+"");
            FnM.setText(m.getFachnote()+"");
            faecher.add(m);

            Fach wr = new Fach("Wirtschaft und Recht");
            wr.setZeugnisnoten(new ArrayList<>(Arrays.asList(
                    Double.parseDouble(wr1.getText()),
                    Double.parseDouble(wr2.getText()),
                    Double.parseDouble(wr3.getText()),
                    Double.parseDouble(wr4.getText()),
                    Double.parseDouble(wr5.getText()),
                    Double.parseDouble(wr6.getText()))));
            wr.setSchriftlich(Double.parseDouble(wrS.getText()));
            wr.setErfahrungsnotePos1(wr.getPos1());
            wr.setPrüfungsnotePos2(wr.getPos2());
            zWR.setText(wr.getErfahrungsnotePos1()+"");
            pWR.setText(wr.getPrüfungsnotePos2()+"");
            FnWR.setText(wr.getFachnote()+"");
            faecher.add(wr);

            Fach rw = new Fach("Finanz- und Rechnungswesen");
            rw.setZeugnisnoten(new ArrayList<>(Arrays.asList(
                    Double.parseDouble(rw1.getText()),
                    Double.parseDouble(rw2.getText()),
                    Double.parseDouble(rw3.getText()),
                    Double.parseDouble(rw4.getText()),
                    Double.parseDouble(rw5.getText()),
                    Double.parseDouble(rw6.getText()))));
            rw.setSchriftlich(Double.parseDouble(rwS.getText()));
            rw.setErfahrungsnotePos1(rw.getPos1());
            rw.setPrüfungsnotePos2(rw.getPos2());
            zRW.setText(rw.getErfahrungsnotePos1()+"");
            pRW.setText(rw.getPrüfungsnotePos2()+"");
            FnRW.setText(rw.getFachnote()+"");
            faecher.add(rw);

            Fach g = new Fach("Geschichte und Politik");
            g.setZeugnisnoten(new ArrayList<>(Arrays.asList(
                    Double.parseDouble(f1.getText()),
                    Double.parseDouble(f2.getText()),
                    Double.parseDouble(f3.getText()),
                    Double.parseDouble(f4.getText()))));
            g.setErfahrungsnotePos1(g.getPos1());
            zG.setText(g.getErfahrungsnotePos1()+"");
            FnG.setText(g.getFachnote()+"");
            faecher.add(g);

            Fach tu = new Fach("Technik und Umwelt");
            tu.setZeugnisnoten(new ArrayList<>(Arrays.asList(
                    Double.parseDouble(tu3.getText()),
                    Double.parseDouble(tu4.getText()))));
            tu.setErfahrungsnotePos1(Double.parseDouble(tu4.getText()));
            zTU.setText(tu.getErfahrungsnotePos1()+"");
            FnTU.setText(tu.getFachnote()+"");
            faecher.add(tu);

            Fach idpa = new Fach("IDPA");
            idpa.setZeugnisnoten(new ArrayList<>(Arrays.asList(
                    Double.parseDouble(idpa6.getText()))));
            idpa.setErfahrungsnotePos1(idpa.getPos1());
            zIDPA.setText(idpa.getErfahrungsnotePos1()+"");
            FnIDPA.setText(idpa.getFachnote()+"");
            faecher.add(idpa);

            Fach idaf = new Fach("IDAF");
            idaf.setZeugnisnoten(new ArrayList<>(Arrays.asList(
                    Double.parseDouble(idaf3.getText()),
                    Double.parseDouble(idaf4.getText()))));
            idaf.setErfahrungsnotePos1(idaf.getPos1());
            zIDAF.setText(idaf.getErfahrungsnotePos1()+"");
            FnIDAF.setText(idaf.getFachnote()+"");
            faecher.add(idaf);

            // gesamtnote, anzahl tiefnoten und tiefpunkte berechnen
            gesamtnote.setText(getGesamtnote()+"");
            anzahl_tiefnoten.setText(getAnzahlTiefnoten()+"");
            tiefpunkte.setText(getTiefpunkte()+"");

            // Remove all data series from line chart
            lineChart.getData().removeAll(lineChart.getData());
            // Define the subjects and their corresponding text fields
            String[] subjects = {"Deutsch", "Englisch", "Mathematik", "Französisch", "Wirtschaft und Recht", "Finanz- und Rechnungswesen", "Geschichte und Politik"};
            TextField[][] textFields = {
                    {d1, d2, d3, d4, d5, d6},
                    {e1, e2, e3, e4, e5, e6},
                    {m1, m2, m3, m4},
                    {f1, f2, f3, f4},
                    {wr1, wr2, wr3, wr4, wr5, wr6},
                    {rw1, rw2, rw3, rw4, rw5, rw6},
                    {g1, g2, g3, g4}
            };

            // Create a series for each subject
            for (int i = 0; i < subjects.length; i++) {
                XYChart.Series<Number, Number> series = new XYChart.Series<>();
                series.setName(subjects[i]);
                series.getData().add(new XYChart.Data<>(0, 0));

                TextField[] actuelList = new TextField[textFields[i].length];
                for (int j = 0; j < textFields[i].length; j++) {
                    if (!textFields[i][j].getText().isEmpty()) {
                        actuelList[j] = textFields[i][j];
                    }
                }
                for (int j = 0; j < actuelList.length; j++) {
                    if (actuelList[j] != null && !actuelList[j].getText().isEmpty()) {
                        series.getData().add(new XYChart.Data<>(j + 1, Double.parseDouble(actuelList[j].getText())));
                    }
                }

                // Add the series to the chart
                lineChart.getData().add(series);
            }

            NumberAxis yAxis = (NumberAxis) lineChart.getYAxis();
            yAxis.setUpperBound(6.5);
            yAxis.setTickUnit(0.5);
            yAxis.setAutoRanging(false);

            NumberAxis xAxis = (NumberAxis) lineChart.getXAxis(); // min, max, tickUnit
            xAxis.setAutoRanging(false);
            double maxXValue = 6.5; // or any other maximum x value
            xAxis.setUpperBound(maxXValue);
            xAxis.setTickUnit(1);

        } else {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Error");
            alert.setHeaderText("Ups...");
            alert.setContentText("Bitte verwenden Sie Zahlen von 1-6 \nmit einem Abstand von 0.5");

            // Set icon for error Message
            Stage stage = (Stage) alert.getDialogPane().getScene().getWindow();
            stage.getIcons().add(new Image("prohibition.png"));

            DialogPane dialogPane = alert.getDialogPane();
            dialogPane.setStyle("-fx-background-color: #FFC0CB;");
            dialogPane.getStyleClass().add("alert");
            Node header = dialogPane.lookup(".dialog-pane .header-panel");
            header.setStyle("-fx-background-color: #FFC0CB;");

            // Show the alert dialog
            alert.showAndWait();
        }
    }

    public Double getGesamtnote() {
        Double total = 0.0;
        int validNoten = 0;
        for(Fach fach : faecher) {
            if(fach.getFachnote() > 0) {
                total += fach.getFachnote();
                validNoten++;
            }
        }
        return total/validNoten;
    }

    public Integer getAnzahlTiefnoten() {
        int anzahl = 0;
        for(Fach fach : faecher) {
            if(fach.getFachnote() > 0 && fach.getFachnote() < 4) {
                anzahl++;
            }
        }
        return anzahl;
    }

    public Double getTiefpunkte() {
        Double tiefpunkte = 0.0;
        for(Fach fach : faecher) {
            if(fach.getFachnote() > 0 && fach.getFachnote() < 4) {
                tiefpunkte += 4.0-fach.getFachnote();
            }
        }
        return tiefpunkte;
    }
}