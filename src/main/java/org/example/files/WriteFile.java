package org.example.files;

import org.example.prints.ProcessedFile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void writeLine(String fileName, String delimiter, ProcessedFile pf) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.newLine();
            bw.write("");
            bw.newLine();
            bw.write(pf.getNewInfo().get(0));
            bw.newLine();
            bw.write(pf.getNewInfo().get(1));
            bw.newLine();
            bw.write(pf.getNewInfo().get(2));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
