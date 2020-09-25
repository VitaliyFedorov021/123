package ua.com.practice;

import java.io.*;
import java.util.Scanner;

public class Run {
    File file = new File("C:/Users/Vitaliy/Desktop/holidays.txt");

    public void action() {
        readFromFile();
    }

    private void readFromFile() {
        FileInputStream fis = null;
        InputStreamReader isr = null;
        try {
            fis = new FileInputStream(file);
            isr = new InputStreamReader(fis, "UTF-8");
            Scanner sc = new Scanner(isr);
            while(sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fis.close();
                isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
