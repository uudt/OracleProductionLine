/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.tyuleneva.oraclproduction;

/**
 *
 * @author udtyu
 */
public class MoviePlayerDriver {
    
    public static void testMoviePlayer() {
        MoviePlayer mp = new MoviePlayer("DBPOWER MK101",new Screen(
            "720x480",40,22),MonitorType.LCD);
        System.out.println(mp.toString());
        //System.out.println("\n");
        MoviePlayer mp2 = new MoviePlayer("Pyle PDV156BK",new Screen(
            "1366x768",40,22),MonitorType.LED);
        System.out.println(mp2.toString());
      }
    
}

