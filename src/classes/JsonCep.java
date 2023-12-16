package classes;
import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class JsonCep {
    public FileWriter convertJson(Cep cep) {
        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting().create();
        FileWriter jsonFile = null;
        
        try {
            jsonFile = new FileWriter("ceps.json");
            jsonFile.write(gson.toJson(cep));
            jsonFile.close();
        } catch (IOException e){
            e.getMessage();
        }
        
        return jsonFile;
    }

}
