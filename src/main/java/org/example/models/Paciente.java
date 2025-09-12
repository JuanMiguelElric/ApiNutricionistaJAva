package org.example.models;

import org.example.config.GerarUUID;
import org.example.models.endereco.Endereco;
import org.example.models.interfaces.Dados;

public class Paciente  {
    private String id = "";
    private String nome = "";
    private String data_de_nascimento = "";
    private  Endereco endereco;


    public void set_Paciente(String nome, String data_de_nascimento){
        this.id = GerarUUID.gerarUid();
        this.nome = nome;
        this.data_de_nascimento = data_de_nascimento;

    }

    public String getPaciente() {
        return String.format("O nome do paciente é %s, ele nasceu em %s e seu id é %s",
                nome, data_de_nascimento, id);
    }
    public Endereco getEndereco(){
        return endereco;
    }

}
