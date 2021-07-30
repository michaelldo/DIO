import java.text.DateFormat;
import java.util.Date;

public class ExemploDateFormat {
    public static void main(String[] args) {

        Date agora = new Date();

        String dateToStr = DateFormat.getDateInstance().format(agora);
        // 29 de jul. de 2021
        System.out.println(dateToStr);

        dateToStr =  DateFormat.getInstance().format(agora);
        //29/07/2021 07:44
        System.out.println(dateToStr);

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.SHORT).format(agora);
        //29 de julho de 2021 07:37
        System.out.println(dateToStr);

        dateToStr = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG).format(agora);
        //29 de julho de 2021 07:42:45 BRT
        System.out.println(dateToStr);
    }
}
