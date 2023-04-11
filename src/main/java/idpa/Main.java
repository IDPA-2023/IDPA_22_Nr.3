package idpa;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // ToDo: daten einlesen
        ArrayList<Fach> faecher = new ArrayList<Fach>();
        String line = " ";
        String splitBy = ",";
        try {
            // parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("/Users/samirastragiotti/IdeaProjects/notenrechner/src/main/resources/idpa/test_file.csv"));
            for(int i = 0; (line = br.readLine()) != null; i++) {
                String[] faecherCSV = line.split(splitBy);
                if (i>=1) {
                    /*
                    for testing reasons:

                    System.out.println("[Fach=" + faecherCSV[0] +
                            ", 1. Semester=" + faecherCSV[1] +
                            ", 2. Semester=" + faecherCSV[2] +
                            ", 3. Semester=" + faecherCSV[3] +
                            ", 4. Semester= " + faecherCSV[4] +
                            ", 5. Semester= " + faecherCSV[5] +
                            ", 6. Semester= " + faecherCSV[6] +
                            ", schriftlich= " + faecherCSV[7] +
                            ", mündlich= " + faecherCSV[8] +
                            ", start_semester= " + faecherCSV[9] +
                            ", start_semester= " + faecherCSV[10] +
                            ", schriftlich?= " + faecherCSV[11] +
                            ", mündlich?= " + faecherCSV[12] +"]");
                            */
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

        // ToDo: diagram erstellen
        // ToDo: exportieren
        // ToDo: Authentifizierung
    }

}
