import java.time.LocalTime;

public class ExemploLocalTimePlusHours {
    public static void main(String[] args) {

        LocalTime agora = LocalTime.now();
        System.out.println(agora);
        //10:36:48.933526

        LocalTime maisUmaHora = agora.plusHours(1);
        System.out.println(maisUmaHora);
        //11:36:48.933526
    }
}
