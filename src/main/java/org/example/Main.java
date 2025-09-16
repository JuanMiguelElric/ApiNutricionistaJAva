package org.example;

import com.sun.net.httpserver.HttpServer;
import org.example.controllers.Paciente.PacienteController;
import org.example.database.ConexaoBancodeDados;

import java.net.InetSocketAddress;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        HttpServer server = HttpServer.create(new InetSocketAddress(8080),0);


        server.start();

         ConexaoBancodeDados.conexao();




    }
}