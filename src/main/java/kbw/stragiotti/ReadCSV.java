package kbw.stragiotti;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadCSV {
    public static void main(String[] args) throws Exception
    {
        String line = " ";
        String splitBy = ",";
        try {
            // parsing a CSV file into BufferedReader class constructor
            BufferedReader br = new BufferedReader(new FileReader("/Users/samirastragiotti/IdeaProjects/notenrechner/src/main/resources/test_file.csv"));
            for(int i = 0; (line = br.readLine()) != null; i++) {
                String[] faecher = line.split(splitBy);
                if (i>=1) {
                    System.out.println("[Fach=" + faecher[0] + ", 1. Semester=" + faecher[1] + ", 2. Semester=" + faecher[2] + ", 3. Semester=" + faecher[3] + ", 4. Semester= " + faecher[4] + ", 5. Semester= " + faecher[5] + ", 6. Semester= " + faecher[6] + ", schriftlich= " + faecher[7] + ", mündlich= " + faecher[8] + ", start_mündlich= " + faecher[9] + ", start_schriftlich= " + faecher[10] + ", schriftlich?= " + faecher[11] + ", mündlich= " + faecher[12] +"]");

                }
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
