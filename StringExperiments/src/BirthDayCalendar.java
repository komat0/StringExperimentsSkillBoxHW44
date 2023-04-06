import java.text.DateFormatSymbols;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Year;
import java.util.Calendar;
import java.util.Date;

public class BirthDayCalendar {

    public static void birthDay() {
        LocalDate birthday = LocalDate.of(1986, 5, 31);

        for (int i = birthday.getYear(); i <= Year.now().getValue(); i++) {
            LocalDate birthday2 = LocalDate.of(i, 5, 31);
            DayOfWeek dayOfWeek = birthday2.getDayOfWeek();
            System.out.println("День недели моего дня рождения в " + i + ": " + dayOfWeek);
        }
    }
}
