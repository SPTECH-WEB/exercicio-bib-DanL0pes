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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getMultaDiaria() {
        return multaDiaria;
    }

    public Integer getQtdLivros() {
        return qtdLivros;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    void registrarLivro(Integer quantidade){
        if(ativa && quantidade != null && quantidade > 0){
            qtdLivros += quantidade;
        }
    }

    Integer emprestar(Integer quantidade){
        if(ativa && quantidade != null && quantidade > 0 && quantidade <= qtdLivros){
            this.qtdLivros -= quantidade;
            return quantidade;
        } else{
            return null;
        }
    }

    Integer devolver(Integer quantidade){
        if(ativa && quantidade != null && quantidade > 0){
            this.qtdLivros += quantidade;
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

    void transferir(Biblioteca destino, Integer quantidade){
        if(this.ativa && destino.getAtiva() && quantidade <= this.qtdLivros){
            destino.registrarLivro(quantidade);
            this.qtdLivros -= quantidade;
        }
    }

    Boolean reajustarMulta(Double percentual){
        if(percentual != null && percentual > 0){
            multaDiaria = multaDiaria + (multaDiaria * percentual) ;
            return true;
        } else{
            return false;
        }
    }
}
