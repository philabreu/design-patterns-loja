package org.example.adapter;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Map;

public class JavaHttpClient implements HttpAdapter {

    @Override
    public void post(String url, Map<String, Object> dados) {
        try {
            URL apiUrl = new URL(url);
            URLConnection connection = apiUrl.openConnection();
            connection.connect();
        } catch (IOException e) {
            throw new RuntimeException("ERRO ao enviar requisição!", e);
        }
    }
}