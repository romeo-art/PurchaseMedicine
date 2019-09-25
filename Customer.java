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
public class Customer extends Person implements Login{

    public Customer() {
    }

    public Customer(String name, String address, String email) {
        super(name, address, email);
    }
    
    
    @Override
    public void login() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void order(Medicine medicine){
        
    }

    @Override
    public float calculateTotalAmount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
