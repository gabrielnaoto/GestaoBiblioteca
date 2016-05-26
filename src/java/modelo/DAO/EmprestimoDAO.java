/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.DAO;

import java.util.ArrayList;
import java.util.List;
import modelo.Emprestimo;

/**
 *
 * @author ignoi
 */
public class EmprestimoDAO {

    private static List<Emprestimo> emprestimos = new ArrayList<>();

    public static void inserir(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    public static boolean atualizar(Emprestimo e) {
        int codigo = e.getId();
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getId() == codigo) {
                emprestimos.remove(emprestimo);
                emprestimos.add(e);
                return true;
            }
        }
        return false;
    }

    public static Emprestimo remover(int id) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getId() == id) {
                emprestimos.remove(emprestimo);
                return emprestimo;
            }
        }
        return null;
    }

    public static List<Emprestimo> listar() {
        return emprestimos;
    }

}
