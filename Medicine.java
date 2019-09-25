/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PurchasingMedicine;

/**
 *
 * @author lenizoro_sd2022
 */
public class Medicine {

    private String IDMedicine;
    private String name;
    private String description;
    private float price;

    public Medicine() {}

    public Medicine(String IDMedicine, String name, String description, float price) {
        this.IDMedicine = IDMedicine;
        this.name = name;
        this.description = description;
        this.price = price;
    }
    
    
    public String getIDMedicine() {
        return IDMedicine;
    }

    public void setIDMedicine(String IDMedicine) {
        this.IDMedicine = IDMedicine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return name;
    }
    
}
