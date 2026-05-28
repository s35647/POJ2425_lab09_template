package com.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DictionaryFileReader {
    public DictionaryFileReader(String s) {
    }

    public List<String[]> getRawFileData() throws IOException {
        String filePath = "src/main/resources/dictionaries.csv";
        List<String[]> result = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                result.add(values);
            }
        }
        return result;
    }
}
