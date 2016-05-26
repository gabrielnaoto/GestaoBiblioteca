/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.DataModel;
import javax.faces.model.ListDataModel;
import modelo.DAO.EmprestimoDAO;
import modelo.DAO.LivroDAO;
import modelo.Emprestimo;
import modelo.Livro;

/**
 *
 * @author ignoi
 */
@SessionScoped
@ManagedBean(name = "emprestimoBean")
public class EmprestimoBean {

    private Emprestimo emprestimo = new Emprestimo();
    private List<Emprestimo> emprestimos = EmprestimoDAO.listar();
    private DataModel<Emprestimo> emprestimosModel = new ListDataModel<Emprestimo>(emprestimos);
    private List<Livro> livros = LivroDAO.listar();

    public List<Emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos) {
        this.emprestimos = emprestimos;
    }

    public DataModel<Emprestimo> getEmprestimosModel() {
        return emprestimosModel;
    }

    public void setEmprestimosModel(DataModel<Emprestimo> emprestimosModel) {
        this.emprestimosModel = emprestimosModel;
    }

    public void update() {
        emprestimos = EmprestimoDAO.listar();
    }

    public Emprestimo getEmprestimo() {
        return emprestimo;
    }

    public void setEmprestimo(Emprestimo emprestimo) {
        this.emprestimo = emprestimo;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }

    public void emprestar() {
        char[] cpf = String.format("%011d", Long.parseLong(emprestimo.getCpf())).toCharArray();
        String newcpf = "" + cpf[0] + cpf[1] + cpf[2] + "." + cpf[3] + cpf[4] + cpf[5] + "." + cpf[6] + cpf[7] + cpf[8] + "-" + cpf[9] + cpf[10];
        emprestimo.setCpf(newcpf);
        EmprestimoDAO.inserir(emprestimo);
        update();
        emprestimo = new Emprestimo();
    }

}
