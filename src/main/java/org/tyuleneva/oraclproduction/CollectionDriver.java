/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.tyuleneva.oraclproduction;

/**
 *
 * @author udtyu
 */
import java.util.ArrayList;
import java.util.Collections;

public class CollectionDriver {
    
    public static void testCollection() {

        AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
        AudioPlayer a2 = new AudioPlayer("Walkman", "WAV");
        MoviePlayer m1 = new MoviePlayer("DBPOWER MK101",
                new Screen(" 720x480", 40, 22), MonitorType.LCD);
        MoviePlayer m2 = new MoviePlayer("Pyle PDV156BK",
                new Screen("1366x768", 40, 22), MonitorType.LED);
        ArrayList<Product> products = new ArrayList<>();

        products.add(a1);
        products.add(a2);
        products.add(m1);
        products.add(m2);
        Collections.sort(products);
        print(products);
    }

    // Step 16
    public static <T> void print(ArrayList<T> products) {
        for (T p : products) {
            System.out.println(p);
        }
    }
    
}

