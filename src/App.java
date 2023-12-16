import record.CepViaCep;
import classes.BuscaCep;
import classes.Cep;
import classes.JsonCep;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite um CEP: ");
        String busca = scanner.nextLine();

        BuscaCep buscaCep = new BuscaCep();
        CepViaCep cepApi = buscaCep.consultaCep(busca);
        Cep cep = new Cep(cepApi);

        JsonCep jsonfile = new JsonCep();
        jsonfile.convertJson(cep);
     
    }
}
