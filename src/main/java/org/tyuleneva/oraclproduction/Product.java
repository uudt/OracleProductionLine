/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.tyuleneva.oraclproduction;

/**
 * @author udtyu
 */
import java.util.Date;

public abstract class Product implements Item, Comparable<Product> {
    private int serialNumber;
    private String manufacturer = Item.manufacturer;
    private Date manufacturedOn;
    private String name;
    // stores the next value of serialNumber
    private static int currentProductionNumber = 1;
    
    // a constructor setting name
    // assigning a serial number from the currentProductionNumber and incrementing it
    // manufacturedOn = current date and time;
    public Product(String name) {
        this.name = name;
        serialNumber = currentProductionNumber;
        currentProductionNumber++;
        manufacturedOn = new Date(System.currentTimeMillis());
    }

    // methods of the Item interface
    public void setProductionNumber(int productionNumber) {
        serialNumber = productionNumber;
    }

  //  public String getName();
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Date getManufactureDate() {
        return manufacturedOn;
    }

  //public int getSerialNumber();
    public int getSerialNumber() {
        return serialNumber;
    }

    //  overwritten toString method
    @Override
    public String toString() {
        return
            "\n" +
            "Manufacturer : " + manufacturer + "\n" +
            "Serial Number : " + serialNumber + "\n" +
            "Date : " + manufacturedOn + "\n" +
            "Name : " + name;
    }
    
    // overwritten compareTo method
    @Override
    public int compareTo(Product o) {
      return name.compareTo(o.getName());

    }

}

