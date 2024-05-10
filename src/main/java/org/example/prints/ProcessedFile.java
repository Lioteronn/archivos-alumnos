package org.example.prints;

import org.example.files.LoadFile;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProcessedFile {
    private static List<String[]> rows;

    private List<String> newInfo = new ArrayList<>();

    public ProcessedFile(String fileName, String delimiter) {
        rows = LoadFile.csvReader(fileName, delimiter);
    }

    public void printFile() {

        for (String[] row : rows) {
            for (String s : row) {
                System.out.print(s + " ");
            }

            System.out.println();
        }
    }

    public void numStudents() {
        int numStudents = rows.size() - 1;

        System.out.println("Número de estudiantes: " + numStudents);

        newInfo.add("Número de estudiantes: " + numStudents);
    }

    public void averageAge() {
        int averageAge = 0;

        for (int i = 1; i < rows.size(); i++) {
            averageAge += Integer.parseInt(rows.get(i)[3]);
        }

        averageAge /= rows.size() - 1;

        System.out.println("Edad media de la clase: " + averageAge);

        newInfo.add("Edad media de la clase: " + averageAge);
    }

    public void calculateGrades() {
        float averageGrade = 0;
        float maxGrade;
        float minGrade;
        List<Float> grades = new ArrayList<>();

        for (int i = 1; i < rows.size(); i++) {
            averageGrade += Float.parseFloat(rows.get(i)[4]);
            grades.add(Float.parseFloat(rows.get(i)[4]));
        }

        averageGrade /= rows.size() - 1;
        maxGrade = Collections.max(grades);
        minGrade = Collections.min(grades);

        System.out.println("Nota media de la clase: " + String.format("%.2f", averageGrade));
        System.out.println("Nota máxima de la clase: " + String.format("%.2f", maxGrade));
        System.out.println("Nota mínima de la clase: " + String.format("%.2f", minGrade));

        newInfo.add("Nota media de la clase: " + averageGrade);
    }

    public List<String> getNewInfo() {
        return newInfo;
    }
}
