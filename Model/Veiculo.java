package Model;

import Interface.Tributavel;
import Exception.EmissaoInvalida;
import Exception.PotenciaInvalida;


public abstract class Veiculo implements Tributavel{
    String modelo;
    Double potenciaDoMotor;
    Double emissaoC02;

    public Veiculo(Double emissaoC02, Double potenciaDoMotor, String modelo) {
        if(emissaoC02 < 0){
            throw new EmissaoInvalida("Digite uma emissão válida");
        }
        if(potenciaDoMotor < 0){
            throw new PotenciaInvalida("Digite uma potencia válida");
        }
        if(modelo == null){
            throw new RuntimeException("Modelo nulo");
        }

        this.emissaoC02 = emissaoC02;
        this.potenciaDoMotor = potenciaDoMotor;
        this.modelo = modelo;
    }

    public void exibirResumo(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Potencia do motor: " + potenciaDoMotor);
        System.out.println("Emissão de C02: "+emissaoC02);
    }


    public abstract String obterCategoria();


    @Override
    public Double calcularTaxaAmbiental() {
        return 0.0;
    }

    @Override
    public String toString() {
        return "Veiculo{" +
                "modelo='" + modelo + '\'' +
                ", potenciaDoMotor=" + potenciaDoMotor +
                ", emissaoC02=" + emissaoC02 +
                '}';
    }
}
