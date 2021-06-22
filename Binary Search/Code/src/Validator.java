
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

    static Scanner input = new Scanner(System.in);

    
    /**
     * check input Integer number
     * @param min
     * @param max
     * @return value
     */
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
}
