
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author fb.com/truongdung0706
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        // TODO code application logic here

        String sDate = "04-03-2010";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM-yy");
        Date inputDate = simpleDateFormat.parse(sDate);
        String date = new SimpleDateFormat("yy-MM-dd").format(inputDate);

        System.out.println(date);
    }

}
