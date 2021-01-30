package dev.felipecisotto.dominio.aluno;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelefoneTest {

    @Test
    void dddInvalidoETelefoneValido(){
        assertThrows(IllegalArgumentException.class,()-> {
            new Telefone(null,"12345678");
        });
        assertThrows(IllegalArgumentException.class,()-> {
            new Telefone("","12345678");
        });
        assertThrows(IllegalArgumentException.class,()-> {
            new Telefone("AA","12345678");
        });
        assertThrows(IllegalArgumentException.class,()-> {
            new Telefone("123","12345678");
        });

    }
    @Test
    void dddValidoETelefoneInvalido(){
        assertThrows(IllegalArgumentException.class,()-> {
            new Telefone("11",null);
        });
        assertThrows(IllegalArgumentException.class,()-> {
            new Telefone("11","");
        });
        assertThrows(IllegalArgumentException.class,()-> {
            new Telefone("11","AAAAAAAA");
        });
        assertThrows(IllegalArgumentException.class,()-> {
            new Telefone("11","1234567");
        });

    }
    @Test
    void dddValidoETelefoneValido(){
        assertDoesNotThrow(()-> {
            new Telefone("11","12345678");
        });
        assertDoesNotThrow(()-> {
            new Telefone("11","123456789");
        });
    }

}