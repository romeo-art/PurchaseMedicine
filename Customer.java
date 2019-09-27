/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PurchasingMedicine;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author lenizoro_sd2022
 */
public class Customer extends Person implements Login {
    private String password;
    
    Pharmacy three = new Pharmacy();
    ArrayList<Customer> mgaCustomer = new ArrayList<>();

    public Customer() {
    }

    public Customer(String id, String name, String address, String email, String password) {
        super(id, name, address, email);
    }
    
    public Customer(String id, String name, String address, String email) {
        super(id, name, address, email);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    @Override
    public void register(Customer newCustomer) {
        System.out.println("FILL IN THE FOLLOWING INPUT TO REGISTER");
        Scanner newCustom = new Scanner(System.in);
        System.out.print("ID: ");
        String newID = newCustom.next();
        System.out.print("Name: ");
        String newName = newCustom.next();
        System.out.print("Address: ");
        String newAdd = newCustom.next();
        System.out.print("Email: ");
        String newMail = newCustom.next();
        System.out.println("Password: ");
        String newPass = newCustom.next();
        
        newCustomer.setID(newID);
        newCustomer.setName(newName);
        newCustomer.setAddress(newAdd);
        newCustomer.setEmail(newMail);
        newCustomer.setPassword(newPass);
        
        mgaCustomer.add(newCustomer);
        
        System.out.println("\nSUCCESSFULLY REGISTERED");
        System.out.println(mgaCustomer);
    }

    @Override
    public void login() {

        Scanner input = new Scanner(System.in);
        Pharmacy Rose = new Pharmacy();
        Rose.addMedicine();
        ArrayList<Medicine> medicines = Rose.getMedicineList();
        System.out.println("");

        System.out.println("LOGIN");
        while (true) {
            System.out.print("ID: ");
            String inputID = input.next();
            System.out.print("Password: ");
            String inputPassword = input.next();
            System.out.println("");

            for (Customer customer : mgaCustomer) {

                String id = customer.getID();
                String password = customer.getPassword();
                
                if (inputID.equals(id)) {
                    System.out.println("=====Successfully Login!!!!!!=====");

                    float amount = 0;
                    int medicineCount = 0;

                    ArrayList<String> ordersMedicineName = new ArrayList<>();

                    while (true) {
                        System.out.println("Choose Transaction!!!\n\t1 to add order\n\t2 to delete order\n\t3 to finish order");
                        String medicineToDelete = input.next();
                        if (medicineToDelete.equals("1")) {
                            System.out.println("Medicine name you want to add in your order!");
                            String medAdd = input.next();
                            System.out.println("Quantity: ");
                            int quantityAdd = input.nextInt();

                            for (Medicine meds : medicines) {
                                if (medAdd.equalsIgnoreCase(meds.getName())) {
                                    if (quantityAdd > 0) {
                                        for (int i = 0; i < quantityAdd; i++) {
                                            ordersMedicineName.add(meds.getName());
                                            amount += meds.getPrice();
                                        }
                                    }

                                }

                            }
                            System.out.println("Total amount: ₱ " + amount);
                        } else if (medicineToDelete.equals("2")) {
                            System.out.println("Medicine name you want to delete!");
                            String medDel = input.next();
                            System.out.println("Quantity: ");
                            int quantityDelete = input.nextInt();

                            for (String medName : ordersMedicineName) {
                                if (medName.equalsIgnoreCase(medDel)) {
                                    medicineCount++;
                                }
                            }

                            System.out.println(medicineCount);
                            for (Medicine meds : medicines) {
                                if (medDel.equalsIgnoreCase(meds.getName())) {
                                    if (quantityDelete <= medicineCount) {
                                        for (int i = 0; i < quantityDelete; i++) {
//                                        System.out.println(ordersMedicineName);
                                            ordersMedicineName.remove(meds.getName());
                                            amount -= meds.getPrice();
                                            medicineCount--;
//                                        System.out.println(ordersMedicineName);
                                        }
                                    }
                                }

                            }
                            System.out.println(medicineCount);
                            System.out.println(ordersMedicineName);
                            System.out.println("\nTotal amount: ₱ " + amount + "\n");
                        } else if (medicineToDelete.equals("3")) {
                            System.out.println("=========Your Orders=========");
                            for (String medOrder : ordersMedicineName) {
                                System.out.println(medOrder);
                            }
                            System.out.println("\nTotal amount: ₱ " + amount + "\n");
                            System.out.println("Thank you for purchasing our products!!!");
                            break;
                        }

                    }
                }
            }

        }
    }

    public void order(Medicine medicine) {

    }

    @Override
    public String toString() {
        return super.toString()+", password= " + password;
    }

    
    @Override
    public float calculateTotalAmount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
