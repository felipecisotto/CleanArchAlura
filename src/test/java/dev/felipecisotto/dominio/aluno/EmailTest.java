package dev.felipecisotto.dominio.aluno;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EmailTest {

    @Test
    void naoDeveriaCriarEmailsComEnderecoInvalidos(){
        assertThrows(IllegalArgumentException.class,() -> {
            new Email(null);
        });
        assertThrows(IllegalArgumentException.class,() -> {
            new Email("");
        });
        assertThrows(IllegalArgumentException.class,() -> {
            new Email("invalido");
        });
    }
    @Test
    void deveriaCriarEmail(){
        assertDoesNotThrow(() ->{
            new Email("felipe@teste.com");
        });
    }
}