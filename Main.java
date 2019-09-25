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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Pharmacy Rose = new Pharmacy();
        Rose.addMedicine();
        ArrayList<Medicine> medicines = Rose.getMedicineList();
        System.out.println("");
        Scanner a = new Scanner(System.in);
        System.out.println("LOGIN");
        while (true) {
            System.out.print("ID: ");
            String inputID = a.next();
            System.out.print("Password: ");
            String inputPassword = a.next();
            System.out.println("");
            if ("1234go".equals(inputPassword)) {
                System.out.println("=====Successfully Login!!!!!!=====");

                float amount = 0;
                ArrayList<String> listOrder = new ArrayList<>();
                ArrayList<String> ordersMedicineName = new ArrayList<>();

                while (true) {
                    System.out.println("Choose Transaction!!!\n\t1 to add order\n\t2 to delete order\n\t3 to finish order");
                    String medicineToDelete = a.next();
                    if (medicineToDelete.equals("2")) {
                        System.out.println("Medicine name you want to delete!");
                        String medDel = a.next();
                        System.out.println("Quantity: ");
                        int quantityDelete = a.nextInt();

                        int medicineCount = 0;
                        for (String medName : listOrder) {
                            if (medName.equalsIgnoreCase(medDel)) {
                                medicineCount++;
                            }
                        }
                        System.out.println(medicineCount);
                        for (Medicine meds : medicines) {
                            if (medDel.equalsIgnoreCase(meds.getName())) {
                                if (quantityDelete <= medicineCount) {
                                    for (int i = 0; i < quantityDelete; i++) {
                                        ordersMedicineName.remove(meds.getName());
                                        amount -= meds.getPrice();
                                    }
                                }

                            }
                        }
                    } else if (medicineToDelete.equals("1")) {
                        System.out.println("Medicine name you want to add in your order!");
                        String medAdd = a.next();
                        System.out.println("Quantity: ");
                        int quantityAdd = a.nextInt();

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
                        System.out.println("Total amount: " + amount);

                    } else if (medicineToDelete.equals("3")) {
                        System.out.println("Thank you for purchasing our products!!!");
                        break;
                    }

                }
                break;
            }
        }

    }
}

