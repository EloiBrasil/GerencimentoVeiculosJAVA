package Model;
import Exception.PotenciaInvalida;


public class Carro extends Veiculo {
    Double taxaBase;
    public Carro(Double emissaoC02, Double potenciaDoMotor, String modelo) {
        super(emissaoC02, potenciaDoMotor, modelo);
        this.taxaBase = 2.0;
    }

    @Override
    public Double calcularTaxaAmbiental() {
        if (potenciaDoMotor < 40) {
            throw new PotenciaInvalida("Potencia muito baixa");
        }
        if(emissaoC02 > 140 ) {
            if (emissaoC02 > 200) {
                taxaBase += 1;
            } else {
                taxaBase += 0.5;
            }
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
