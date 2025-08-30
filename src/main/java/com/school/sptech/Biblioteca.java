package com.school.sptech;

public class Biblioteca {
    private String nome;
    private Double multaDiaria;
    private Integer qtdLivros;
    private Boolean ativa;

    public Biblioteca(String nome, Double multaDiaria){
        this.nome = nome;
        this.multaDiaria = multaDiaria;
        qtdLivros = 0;
        ativa = true;
    }

    void registrarLivro(Integer quantidade){
        if(ativa & qtdLivros > 0){
            qtdLivros++;
        }
    }

    Integer emprestar(Integer quantidade){
        if(ativa & quantidade > 0 & quantidade <= qtdLivros & quantidade != null){
            return quantidade;
        } else{
            return null;
        }
    }

    Integer devolver(Integer quantidade){
        if(ativa & quantidade > 0 & quantidade != null){
            return quantidade;
        } else{
            return null;
        }
    }

    Integer desativar(){
        if(ativa){
            ativa = false;
            Integer qtdLivrosAnterior = qtdLivros;
            qtdLivros = 0;
            return qtdLivrosAnterior;
        }else{
            return null;
        }
    }
}
