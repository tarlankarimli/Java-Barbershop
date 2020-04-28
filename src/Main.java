import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        Barber barber = new Barber("Tarlan", "Karimli", "terlankerimli@gmail.com", "29.06.1994", 4555796, 25);
        barber.barberReview(4);
        barber.barberReview(5);
        barber.barberReview(3);
        barber.barberReview(5);

        barber.addServiceList("Beard", 15);
        barber.addServiceList("Wash Hair", 5);

        System.out.println(barber);
    }
}
