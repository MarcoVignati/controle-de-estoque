package com.vignati.controle_de_estoque.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @NotBlank
    private String nome;

    @NotNull
    private int quantidadeEstoque;

    @NotNull
    private double preco;

    public Produto() {

    }

    public Produto(String nome, int quantidadeEstoque, double preco) {
        this.nome = nome;
        this.quantidadeEstoque = quantidadeEstoque;
        this.preco = preco;
    }

    public int getId() {

        return id;
    }

    public String getNome() {

        return nome;
    }

    public int getQuantidadeEstoque() {

        return quantidadeEstoque;
    }

    public double getPreco() {

        return preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
