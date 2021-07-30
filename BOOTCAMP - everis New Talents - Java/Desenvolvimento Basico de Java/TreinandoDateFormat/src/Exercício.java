import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercício {
    public static void main(String[] args) {
        Date agora = new Date();
        //Formatando a hora no estilo 29/07/2021 as 08:53:053
        SimpleDateFormat  formatador = new SimpleDateFormat("dd/MM/yyy 'as' HH:mm:sss");
        String data = formatador.format(agora);
        System.out.println(data);

        //Formatando a hora e data no estilo qui. 29/07/2021 as 8:59 AM, Horário Padrão de Brasília
        SimpleDateFormat formatador2 =  new SimpleDateFormat("EEE dd/MM/yyyy 'as' h:mm a, zzzz");
        String data2 = formatador2.format(agora);
        System.out.println(data2);
    }
}
