package idpa;

import java.util.ArrayList;
import java.util.Arrays;

public class Fach {
    private String name;
    private ArrayList<Double> zeugnisnoten;
    private double schriftlich;
    private double muendlich;
    private int start_semester = 1;
    private int end_semester = 6;
    private boolean schriftlich_exist;
    private boolean muendlich_exist;

    public Fach(String name, boolean schriftlich_exist, boolean muendlich_exist) {
        this.name = name;
        this.schriftlich_exist = schriftlich_exist;
        this.muendlich_exist = muendlich_exist;
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
    public int getStart_semester() {
        return start_semester;
    }
    public void setStart_semester(int start_semester) {
        this.start_semester = start_semester;
    }
    public int getEnd_semester() {
        return end_semester;
    }
    public void setEnd_semester(int end_semester) {
        this.end_semester = end_semester;
    }
    public boolean isSchriftlich_exist() {
        return schriftlich_exist;
    }
    public void setSchriftlich_exist(boolean schriftlich_exist) {
        this.schriftlich_exist = schriftlich_exist;
    }
    public boolean isMuendlich_exist() {
        return muendlich_exist;
    }
    public void setMuendlich_exist(boolean muendlich_exist) {
        this.muendlich_exist = muendlich_exist;
    }
}
