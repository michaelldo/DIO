import java.util.Date;

public class ExemploEqualsAndCompareTo {
    public static void main(String[] args) {
        Date dataNoPassado = new Date(1513124807691L);
        Date dataNoFuturo = new Date(1613124807691L);
        Date mesmaDataNoFuturo = new Date(1613124807691L);

        //Comparando se as datas são iguais
        boolean isEquals = dataNoFuturo.equals(mesmaDataNoFuturo);
        System.out.println(isEquals);

        //Comparando uma data com a outra
        int compareCase1 = dataNoPassado.compareTo(dataNoFuturo);
        int compareCase2 = dataNoFuturo.compareTo(dataNoPassado);
        int compareCase3 = dataNoFuturo.compareTo(mesmaDataNoFuturo);
        System.out.println(compareCase1);
        System.out.println(compareCase2);
        System.out.println(compareCase3);
    }
}
