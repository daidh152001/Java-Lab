
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author TASS
 */
public class Validator {

    Scanner input = new Scanner(System.in);
    private final String BINARY_VALID = "[0-1]*";
    private final String DECIMAL_VALID = "[0-9]*";
    private final String HEXADECIMAL_VALID = "[0-9a-fA-F]*";

    //check input Integer number
    public int getInt(int min, int max) {
        while (true) {
            try {
                int value = Integer.parseInt(input.nextLine().trim());
                if (value < min || value > max) {
                    throw new NumberFormatException();
                }
                return value;
            } catch (NumberFormatException e) {
                System.err.println("Invalid value !");
                System.out.print("Enter again: ");
            }
        }
    }

    //Check input BINARY Number
    public String getBinaryString() {
        System.out.print("Enter Binary number: ");
        while (true) {
            String binary = input.nextLine().trim();
            if (binary.matches(BINARY_VALID)) {
                return binary;
            }
            System.err.println("Invalid value !");
            System.out.print("Enter again: ");
        }
    }

    //Check input HEXADECIMAL Number
    public String getHexString() {
        System.out.print("Enter Hexadecimal number: ");
        while (true) {
            String hex = input.nextLine().trim();
            if (hex.matches(HEXADECIMAL_VALID)) {
                return hex;
            }
            System.err.println("Invalid value !");
            System.out.print("Enter again: ");
        }
    }

    //Check input DECIMAL Number
    public String getDecimalString() {
        System.out.print("Enter Decimal number: ");
        while (true) {
            String decimal = input.nextLine().trim();
            if (decimal.matches(DECIMAL_VALID)) {
                return decimal;
            }
            System.err.println("Invalid value !");
            System.out.print("Enter again: ");
        }
    }
}
