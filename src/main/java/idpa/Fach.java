package idpa;

import java.util.ArrayList;

public class Fach {
    private String name;
    private ArrayList<Double> zeugnisnoten;
    private double schriftlich;
    private double mündlich;
    private double erfahrungsnotePos1;
    private double prüfungsnotePos2;

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
    public double getErfahrungsnotePos1() {
        return erfahrungsnotePos1;
    }
    public void setErfahrungsnotePos1(double erfahrungsnotePos2) {
        this.erfahrungsnotePos1 = erfahrungsnotePos2;
    }
    public double getPrüfungsnotePos2() {
        return prüfungsnotePos2;
    }
    public void setPrüfungsnotePos2(double prüfungsnotePos2) {
        this.prüfungsnotePos2 = prüfungsnotePos2;
    }

    // position 1 (erfahrungsnote, z) berechnen
    public double getPos1() {
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

    // position 2 (prüfungsnote, p) berechnen
    public double getPos2() {
        return (schriftlich+mündlich)/2;
    }

    // ToDo: Fachnoten berechnen und speichern, pos1 und pos2 speichern
}
