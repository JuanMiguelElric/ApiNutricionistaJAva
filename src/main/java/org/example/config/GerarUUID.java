package org.example.config;

import java.util.UUID;

public class GerarUUID {
    //static pertence a classe, não preciso chamar um objeto basta apenas usar a classe
    public static String gerarUid() {
        UUID idUnico = UUID.randomUUID();

        String uuidString = idUnico.toString();

        String uuidSemHifens = uuidString.replace("-", "");

        return uuidSemHifens;
    }



}
