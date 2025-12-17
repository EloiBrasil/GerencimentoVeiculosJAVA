import Model.*;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try{
        System.out.println("Diga o nome da garagem: ");
        String nomeGaragem = input.nextLine();

        Garagem garagem = new Garagem(nomeGaragem);

        System.out.println("Quantos veiculos vai cadastrar: ");
        int qtdVeiculos = input.nextInt();

        for(int i=0;i<qtdVeiculos;i++){
            Veiculo v = cadastrarVeiculo(input);
            garagem.AddListaVeiculos(v);

        }
        garagem.listarVeiculos();
        garagem.exibirTaxas();


    }catch(Exception e){
            System.out.println("Erro ao criar o veiculo: " + e.getMessage());}
    }

    private static Veiculo cadastrarVeiculo(Scanner input){
        while(true){
        try{
            System.out.println("Escolha o tipo de veiculo:");
            System.out.println("1- Carro");
            System.out.println("2- Moto");
            input.nextLine();

            Integer opcao = Integer.parseInt(input.nextLine());
            System.out.println("Qual é o modelo: ");
            String modelo = input.nextLine();

            System.out.println("Qual é a emissão do veículo: ");
            Double emissao = input.nextDouble();

            System.out.println("Qual é a potencia do motor: ");
            Double potencia = input.nextDouble();

            if(opcao==1){
                return new Carro(emissao, potencia, modelo);
            }else if(opcao==2) {
                return new Moto(emissao, potencia, modelo);
            }

        }catch(Exception e){
            System.out.println("Erro ao cadastrar os veiculos");
        }

        }
    }


}