package PooMain;

import poo.model.Cliente;
import poo.model.Endereco;
import java.util.ArrayList;

public class EntregaCartaoApp {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        //Daddos do Endereço


        Cliente cliente = new Cliente();
        //Dados do cliente
        if(cliente.enderecos == null){
           cliente.enderecos = new ArrayList<Endereco>();
        }

        cliente.enderecos.add(endereco);
        System.out.println("Endereço encerrado com sucesso.");

    }
}
