package org.example;

import com.sun.net.httpserver.HttpServer;
import org.example.database.ConexaoBancodeDados;

import java.io.IOException;
import java.net.InetSocketAddress;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        String response = "olá nutriia";
        HttpServer server = HttpServer.create(new InetSocketAddress(8080),0);
        server.createContext("/",(exchange ->{
            //dentro da função primeiro é deifinido o tipo de conteúdo da respost usando o metodo set() do objeto getResponseHEader
            exchange.getResponseHeaders().set("Content-Type", "text/plain");

            exchange.sendResponseHeaders(200, response.getBytes().length);
            exchange.getResponseBody().write(response.getBytes());
            exchange.close();
        } ));

        server.start();



         ConexaoBancodeDados.conexao();




    }
}