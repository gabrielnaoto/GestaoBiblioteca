/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Date;

/**
 *
 * @author ignoi
 */
public class Emprestimo {

    private int id;
    private String cpf;
    private String livro;
    private Date devolucao;

    public Emprestimo() {
    }

    public Emprestimo(int id, String cpf, String livro, Date devolucao) {
        this.id = id;
        this.cpf = cpf;
        this.livro = livro;
        this.devolucao = devolucao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getLivro() {
        return livro;
    }

    public void setLivro(String livro) {
        this.livro = livro;
    }

    public Date getDevolucao() {
        return devolucao;
    }

    public void setDevolucao(Date devolucao) {
        this.devolucao = devolucao;
    }

}
