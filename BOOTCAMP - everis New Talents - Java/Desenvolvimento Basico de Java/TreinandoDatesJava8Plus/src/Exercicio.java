import java.time.LocalDateTime;

public class Exercicio {
    public static void main(String[] args) {
        //Definindo um tempo especifico ao localDateTime
        LocalDateTime data = LocalDateTime.of(2010,05,15,10,00,00);
        System.out.println(data);

        //Acrescentando tempos na data.
        LocalDateTime addTempo = data.plusYears(4).plusMonths(6).plusHours(13);
        System.out.println(addTempo);


    }
}
