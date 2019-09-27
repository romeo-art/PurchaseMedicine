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
public interface Login {
   public void register(Customer newCustomer);
   public void login();
   public void order(Medicine medicine);
   public float calculateTotalAmount();
}
