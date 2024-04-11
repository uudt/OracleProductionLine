/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.tyuleneva.oraclproduction;

/**
 *
 * @author udtyu
 */
public class AudioPlayer extends Product implements MultimediaControl {
    public String audioSpecification;
    public ItemType mediaType;

    // a constructor
    public AudioPlayer(String name, String audioSpecification) {
      // the constructor calls its parents constructor to setup the media type
      super(name);
      this.audioSpecification = audioSpecification;
      this.mediaType = ItemType.AUDIO;
    }

    // the methods from the MultimediaControl interface - print to the console
    @Override
    public void play() {
      System.out.println("Playing");

    }

    @Override
    public void stop() {
      System.out.println("Stopping");

    }

    @Override
    public void previous() {
      System.out.println("Previous");

    }


    @Override
    public void next() {
      System.out.println("Next");

    }

    @Override
    public String toString() {
      return super.toString() + "\n" + "Audio Spec : " + audioSpecification + "\n" +
          "Type : " + mediaType;
    }
}

