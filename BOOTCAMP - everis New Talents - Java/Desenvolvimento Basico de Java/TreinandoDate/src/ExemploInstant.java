import java.time.Instant;
import java.util.Date;

public class ExemploInstant {
    public static void main(String[] args) {
        //Class Instant
        Date dataInicio = new Date(1513124807691L);
        System.out.println(dataInicio);

        Instant instant = dataInicio.toInstant();
        System.out.println(instant);
    }
}
