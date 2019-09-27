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
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("REGISTER OF LOGIN? Y/N");
            String logReg = input.next();

            Customer a = new Customer();
            Customer b = new Customer();

            if (logReg.equalsIgnoreCase("y")) {
                a.register(b);
            } else {
                a.login();
            }

        }
    }
}