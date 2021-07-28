import java.util.Date;

public class Exercício {
    public static void main(String[] args) {
        //Converttendo minha data de nascimento para date 1992/06/24
        Date myDate = new Date(709354800000L);
        //Convertendo a data para comparação 2010/05/15
        Date compara = new Date(1273892400000L);
        // é necessário colocar o L no final do numero para não identificar erro

        //Comparando as datas
        int resultado = myDate.compareTo(compara);

        if (resultado == -1){
            System.out.println(resultado + " A data: " + myDate + " é anterior a: "+ compara);
        }else{
            System.out.println(resultado + " A data: " + myDate + " é posterior a: "+ compara);
        }

    }
}
