package kbw.stragiotti;

import java.util.ArrayList;
import java.util.Arrays;

public class Fach {
    private String name;
    private ArrayList<Double> zeugnisnoten;
    private double schriftlich = 0.0;
    private double muendlich = 0.0;

    public Fach(String name, ArrayList<Double> zeugnisnoten) {
        this.name = name;
        this.zeugnisnoten = zeugnisnoten;
    }

    // position 1 (prüfungsnote) berechnen
    public double getPos1() {
        return zeugnisnoten.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }
    // position 2 (erfahrungsnote) berechnen
    public double getPos2() {
        return (schriftlich+muendlich)/2;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Double> getZeugnisnoten() {
        return zeugnisnoten;
    }
    public void setZeugnisnoten(ArrayList<Double> zeugnisnoten) {
        this.zeugnisnoten = zeugnisnoten;
    }
    public double getSchriftlich() {
        return schriftlich;
    }
    public void setSchriftlich(double schriftlich) {
        this.schriftlich = schriftlich;
    }
    public double getMuendlich() {
        return muendlich;
    }
    public void setMuendlich(double muendlich) {
        this.muendlich = muendlich;
    }
}
