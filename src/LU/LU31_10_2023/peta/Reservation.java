package LU.LU31_10_2023.peta;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeParseException;
import java.util.Date;

public class Reservation {
    private String name;
    private Date date;

    public Reservation(String name, String date) {
        try {
            Date date1 = new SimpleDateFormat("dd/MM/yyyy").parse(date);
            this.name = name;
            this.date = date1;
        } catch (ParseException e) {
            System.out.println("Not a valid date!");
        }


    }

}
