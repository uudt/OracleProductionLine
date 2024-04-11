/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.tyuleneva.oraclproduction;

/**
 *
 * @author udtyu
 */
public class BothPlayersDriver {
    
    public static void main(String[] args){
        
        Screen S1 = new Screen("720",10,10);
        MoviePlayer Mp1 = new MoviePlayer("Player",S1,MonitorType.LED);
        System.out.println(Mp1.toString());
        Mp1.play();
        Mp1.stop();
        Mp1.previous();
        Mp1.next();

        AudioPlayer A1 = new AudioPlayer("Iphone","MP4");
        System.out.println(A1.toString());
        A1.play();
        A1.stop();
        A1.previous();
        A1.next();
    }
    
}

