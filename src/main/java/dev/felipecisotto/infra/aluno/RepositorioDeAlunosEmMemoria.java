package dev.felipecisotto.infra.aluno;

import dev.felipecisotto.dominio.aluno.Aluno;
import dev.felipecisotto.dominio.aluno.AlunoNaoEncontradoException;
import dev.felipecisotto.dominio.aluno.CPF;
import dev.felipecisotto.dominio.aluno.RepositorioDeAlunos;

import java.util.ArrayList;
import java.util.List;

public class RepositorioDeAlunosEmMemoria implements RepositorioDeAlunos {
    private List<Aluno> matriculados = new ArrayList<>();

    @Override
    public void matricular(Aluno aluno) {
        this.matriculados.add(aluno);
    }

    @Override
    public Aluno buscarPorCpf(CPF cpf) {
        return this.matriculados.stream()
                .filter(aluno -> aluno.getCpf().equals(cpf.getDocumento()))
                .findFirst()
                .orElseThrow(() -> new AlunoNaoEncontradoException(cpf));
    }

    @Override
    public List<Aluno> listarAlunosMatriculado() {
        return this.matriculados;
    }
}
