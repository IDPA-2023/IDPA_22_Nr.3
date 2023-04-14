package idpa;

import java.util.ArrayList;

public class Fach {
    private String name;
    private ArrayList<Double> zeugnisnoten;
    private double schriftlich;
    private double mündlich;
    private double erfahrungsnote;
    private double prüfungsnote;

    public Fach(String name) {
        this.name = name;
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
    public double getMündlich() {
        return mündlich;
    }
    public void setMündlich(double mündlich) {
        this.mündlich = mündlich;
    }
    public double getErfahrungsnote() {
        return erfahrungsnote;
    }
    public void setErfahrungsnote(double erfahrungsnote) {
        this.erfahrungsnote = erfahrungsnote;
    }
    public double getPrüfungsnote() {
        return prüfungsnote;
    }
    public void setPrüfungsnote(double prüfungsnote) {
        this.prüfungsnote = prüfungsnote;
    }

    // position 1 (erfahrungsnote, z) berechnen
    public double getPos1() {
        return (schriftlich+mündlich)/2;
    }

    // position 2 (prüfungsnote, p) berechnen
    public double getPos2() {
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
