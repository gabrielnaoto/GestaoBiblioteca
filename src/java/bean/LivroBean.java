/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import modelo.DAO.LivroDAO;
import modelo.Livro;

/**
 *
 * @author ignoi
 */
@SessionScoped
@ManagedBean(name = "livroBean")
public class LivroBean {

    private Livro livro = new Livro();
    private List<Livro> livros = LivroDAO.listar();
    private DataModel<Livro> livrosModel = new ListDataModel<Livro>(livros);

    @PostConstruct
    public void init() {
        LivroDAO.inserir(new Livro(9528, "As Aventuras de Pi", 1987, "E. E. Paul, G. Simons", "Editora Brasil", 5));
        LivroDAO.inserir(new Livro(1594, "O Poder da Ação", 2016, "A. F. McCartney", "Editora Atlas", 1));
        LivroDAO.inserir(new Livro(1344, "Rush", 2001, "M. Rossi", "Editora Brasil", 10));
        LivroDAO.inserir(new Livro(5443, "Dois Mundos, um Herói", 2005, "E. Rezende", "Editora São Paulo", 2));
        LivroDAO.inserir(new Livro(9528, "Grey", 2010, "E. L james", "Editora Sigma", 3));
        update();
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public DataModel<Livro> getLivrosModel() {
        return livrosModel;
    }

    public void setLivrosModel(DataModel<Livro> livrosModel) {
        this.livrosModel = livrosModel;
    }

    public void update() {
        livros = LivroDAO.listar();
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }
    
    public void cadastrar(){
        LivroDAO.inserir(livro);
        update();
        livro = new Livro();
    }

}
