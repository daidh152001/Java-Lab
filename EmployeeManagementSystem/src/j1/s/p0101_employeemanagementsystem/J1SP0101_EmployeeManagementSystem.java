/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0101_employeemanagementsystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class J1SP0101_EmployeeManagementSystem {

    static Validation val = new Validation();

    public static String addEmployee(ArrayList<Employee> list) {
        String id;
        while(true) {
            id = val.checkInputString("ID: ", "ID");
            if (val.checkID_exist(list, id) == -1) break;
            else System.out.println("ID existed. Please re-enter.");
        }
        String fname = val.checkInputString("First name: ", "name");
        String lname = val.checkInputString("Last name: ", "name");
        String phoneNUM = val.checkInputString("Phone number: ", "phone");
        String email = val.checkInputString("Email: ", "email");
        String address = val.checkInputString("Address: ", "address");
        String DOB = val.checkInputDate("Date of birth: ", "dd/MM/yyyy");
        String sex = val.checkInputString("Sex: ", "sex");
        Double salary = val.checkSalary("Salary: ");
        String agency = val.checkInputString("Agency: ", "agency");
        
        Employee em = new Employee(id, fname, lname, phoneNUM, email, address, DOB, sex, salary, agency);
        list.add(em);
        System.out.println("Add employee Success.");
        return em.getID();
    }
    
    public static String remove(ArrayList<Employee> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty. Cannot remove employee.");
            return null;
        }
        else {
            String deleTaskID;
            
                deleTaskID = val.checkInputString("Enter ID to delete: ", "ID");
                int index = val.checkID_exist(list, deleTaskID);
                if (index != -1) {
                    list.remove(index);
                } else {
                    System.out.println("Not existed. Please re-enter.");
                }
            
            return deleTaskID;
        }
    }
    
    public static void update(ArrayList<Employee> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty. Cannot update.");
        }
        else {
            while (true) {
                String deleTaskID = val.checkInputString("Enter ID to update infor: ", "ID");
                int index = val.checkID_exist(list, deleTaskID);
                if (index != -1) {
                    list.get(index).setFirstName(val.checkInputString("First name: ", "name"));
                    list.get(index).setLastName(val.checkInputString("Last name: ", "name"));
                    list.get(index).setPhoneNum(val.checkInputString("Phone: ", "phone"));
                    list.get(index).setEmail(val.checkInputString("Mail: ", "email"));
                    list.get(index).setAddress(val.checkInputString("Address: ", "address"));
                    list.get(index).setDOB(val.checkInputDate("Date of birth: ", "dd/MM/yyyy"));
                    list.get(index).setSex("Sex (Male/Female/Other): ");
                    list.get(index).setSalary(val.checkSalary("Salary: "));
                    list.get(index).setAgency(val.checkInputString("Agency: ", "agency"));
                    break;
                } else {
                    System.out.println("Not existed. Please re-enter.");
                }
            }
        }
    }

    public static void search(ArrayList<Employee> list) {
        if (list.isEmpty()) {
            System.out.println("List is empty.");
        }
        else {
            int check = 0;
            String name = val.checkInputString("Name: ", "name");
            for (int i = 0; i < list.size();i++) {
                if (list.get(i).getFirstName().equals(name) || list.get(i).getLastName().equals(name)) {
                    System.out.println(list.get(i));
                    check = 1;
                }
            } 
            if (check == 0) System.out.println("Not found.");
        }
    }
    
    public static void sortBySalary(ArrayList<Employee> list) {
        Collections.sort(list, new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    if (o1.getSalary()> o2.getSalary()) {
                        return 1;
                    } else if (o1.getSalary() < o2.getSalary()) {
                        return -1;
                    } 
                    return 0;
                }
            });
    }
    
    public static void disPlayMenu() {
        ArrayList<Employee> list = new ArrayList<>();
        int choice;
        while (true) {
            System.out.println("----------Menu----------");
            System.out.println("1. Add Employee");
            System.out.println("2. Update Employee");
            System.out.println("3. Remove Employee");
            System.out.println("4. Search Employee");
            System.out.println("5. Sort employees by salary");
            System.out.println("6. Exit");
            choice = val.checkInputInt("Enter your choice: ",1, 6);
            switch (choice) {
                case 1:
                    addEmployee(list);
                    display(list);
                    break;
                case 2:
                    update(list);
                    display(list);
                    break;
                case 3:
                    remove(list);
                    display(list);
                    break;
                case 4:
                    search(list);
                    break;
                case 5: 
                    sortBySalary(list);
                    display(list);
                    break;
                case 6:
                    return;
            }
        }
    }
    
    public static void display(ArrayList<Employee> list) {
       for (int i = 0; i < list.size(); i++) {
           System.out.println(list.get(i));
       }
    }
    public static void main(String[] args) {
        disPlayMenu();
    }
    
}
