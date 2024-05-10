package org.example;

import org.example.files.CreateTextFile;
import org.example.files.WriteFile;
import org.example.prints.ProcessedFile;

public class Main {
    private static String fileName = "src/main/resources/lista_alumnos.csv";
    private static String delimiter = ",";
    private static ProcessedFile pf = new ProcessedFile(fileName, delimiter);

    public static void main(String[] args) {
        pf.printFile();
        pf.numStudents();
        pf.averageAge();
        pf.calculateGrades();
        WriteFile.writeLine(fileName, delimiter, pf);
        CreateTextFile.createInform(pf);
    }
}