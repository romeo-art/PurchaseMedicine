/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PurchasingMedicine;

import java.util.ArrayList;

/**
 *
 * @author lenizoro_sd2022
 */
public class Pharmacy {

    private ArrayList<Customer> customers = new ArrayList<>();
    private ArrayList<Medicine> medicineList = new ArrayList<>();
    private String id;
    private String name;
    private String email;
    private String address;

    public Pharmacy() {
    }

    public Pharmacy(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    public ArrayList<Medicine> getMedicineList() {
        return medicineList;
    }

//    public void setMedicineList(ArrayList<Medicine> medicineList) {
//        this.medicineList = medicineList;
//    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void addMedicine() {
        Medicine a = new Headache("1234", "Biogesic", "Paracetamol boigesic", 5);
        Medicine b = new Headache("1235", "Rexidol", "Paracetamol rexidol", 5);
        Medicine c = new Headache("1236", "Bioflu", "Paracetamol bioflu", 5);
        Medicine d = new Allergy("1237", "Cetirizin", "Paracetamol cetirizin", 5);
        Medicine e = new Allergy("1238", "Loratadine", "Paracetamol loratadine", 5);
        Medicine f = new Allergy("1239", "Brompheniramine", "Paracetamol brompheniramine", 5);
        Medicine g = new BodyPain("12310", "Aspirin", "Paracetamol aspirin", 5);
        Medicine h = new BodyPain("12311", "Acetamenophen", "Paracetamol acetamenophen", 5);
        Medicine i = new BodyPain("12312", "Alaxan", "Paracetamol alaxan", 5);
        Medicine j = new Cough("12313", "Solmux", "Paracetamol solmux", 5);
        Medicine k = new Cough("12314", "Lagundi", "Paracetamol lagundi", 5);
        Medicine l = new Cough("12315", "Robitussin", "Paracetamol robitussin", 5);

        //String IDMedicine, String name, 
        // String description, float price
        this.medicineList.add(a);
        this.medicineList.add(b);
        this.medicineList.add(c);
        this.medicineList.add(d);
        this.medicineList.add(e);
        this.medicineList.add(f);
        this.medicineList.add(g);
        this.medicineList.add(h);
        this.medicineList.add(i);
        this.medicineList.add(j);
        this.medicineList.add(k);
        this.medicineList.add(l);

    }

    public String getEmail() {
        return email;
    }

//    public ArrayList<Medicine> add() {
//        Headache l = new Headache("12315", "Robitussin", "Paracetamol robitussin", (float) 5.0);
//        this.medicineList.add(l);
//        return this.medicineList;
//    }
    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }
    
    public void addCustomer(Customer cus){
        this.customers.add(cus);
    }
    
    public void register(Customer newCustomer){
        
    }

}
