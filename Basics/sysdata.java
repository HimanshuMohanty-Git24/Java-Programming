
// display the current date time and year of the system
import java.util.Date;
import java.util.Calendar;

class sysdata {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println("Current date and time: " + date.toString());
        Calendar cal = Calendar.getInstance();
        System.out.println("Current year: " + cal.get(Calendar.YEAR));
    }
}