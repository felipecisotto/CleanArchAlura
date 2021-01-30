package dev.felipecisotto.aplicacao;

import dev.felipecisotto.dominio.aluno.Aluno;

public interface EnviarEmailIndicacao {

    void enviarPara(Aluno indicado);

}
