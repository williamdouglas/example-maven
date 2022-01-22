package br.com.example.servicos;

import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.DefaultHttpClient;

public class ResultadoCEP {

    /** URL */
    private static final String URL = "https://viacep.com.br/ws/30855-184/json/";

    /**
     * Método que se conecta ao site do CEP
     * 
     * @return Strings
     */
    public static String obtemCEP() {
        // Criação do cliente HTTP que fará a conexão com o site
        HttpClient httpclient = new DefaultHttpClient();
        try {
            // Definição da URL a ser utilizada
            HttpGet httpget = new HttpGet(URL);
            // Manipulador da resposta da conexão com a URL
            ResponseHandler<String> responseHandler = new BasicResponseHandler();
            // Resposta propriamente dita
            return httpclient.execute(httpget, responseHandler);
        } catch (Exception e) {
            // Caso haja erro, dispara exceção.
            throw new RuntimeException("Um erro inesperado ocorreu.", e);
        } finally {
            // Destruição do cliente para liberação dos recursos do sistema.
            httpclient.getConnectionManager().shutdown();
        }
    }
}