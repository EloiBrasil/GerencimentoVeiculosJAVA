package Model;

import Interface.Tributavel;
import Exception.EmissaoInvalida;
import Exception.PotenciaInvalida;

public class Moto extends Veiculo{
    Double taxaBase;
    public Moto(Double emissaoC02, Double potenciaDoMotor, String modelo) {
        super(emissaoC02, potenciaDoMotor, modelo);
        this.taxaBase = 1.0;
    }

    @Override
    public Double calcularTaxaAmbiental() {
        if(potenciaDoMotor < 10){
            throw new PotenciaInvalida("Potencia muito baixa");
        }
        if(emissaoC02 > 100){
            taxaBase += 0.3;
        }
        return (taxaBase/100)*potenciaDoMotor;
    }

    @Override
    public String obterCategoria() {
        return "O modelo é: "+modelo+" taxa ambiental é de: " + calcularTaxaAmbiental();
    }

    @Override
    public void exibirResumo() {
        super.exibirResumo();
    }
}
