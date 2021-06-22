/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0101_employeemanagementsystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Validation {
    public final Scanner sc = new Scanner(System.in);
    public final String PHONE_VALID = "^[0-9]{10}$";
    public final String EMAIL_VALID = "^[A-Z]|[a-z]\\w+@\\w+(\\.\\w+){1,3}$";
    public final String NAME_VALID = "^[A-Z][a-z]+$";
    public final String SEX_VALID = "^Male|Female|Other$";
    
    public int checkInputInt(String mess, int MIN, int MAX) {
        int num;
        do{
            System.out.print(mess);
            try {
                num = Integer.parseInt(sc.next());
                if (num >= MIN && num <= MAX) return num;
                else System.out.println("Out of range. Please enter a number in " + MIN +"-" +MAX);
            } catch (NumberFormatException e) {
                System.out.println("Invalid number. Please re-enter.");
            }
        }while (true);
    }
    
    public Double checkSalary(String mess) {
        while(true) {
            System.out.print(mess);
            try {
                Double num = Double.parseDouble(sc.next());
                if (num > 0) return num;
                System.out.println("Salary must be more than 0. Please re-iput");
            } catch (NumberFormatException e) {
                System.out.println("Invalid salary. Please re-enter.");
            }
        }
    }
    
    public String checkInputDate(String mess, String Format) {
        SimpleDateFormat SDF = new SimpleDateFormat(Format);
        SDF.setLenient(false);
        String result;
        Date date;
        do {
            System.out.print("Date: ");
            try {
                result = sc.next();
                date = SDF.parse(result);
                return result;
            } catch (ParseException e) {
                System.err.println("Re-input");
            }
        }while (true);
    }

    public String checkInputString(String mess, String var) {
        while (true) {
            System.out.print(mess);
            String result = sc.next().trim();
            switch (var){
                case "name":
                    if (!result.matches(NAME_VALID)) {
                        System.err.print("Invalid name. Please re-enter");
                    } else return result;
                    break;
                    
                case "email":
                    if (!result.matches(EMAIL_VALID)) {
                        System.err.println("Email must be correct format. Re-enter: ");
                    } else return result;
                    break;
                   
                case "phone":
                    if (!result.matches(PHONE_VALID)) {
                        System.out.println("Invalid phone number. Re-enter: ");
                    } else return result;
                    break;
                
                case "sex":
                    if (!result.matches(SEX_VALID)) {
                        System.out.println("Sex must be \"Male\", \"Female\" or \"Other\". Re-enter");
                    } else return result;
                    break;
                 
                default: 
                    if (result.length() == 0) System.out.println("Empty. Please re-enter");
                    else return result;
                    break;
            }
        }   
    }    
  
    public int checkID_exist(ArrayList<Employee> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            if (id.equals(list.get(i).getID())) return i;
        }
        return -1;
    }
}

