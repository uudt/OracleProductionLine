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

public class TestProductionLine {
    
    public static void main(String[] args) {
        EmployeeInfo employee = new EmployeeInfo();
        System.out.println(employee.getCode());
        System.out.println(employee.toString());
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
        ProcessFiles process = new ProcessFiles(employee, products);
    }
    
}
