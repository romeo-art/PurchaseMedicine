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
public class Headache extends Medicine{
   
    public Headache(){}
    
    public Headache(String IDMedicine, String name, String description, float price) {
        super(IDMedicine, name, description, price);
    }
    
    public String toString(){
        return super.toString();
    }
}
