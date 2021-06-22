
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * J1.S.P0011_Change base number
 *
 * @author TASS
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Processing Processing = new Processing();
        Validator CheckInput = new Validator();
        Scanner input = new Scanner(System.in);
        boolean isContinue = true;
        do {
            int choice = Processing.menu();
            switch (choice) {
                case 1:
                    String binary = CheckInput.getBinaryString();
                    Processing.convertFromBinary(binary);
                    break;
                case 2:
                    String decimal = CheckInput.getDecimalString();
                    Processing.convertFromDecimal(decimal);
                    break;
                case 3:
                    String hex = CheckInput.getHexString();
                    Processing.convertFromHex(hex);
                    break;
                case 4:
                    isContinue = false;
            }
        } while (isContinue);
    }
}
