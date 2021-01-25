package dev.felipecisotto.aluno;

public class Email {

    private String endereco;

    public Email(String endereco) {
       if( endereco == null || !endereco.matches("[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?")){
            throw new IllegalArgumentException("Email inválido");
       }

        this.endereco = endereco;
    }

}
