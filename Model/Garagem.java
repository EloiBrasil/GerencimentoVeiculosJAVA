package Model;

import java.util.ArrayList;

public class Garagem {
    String nome;
    ArrayList<Veiculo> listaVeiculos;

    public Garagem(String nome) {
        this.nome = nome;
        this.listaVeiculos = new ArrayList<>();
    }

    public void AddListaVeiculos(Veiculo v) {
        listaVeiculos.add(v);

    }

    public void listarVeiculos(){
        for (Veiculo v : listaVeiculos) {
            System.out.println(v);
        }
    }

    public void exibirTaxas(){
        for (Veiculo v : listaVeiculos) {
            System.out.println(v.obterCategoria());
        }
    }

}
