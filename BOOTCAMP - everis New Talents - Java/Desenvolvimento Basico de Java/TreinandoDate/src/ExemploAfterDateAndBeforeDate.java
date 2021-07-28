import java.util.Date;

public class ExemploAfterDateAndBeforeDate {
    public static void main(String[] args) {
        //outras aplicações usando o Date
        Date datanoPassado = new Date(1513124807691L);

        Date dataNoFuturo = new Date(1613124807691L);

        //Comparando se a data no passaod e posterior a data no futuro
        boolean isAfter = datanoPassado.after(dataNoFuturo);
        System.out.println("Essa informação é: " +isAfter);

        //Comparando se a data no passado é anterior a data futuro
        boolean isBefore = datanoPassado.before(dataNoFuturo);
        System.out.println("Essa informação é: " +isBefore);
    }
}
