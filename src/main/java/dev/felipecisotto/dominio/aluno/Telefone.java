package dev.felipecisotto.dominio.aluno;

import java.util.regex.Pattern;

public class Telefone {
    private String ddd;
    private String numero;

    public String getDdd() {
        return ddd;
    }

    public String getNumero() {
        return numero;
    }

    public Telefone(String ddd, String numero) {
        if(ddd == null || !Pattern.matches("[0-9]+",ddd)||ddd.length() != 2){
            throw new IllegalArgumentException("DDD invalido");
        }
        if(numero == null || !Pattern.matches("[0-9]+",numero)||!(numero.length() == 8 || numero.length() == 9)){
            throw new IllegalArgumentException("Numero invalido");
        }
        this.ddd = ddd;
        this.numero = numero;

    }
}
