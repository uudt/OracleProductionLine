/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.tyuleneva.oraclproduction;

/**
 *
 * @author udtyu
 */
public class MoviePlayer extends Product implements MultimediaControl {
    public MonitorType monitorType;
    public Screen screen;

    // a constructor
    public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
      super(name);
      this.monitorType = monitorType;
      //this.monitorType = MonitorType.LED;
      this.screen = screen;

    }

    // implement methods of the MultimediaControl interface - print
    @Override
    public void play() {
      System.out.println("Playing movie");
    }

    @Override
    public void stop() {
      System.out.println("Stopping movie");
    }

    @Override
    public void previous() {
      System.out.println("Previous movie");
    }

    @Override
    public void next() {
      System.out.println("Next movie");
    }

    // a toString method calls the product toString to display the monitor and the screen details
    public String toString() {
        return
            super.toString() + "\n" +
                "Screen : " + screen + "\n" +
                "Monitor Type : " + monitorType;
    }
}

