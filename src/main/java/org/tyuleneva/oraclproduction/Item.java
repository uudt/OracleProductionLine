/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.tyuleneva.oraclproduction;

/**
 *
 * @author udtyu
 */
import java.util.Date;

public interface Item {
    
    public final String manufacturer = "OracleProduction";
    
    public void setProductionNumber(int prodNum);
    
    public void setName(String name);
    public String getName(); // return a String
    
    public Date getManufactureDate(); // return a Date
    public int getSerialNumber();  // return int
}

