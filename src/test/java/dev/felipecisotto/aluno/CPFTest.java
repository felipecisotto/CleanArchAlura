package dev.felipecisotto.aluno;

import dev.felipecisotto.aluno.CPF;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CPFTest {

    @Test
    void CPFInvalido(){
        assertThrows(IllegalArgumentException.class,() -> {
           new CPF(null);
        });
        assertThrows(IllegalArgumentException.class,() -> {
            new CPF("");
        });
        assertThrows(IllegalArgumentException.class,() -> {
            new CPF("111.111.111-11");
        });

    }
    @Test
    void CPFValido(){
        assertDoesNotThrow(() ->{
            new CPF("82494427096");
        });
        assertDoesNotThrow(() ->{
            new CPF("824.944.270-96");
        });
    }

}