package PooMain;

import poo.model.Cliente;
import poo.model.Endereco;

public class EntregaCartaoApp {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.cep = "0000000";
        //Daddos do Endereço

        Cliente cliente = new Cliente();

        //Dados do cliente
        // if(cliente.enderecos == null){
        //    cliente.enderecos = new ArrayList<Endereco>();
        // }

        cliente.adicionaEndereco(endereco);
        System.out.println("Endereço adicionado com sucesso.");

    }
}
