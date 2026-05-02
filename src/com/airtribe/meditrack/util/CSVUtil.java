package com.airtribe.meditrack.util;

import java.io.*;
import java.util.*;

public class CSVUtil {

    public static void save(List<String> data, String file) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (String line : data) {
                bw.write(line);
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Save error");
        }
    }

    public static List<String> load(String file) {
        List<String> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;

            while ((line = br.readLine()) != null) {
                list.add(line);
            }

        } catch (Exception e) {
            System.out.println("Load error");
        }

        return list;
    }
}