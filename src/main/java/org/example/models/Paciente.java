package org.example.models;

import org.example.config.GerarUUID;
import org.example.models.interfaces.Dados;

public class Paciente implements Dados {
    private String id = "";
    private String nome = "";
    private String data_de_nascimento = "";

    public void set_Paciente(String nome, String data_de_nascimento){
        this.id = GerarUUID.gerarUid();
        this.nome = nome;
        this.data_de_nascimento = data_de_nascimento;

    }

    public String getPaciente() {
        return String.format("O nome do paciente é %s, ele nasceu em %s e seu id é %s",
                nome, data_de_nascimento, id);
    }

    @Override
    public void telefone (){
        System.out.printf("telefone");
    }

    public void setId() {
        this.id = GerarUUID.gerarUid();
    }

    public  String getId()
    {
        return id;
    }
    public void setNome(String nome){
        this.nome = nome;

    }
    public String getNome(){
        return nome;
    }

    @Override
    public void endereco() {

    }
}
