/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.DAO;

import java.util.ArrayList;
import java.util.List;
import modelo.Livro;

/**
 *
 * @author ignoi
 */
public class LivroDAO {

    private static List<Livro> livros = new ArrayList<>();

    public static void inserir(Livro livro) {
        livros.add(livro);
    }

    public static boolean atualizar(Livro l) {
        long codigo = l.getId();
        for (Livro livro : livros) {
            if (livro.getId() == codigo) {
                livros.remove(livro);
                livros.add(l);
                return true;
            }
        }
        return false;
    }

    public static Livro remover(int id) {
        for (Livro livro : livros) {
            if (livro.getId() == id) {
                livros.remove(livro);
                return livro;
            }
        }
        return null;
    }

    public static List<Livro> listar() {
        return livros;
    }

}
