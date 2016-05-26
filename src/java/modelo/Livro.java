/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author ignoi
 */
public class Livro {

    private long id;
    private String titulo;
    private int ano;
    private String autores;
    private String editora;
    private int edicao;

    public Livro() {
    }

    public Livro(long codigo, String titulo, int ano, String autores, String editora, int edicao) {
        this.id = codigo;
        this.titulo = titulo;
        this.ano = ano;
        this.autores = autores;
        this.editora = editora;
        this.edicao = edicao;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getAutores() {
        return autores;
    }

    public void setAutores(String autores) {
        this.autores = autores;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

}
