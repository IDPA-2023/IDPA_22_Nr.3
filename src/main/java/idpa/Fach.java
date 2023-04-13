package idpa;

import java.util.ArrayList;

public class Fach {
    private String name;
    private ArrayList<Double> zeugnisnoten;
    private double schriftlich;
    private double muendlich;

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
    public double getMuendlich() {
        return muendlich;
    }
    public void setMuendlich(double muendlich) {
        this.muendlich = muendlich;
    }
    public double isSchriftlich() {
        return schriftlich;
    }
}
