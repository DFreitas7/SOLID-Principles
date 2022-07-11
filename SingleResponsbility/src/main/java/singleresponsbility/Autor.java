package singleresponsbility;

import java.util.Objects;

public class Autor {
    private final String nome;

    public Autor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return this.getNome();
    }
    
    
}
