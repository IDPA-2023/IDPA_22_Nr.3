package kbw.stragiotti;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // ToDo: daten einlesen
        // 1. semester
        double d1 = 0.0;
        double f1 = 0.0;
        double e1 = 0.0;
        double m1 = 0.0;
        double wr1 = 0.0;
        double rw1 = 0.0;
        double g1 = 0.0;
        // 2. semester
        double d2 = 0.0;
        double f2 = 0.0;
        double e2 = 0.0;
        double m2 = 0.0;
        double wr2 = 0.0;
        double rw2 = 0.0;
        double g2 = 0.0;
        // 3. semester
        double d3 = 0.0;
        double f3 = 0.0;
        double e3 = 0.0;
        double m3 = 0.0;
        double wr3 = 0.0;
        double rw3 = 0.0;
        double g3 = 0.0;
        double tu3 = 0.0;
        // 4. semester
        double d4 = 0.0;
        double f4 = 0.0;
        double e4 = 0.0;
        double m4 = 0.0;
        double wr4 = 0.0;
        double rw4 = 0.0;
        double g4 = 0.0;
        double tu4 = 0.0;
        // 5. semester
        double d5 = 0.0;
        double e5 = 0.0;
        double wr5 = 0.0;
        double rw5 = 0.0;
        // 6. semester
        double d6 = 0.0;
        double e6 = 0.0;
        double wr6 = 0.0;
        double rw6 = 0.0;
        // schriftliche abschlussprüfungen
        double d_schriftlich = 0.0;
        double f_schriftlich = 0.0;
        double e_schriftlich = 0.0;
        double m_schriftlich = 0.0;
        double wr_schriftlich = 0.0;
        double rw_schriftlich = 0.0;
        // mündliche abschlussprüfungen
        double d_muendlich = 0.0;
        double f_muendlich = 0.0;
        double e_muendlich = 0.0;
        // idpa
        double idpa = 0.0;
        // idaf
        double idaf1 = 0.0;
        double idaf2 = 0.0;

        // fächer erstellen (beispiel)
        Fach d = new Fach("Deutsch", new ArrayList<Double>(Arrays.asList(d1, d2, d3, d4, d5, d6)));
        d.setSchriftlich(d_schriftlich);
        d.setMuendlich(d_muendlich);

        double d_pos1 = d.getPos1();
        double d_pos2 = d.getPos2();

        // ToDo: diagram erstellen
        // ToDo: exportieren
        // ToDo: Authentifizierung
    }

}