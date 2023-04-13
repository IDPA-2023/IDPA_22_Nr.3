package idpa;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.chart.LineChart;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import org.json.simple.JSONObject;
import org.json.simple.JSONValue;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

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
    private TextField g1;
    @FXML
    private TextField g2;
    @FXML
    private TextField g3;
    @FXML
    private TextField g4;

    @FXML
    private TextField tu3;
    @FXML
    private TextField tu4;

    @FXML
    private TextField idaf3;
    @FXML
    private TextField idaf4;

    @FXML
    private TextField idpa6;

    boolean allFieldsFilled = true;
    String filePath = "data.json";


    /* @FXML
    private void berechnen() {
        f.faecher.add(new Fach("Deutsch", !(dS.getText().isBlank()), !(dM.getText().isBlank())));
        ArrayList<Double> noten = new ArrayList<>(List.of(
                Double.parseDouble(d1.getText()),
                Double.parseDouble(d2.getText()),
                Double.parseDouble(d3.getText()),
                Double.parseDouble(d4.getText()),
                Double.parseDouble(d5.getText()),
                Double.parseDouble(d6.getText())));
        f.faecher.get(0).setZeugnisnoten(noten);
        // schriftlich setzen falls existiert
        if(f.faecher.get(0).isSchriftlich_exist()) {
            f.faecher.get(0).setSchriftlich(Double.parseDouble(dS.getText()));
        }
        // muendlich setzen falls existiert
        if(f.faecher.get(0).isMuendlich_exist()) {
            f.faecher.get(0).setMuendlich(Double.parseDouble(dM.getText()));
        }
        // noch die ergebnisse setzen
    }

     */

    @FXML
    private void speichern() {

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

    /*
    ToDo: import button machen und so dass file auswählen geht
    public void import() {
        ArrayList<Fach> faecher = new ArrayList<Fach>();
        String line = " ";
        String splitBy = ",";
        try {
            // parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("/Users/samirastragiotti/IdeaProjects/notenrechner/src/main/resources/idpa/test_file.csv"));
            for(int i = 0; (line = br.readLine()) != null; i++) {
                String[] faecherCSV = line.split(splitBy);
                if (i>=1) {
                    // add read data as "Fach" to faecher list
                    faecher.add(new Fach(faecherCSV[0], Boolean.parseBoolean(faecherCSV[11]), Boolean.parseBoolean(faecherCSV[12])));
                    ArrayList<Double> noten = new ArrayList<>(List.of(
                            Double.parseDouble(faecherCSV[1]),
                            Double.parseDouble(faecherCSV[2]),
                            Double.parseDouble(faecherCSV[3]),
                            Double.parseDouble(faecherCSV[4]),
                            Double.parseDouble(faecherCSV[5]),
                            Double.parseDouble(faecherCSV[6])));
                    if(noten != null) {
                        faecher.get(i-1).setZeugnisnoten(noten);
                    }
                    if(faecher.get(i-1).isSchriftlich_exist()) {
                        faecher.get(i-1).setSchriftlich(Double.parseDouble(faecherCSV[7]));
                    }
                    if(faecherCSV[9] != null) {
                        faecher.get(i-1).setStart_semester(Integer.parseInt(faecherCSV[9]));
                    }
                    if(faecherCSV[10] != null) {
                        faecher.get(i-1).setEnd_semester(Integer.parseInt(faecherCSV[10]));
                    }
                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

     */

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

    public void delete() {
            for (Node node : grid1.getChildren()) {
                if (node instanceof TextField) {
                    TextField textField = (TextField) node;
                    textField.clear();
                }
            }
    }

    public void berechnen() throws IOException {
        /* nur als test :)
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
                            // schriftlich berechnen

                        }
                    } catch (NumberFormatException e) {
                        allFieldsFilled = false;
                        break;
                    }
                }
            }
        }

        if (allFieldsFilled) {

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
         */
        Fach d = new Fach("Deutsch");
        ArrayList<Double> dNoten = new ArrayList<>();
        d.setZeugnisnoten(new ArrayList<>(Arrays.asList(
                Double.parseDouble(d1.getText()),
                Double.parseDouble(d2.getText()),
                Double.parseDouble(d3.getText()),
                Double.parseDouble(d4.getText()),
                Double.parseDouble(d5.getText()),
                Double.parseDouble(d6.getText()))));
        d.setSchriftlich(Double.parseDouble(dS.getText()));
        d.setMuendlich(Double.parseDouble(dM.getText()));

        Fach m = new Fach("Mathematik");
        ArrayList<Double> mNoten = new ArrayList<>();
        m.setZeugnisnoten(new ArrayList<>(Arrays.asList(
                Double.parseDouble(m1.getText()),
                Double.parseDouble(m2.getText()),
                Double.parseDouble(m3.getText()),
                Double.parseDouble(m4.getText()))));
        m.setSchriftlich(Double.parseDouble(mS.getText()));

        Fach e = new Fach("Englisch");
        ArrayList<Double> eNoten = new ArrayList<>();
        e.setZeugnisnoten(new ArrayList<>(Arrays.asList(
                Double.parseDouble(e1.getText()),
                Double.parseDouble(e2.getText()),
                Double.parseDouble(e3.getText()),
                Double.parseDouble(e4.getText()),
                Double.parseDouble(e5.getText()),
                Double.parseDouble(e6.getText()))));
        e.setSchriftlich(Double.parseDouble(eS.getText()));
        e.setMuendlich(Double.parseDouble(eM.getText()));

        Fach f = new Fach("Französisch");
        ArrayList<Double> fNoten = new ArrayList<>();
        f.setZeugnisnoten(new ArrayList<>(Arrays.asList(
                Double.parseDouble(f1.getText()),
                Double.parseDouble(f2.getText()),
                Double.parseDouble(f3.getText()),
                Double.parseDouble(f4.getText()))));
        f.setSchriftlich(Double.parseDouble(fS.getText()));
        f.setMuendlich(Double.parseDouble(fM.getText()));

        Fach wr = new Fach("Wirtschaft und Recht");
        ArrayList<Double> wrNoten = new ArrayList<>();
        e.setZeugnisnoten(new ArrayList<>(Arrays.asList(
                Double.parseDouble(wr1.getText()),
                Double.parseDouble(wr2.getText()),
                Double.parseDouble(wr3.getText()),
                Double.parseDouble(wr4.getText()),
                Double.parseDouble(wr5.getText()),
                Double.parseDouble(wr6.getText()))));
        e.setSchriftlich(Double.parseDouble(wrS.getText()));

        Fach rw = new Fach("Finanz- und Rechnungswesen");
        ArrayList<Double> rwNoten = new ArrayList<>();
        rw.setZeugnisnoten(new ArrayList<>(Arrays.asList(
                Double.parseDouble(rw1.getText()),
                Double.parseDouble(rw2.getText()),
                Double.parseDouble(rw3.getText()),
                Double.parseDouble(rw4.getText()),
                Double.parseDouble(rw5.getText()),
                Double.parseDouble(rw6.getText()))));
        rw.setSchriftlich(Double.parseDouble(rwS.getText()));

        Fach g = new Fach("Geschichte und Politik");
        ArrayList<Double> gNoten = new ArrayList<>();
        g.setZeugnisnoten(new ArrayList<>(Arrays.asList(
                Double.parseDouble(f1.getText()),
                Double.parseDouble(f2.getText()),
                Double.parseDouble(f3.getText()),
                Double.parseDouble(f4.getText()))));

        Fach tu = new Fach("Technik und Umwelt");
        ArrayList<Double> tuNoten = new ArrayList<>();
        tu.setZeugnisnoten(new ArrayList<>(Arrays.asList(
                Double.parseDouble(tu3.getText()),
                Double.parseDouble(tu4.getText()))));

        Fach idaf = new Fach("Informatik und Digitale Arbeit");
        ArrayList<Double> idafNoten = new ArrayList<>();
        idaf.setZeugnisnoten(new ArrayList<>(Arrays.asList(
                Double.parseDouble(idaf3.getText()),
                Double.parseDouble(idaf4.getText()))));

        Fach idpa = new Fach("Informatik und Programmieren");
        ArrayList<Double> idpaNoten = new ArrayList<>();
        idaf.setZeugnisnoten(new ArrayList<>(Arrays.asList(
                Double.parseDouble(idpa6.getText()))));
    }

    // position 1 (erfahrungsnote) berechnen
    public double getPos1(double schriftlich, double muendlich) {
        return (schriftlich+muendlich)/2;
    }

    // position 2 (prüfungsnote) berechnen
    public double getPos2(ArrayList<Double> zeugnisnoten) {
        Double total = 0.0;
        int validNoten = 0;
        for(Double note : zeugnisnoten) {
            if(note > 0) {
                total += note;
                validNoten++;
            }
        }
        return total/validNoten;
    }

}