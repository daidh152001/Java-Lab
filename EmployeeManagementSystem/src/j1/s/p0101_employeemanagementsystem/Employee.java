/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j1.s.p0101_employeemanagementsystem;

import java.util.ArrayList;


public class Employee {
    private String ID;
    private String firstName;
    private String lastName;
    private String phoneNum;
    private String email;
    private String address;
    private String DOB;
    private String sex;
    private Double salary;
    private String agency;

    public Employee(String ID, String firstName, String lastName, String phoneNum, String email, String address, String DOB, String sex, Double salary, String agency) {
        this.ID = ID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNum = phoneNum;
        this.email = email;
        this.address = address;
        this.DOB = DOB;
        this.sex = sex;
        this.salary = salary;
        this.agency = agency;
    }   

    public String getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public String getDOB() {
        return DOB;
    }

    public String getSex() {
        return sex;
    }

    public Double getSalary() {
        return salary;
    }

    public String getAgency() {
        return agency;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    @Override
    public String toString() {
            return ID + "   " + firstName + "   " + lastName + "    " + phoneNum + 
            "    " + email + "   "  + address + "    " + DOB + " " + sex + " " + salary + " " + agency;
    }    
    
}
