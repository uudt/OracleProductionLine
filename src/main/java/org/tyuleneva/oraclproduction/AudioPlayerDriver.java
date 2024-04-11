/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.tyuleneva.oraclproduction;

/**
 *
 * @author udtyu
 */
public class AudioPlayerDriver {
    
    public static void testAudioPlayer() {

    AudioPlayer a1 = new AudioPlayer("iPod Mini", "MP3");
    a1.play();
    a1.stop();
    a1.next();
    a1.previous();
    System.out.println(a1.toString());

    AudioPlayer a2 = new AudioPlayer("Walkman", "WAV");
    System.out.println(a2.toString());
  }
    
}

