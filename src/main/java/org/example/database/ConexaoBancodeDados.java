package org.example.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBancodeDados {

    private static final String Url = "jdbc:mysql://localhost:3306/nutriia";
    private static final String User = "root";
    private static final String Senha = "";

    public static void conexao(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection conexao = DriverManager.getConnection(Url, User, Senha);

            System.out.println("Conexão com o banco de dados estabelecida com sucesso");

            //Executar consultas SQL

            //codigo para executar suas consultas SQl aqui ...

            conexao.close();

            System.out.printf("Conexao fechada");
        }catch (ClassNotFoundException e){
            System.err.println("Driver Mysql não econtrado:" + e.getMessage());
        }catch (SQLException e){
            System.err.println("Erro ao conectar ao banco de dados" + e.getMessage());
        }
    }

}
