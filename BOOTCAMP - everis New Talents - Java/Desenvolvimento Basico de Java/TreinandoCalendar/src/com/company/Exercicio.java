/*
 *@Author: Michalldo
 */

import java.util.Calendar;

public class Exercicio {
    public static void main(String[] args) {

        Calendar vencimento = Calendar.getInstance();

        //Recebendo como paramentro o dia do computador.
        System.out.printf("O vencimento da fatura é: %tD\n", vencimento.getTime());

        //Acrescenta 10 dias conforme enunciado.
        vencimento.add(Calendar.DATE, 10);

        //Condição para verificar se cai no Sábado ou no Domingo.
        if(vencimento.get(Calendar.DAY_OF_WEEK) == Calendar.SATURDAY){
            // Adiciona + 2 dias dos 10 já adicionado
            vencimento.add(Calendar.DATE, 2);
            System.out.printf( "O Cliente terá até a data %tc para pagar sem juros", vencimento.getTime());

        }else if(vencimento.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY){
            // Adiciona + 1 dia dos 10 já adicionado
            vencimento.add(Calendar.DATE, 1);
            System.out.printf( "O Cliente terá até a data %tc para pagar sem juros", vencimento.getTime());
        }else{
            // Caso não caia no final de samana, não será acrescentado nenhum dia e manterá a data padrão.
            System.out.printf( "O Cliente terá até a data %tc para pagar sem juros", vencimento.getTime());
        }


    }
}
