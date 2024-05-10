package org.example.files;

import org.example.prints.ProcessedFile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOError;
import java.io.IOException;

public class CreateTextFile {

    public static void createInform(ProcessedFile pf) {
        File textFile = new File("src/main/resources/informe-clase.txt");

        try (FileWriter fw = new FileWriter(textFile)) {
            fw.write(String.join("\n", pf.getNewInfo()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
