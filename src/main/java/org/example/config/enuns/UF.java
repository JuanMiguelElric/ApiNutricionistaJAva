package org.example.config.enuns;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public enum UF {
    ACRE("AC"),
    ALAGOAS("AL"),
    AMAPA("AP"),
    AMAZONAS("AM"),
    BAHIA("BA"),
    CEARA("CE"),
    DISTRITO_FEDERAL("DF"),
    ESPIRITO_SANTO("ES"),
    GOIAS("GO"),
    MARANHAO("MA"),
    MATO_GROSSO("MT"),
    MATO_GROSSO_DO_SUL("MS"),
    MINAS_GERAIS("MG"),
    PARA("PA"),
    PARAIBA("PB"),
    PARANA("PR"),
    PERNAMBUCO("PE"),
    PIAUI("PI"),
    RIO_DE_JANEIRO("RJ"),
    RIO_GRANDE_DO_NORTE("RN"),
    RIO_GRANDE_DO_SUL("RS"),
    RONDONIA("RO"),
    RORAIMA("RR"),
    SANTA_CATARINA("SC"),
    SAO_PAULO("SP"),
    SERGIPE("SE"),
    TOCANTINS("TO");

    private final String sigla;

    UF(String sigla) {
        this.sigla = sigla;
    }

    public String getSigla() {
        return sigla;
    }

    @Override
    public String toString() {
        return sigla;
    }

    private static final Map<String, UF> BY_SIGLA =
            Stream.of(values()).collect(Collectors.toMap(UF::getSigla, e -> e));

    public static UF fromSigla(String sigla) {
        if (sigla == null) return null;
        return BY_SIGLA.get(sigla.toUpperCase());
    }
}