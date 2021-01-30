package dev.felipecisotto.dominio.aluno;

public class AlunoNaoEncontradoException extends RuntimeException{

    public AlunoNaoEncontradoException(CPF cpf) {
        super("Aluno não encontado com o cpf: "+cpf.getDocumento());
    }
}
