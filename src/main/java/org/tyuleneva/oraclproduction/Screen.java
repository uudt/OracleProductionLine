/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.tyuleneva.oraclproduction;

/**
 *
 * @author udtyu
 */
public class Screen implements ScreenSpec {
    int responseTime;
    int refreshRate;
    String resolution;


    Screen(String resolution, int refreshRate, int responseTime) {
      this.resolution = resolution;
      this.refreshRate = refreshRate;
      this.responseTime = responseTime;
    }

    // Complete the methods from the ScreenSpec interface.
    @Override
    public int getRefreshRate() {
      return refreshRate;
    }

    @Override
    public int getResponseTime() {
      return responseTime;
    }

    @Override
    public String getResolution() {
      return resolution;
    }

    //    Add a toString method that will
    //    return the details of the 3 field in the same format as the Product Class.
    public String toString() {
      return "Resolution : " + getResolution() + "\n" +
          "Refresh rate : " + getRefreshRate() + "\n" +
          "Response time : " + getResponseTime();

    }
}
