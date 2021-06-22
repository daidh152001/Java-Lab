
import java.math.BigInteger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TASS
 */
public class Processing {

    Validator CheckInput = new Validator();

    //Display Menu
    public int menu() {
        System.out.println("==== Base Converter ====");
        System.out.println("Convert From: ");
        System.out.println("1. Binary.");
        System.out.println("2. Decimal.");
        System.out.println("3. Hexadecimal.");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = CheckInput.getInt(1, 4);
        return choice;
    }

    //Display sub-Menu after enter convert From:
    public int displayConvert(String from, String toCase1, String toCase2) {
        System.out.println("Convert from " + from + " to: ");
        System.out.println("1. " + toCase1 + ".");
        System.out.println("2. " + toCase2 + ".");
        System.out.print("Enter your choice: ");
        int choice = CheckInput.getInt(1, 2);
        return choice;
    }

    //Convert from Binary and display output
    public void convertFromBinary(String binary) {
        int choice = displayConvert("Binary", "Decimal", "Hexadecimal");
        switch (choice) {
            case 1:
                BigInteger decimal = new BigInteger(binary, 2);
                System.out.println("Decimal: " + decimal);
                break;
            case 2:
                String hex = binaryToHexString(binary);
                System.out.println("Hexadecimal: " + hex);
                break;
        }
    }

    //Convert from Decimal and display output
    public void convertFromDecimal(String dec) {
        int choice = displayConvert("Decimal", "Binary", "Hexadecimal");
        BigInteger decimal = new BigInteger(dec);
        switch (choice) {
            case 1:
                String binary = decimal.toString(2);
                System.out.println("Binary: " + binary);
                break;
            case 2:
                String hex = decimal.toString(16);
                System.out.println("Hexadecimal: " + hex);
                break;
        }
    }

    //Convert from Hexadecimal and display output
    public void convertFromHex(String hex) {
        int choice = displayConvert("Hexadecimal", "Binary", "Decimal");
        switch (choice) {
            case 1:
                String binary = hexToBinaryString(hex);
                System.out.println("Binary: " + binary);
                break;
            case 2:
                BigInteger decimal = new BigInteger(hex, 16);
                System.out.println("Decimal: " + decimal);
                break;
        }
    }

    //Base converter : from Base2 <==> Base 16
    public String binaryToHexString(String binary) {
        BigInteger decimal = new BigInteger(binary, 2);
        String hex = decimal.toString(16);
        return hex;
    }

    public String hexToBinaryString(String hex) {
        BigInteger decimal = new BigInteger(hex, 16);
        String binary = decimal.toString(2);
        return binary;
    }

}
