package com.example.app_test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class txt {
    public static void modi(String nomefile, String cosa){
        try {
            String contenuto = read(nomefile);
            contenuto += cosa;
            save(nomefile, contenuto);
            System.out.println("si");

        } catch (IOException e) {
            System.err.println("no\n" + e.getMessage());
        }
    }
    private static String read(String nomefile) throws IOException {
        StringBuilder contenuto = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(nomefile))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                contenuto.append(linea).append("\n");
            }
        }
        return contenuto.toString();
    }

    private static void save(String nomefile, String contenuto) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomefile))) {
            writer.write(contenuto);
        }
    }

    public static void crea(String nomeFile) throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeFile))) {
            writer.write("");
        } catch (IOException e){
            System.err.println("no\n" + e.getMessage());
        }
    }


}
