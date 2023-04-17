package idpa;

import java.util.ArrayList;

public class Fach {
    private String name;
    private ArrayList<Double> zeugnisnoten;
    private double schriftlich;
    private double mündlich;
    private double erfahrungsnotePos1;
    private double prüfungsnotePos2;
    private double fachnote;

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
    public Double getZeugnisnotenBySemester(int semester) {
        return zeugnisnoten.get(semester-1);
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
    public void setFachnote(double fachnote) {
        this.fachnote = fachnote;
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
        setErfahrungsnotePos1(Math.round((total/validNoten)*2)/2.0);
        return Math.round((total/validNoten)*2)/2.0;
    }

    // position 2 (prüfungsnote, p) berechnen
    public double getPos2() {
        Double pos2 = 0.0;
        if(mündlich == 0.0) {
            pos2 = Math.round(schriftlich*2)/2.0;
        }
        else {
            pos2 = Math.round(((schriftlich+mündlich)/2)*2)/2.0;
        }
        setPrüfungsnotePos2(pos2);
        return pos2;
    }

    // Fachnote berechnen
    public double getFachnote() {
        Double fachnote = 0.0;
        if(prüfungsnotePos2 == 0.0) {
            fachnote = Math.round(erfahrungsnotePos1*2)/2.0;
        } else {
            fachnote = Math.round(((erfahrungsnotePos1+prüfungsnotePos2)/2)*2)/2.0;
        }
        setFachnote(fachnote);
        return fachnote;
    }

    // Fach für CSV export
    public String toCSV() {
        String csv = name + ",";
        // zeugnisnoten
        if(zeugnisnoten.size() == 6) {
            for (Double note : zeugnisnoten) {
                csv += note + ",";
            }
        } else if(zeugnisnoten.size() == 4) {
            for (Double note : zeugnisnoten) {
                csv += note + ",";
            }
            csv += "0,0,";
        } else if(zeugnisnoten.size() == 2) {
            csv += "0,0,";
            for (Double note : zeugnisnoten) {
                csv += note + ",";
            }
            csv += "0,0,";
        } else if(zeugnisnoten.size() == 1) {
            csv += "0,0,0,0,0,";
            for (Double note : zeugnisnoten) {
                csv += note + ",";
            }
        } else {
            csv += "0,0,0,0,0,0,";
        }

        // schriftlich - falls vorhanden
        if(schriftlich != 0.0) {
            csv += schriftlich + ",";
        } else {
            csv += "0,";
        }

        // mündlich - falls vorhanden
        if(mündlich != 0.0) {
            csv += mündlich + ",";
        } else {
            csv += "0,";
        }

        // prüfungsnotePos2 - falls vorhanden
        if(prüfungsnotePos2 != 0.0) {
            csv += prüfungsnotePos2 + ",";
        } else {
            csv += "0,";
        }

        // erfahrungsnotePos1 - falls vorhanden
        if(erfahrungsnotePos1 != 0.0) {
            csv += erfahrungsnotePos1 + ",";
        } else {
            csv += "0,";
        }

        // fachnote - falls vorhanden
        if(fachnote != 0.0) {
            csv += fachnote;
        } else {
            csv += "0,";
        }

        return csv += "\n";
    }
}
