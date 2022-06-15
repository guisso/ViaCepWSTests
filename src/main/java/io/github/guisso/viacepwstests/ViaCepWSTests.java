/* 
 * Material didático destinado ao curso de 
 * Programação Orientada a Objetos
 * do Bacharelado em Ciência da Computação do IFNMG 
 * - Câmpus Montes Claros.
 *
 * O uso deste material é livre e regido pela licença 
 * Creative Commons como Atribuição-NãoComercial
 * -CompartilhaIgual 4.0 Internacional:
 * http://creativecommons.org/licenses/by-nc-sa/4.0/
 */

package io.github.guisso.viacepwstests;

import com.google.gson.Gson;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe ViaCepWSTests
 * 
 * REST API Consumer
 * 
 * @author Luis Guisso &lt;luis dot guisso at ifnmg dot edu dot br&gt;
 * @version 0.1, 15/06/2022
 */
public class ViaCepWSTests {

    public static void main(String[] args) {
        
        // URI padrão
        String uri = "https://viacep.com.br/ws/{cep}/json/";
        
        // Parametrização da URI
        uri = uri.replace("{cep}", "39400201");
        
        try {
            
            // Requisição HTTP parametrizada
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(new URI(uri))
                    .GET()
                    .build();
            
            // Cliente HTTP
            HttpClient client = HttpClient.newHttpClient();
            
            // Resposta JSON
            HttpResponse<String> response = client
                    .send(request, BodyHandlers.ofString());
            
            // Utilitário JSON
            Gson gson = new Gson();
            
            // Conversão da resposta (corpo) para objeto
            Address address = gson
                    .fromJson(response.body(), Address.class);
            
            // Aplicação da resposta
            System.out.println(">> " + address);
            
        } catch (Exception ex) {
            Logger.getLogger(ViaCepWSTests.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
