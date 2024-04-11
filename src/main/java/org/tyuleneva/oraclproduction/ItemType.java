/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package org.tyuleneva.oraclproduction;

/**
 *
 * @author udtyu
 */
public enum ItemType {
    AUDIO("AU"),
    VISUAL("VI"),
    AUDIO_MOBILE("AM"),
    VISUAL_MOBILE("VM");
    
    public String code;

    ItemType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}

