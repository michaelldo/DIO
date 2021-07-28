import java.util.Date;

public class ExemploCurrentTimeMilles {
    public static void main(String[] args) {
        //Retorna os milissegundo mais próximo que foi executado, usa o como base o S.O
        long currentTimeMillis = System.currentTimeMillis();

        System.out.println(currentTimeMillis);

        Date novaData = new Date(currentTimeMillis);

        System.out.println(novaData);
    }
}
