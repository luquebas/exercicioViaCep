package classes;
import record.CepViaCep;

public class Cep {
    private String rua;
    private String bairro;
    private String cidade;
    private String siglaEstado;

    public Cep(CepViaCep cep) {
        this.rua = cep.logradouro();
        this.bairro = cep.bairro();
        this.cidade = cep.localidade();
        this.siglaEstado = cep.uf();
    }

    @Override
    public String toString() {
        return "(Rua: %s, Bairro: %s, Cidade: %s, Sigla do Estado: %s)".formatted(rua, bairro, cidade, siglaEstado);
    }

    
}
