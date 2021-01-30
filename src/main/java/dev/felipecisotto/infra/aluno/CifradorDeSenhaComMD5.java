package dev.felipecisotto.infra.aluno;

import dev.felipecisotto.dominio.aluno.CifradorDeSenha;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class CifradorDeSenhaComMD5 implements CifradorDeSenha {


    @Override
    public String cifrarSenha(String senha) {
        MessageDigest m= null;
        try {
            m = MessageDigest.getInstance("MD5");
            m.update(senha.getBytes(),0,senha.length());
            System.out.println("MD5: "+new BigInteger(1,m.digest()).toString(16));

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public boolean validarSenhaCifrada(String senhaCifrada, String senhaAberta) {
        return senhaCifrada.equals(cifrarSenha(senhaAberta));
    }
}
