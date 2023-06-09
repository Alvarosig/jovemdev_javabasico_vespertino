package br.com.trier.aula3.livro;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

import lombok.Getter;

@Getter
public class Principal {
    
    public static void main(String[] args) {
        
        List<Autor> autores = new ArrayList<Autor>();
        List<Livro> livros = new ArrayList <Livro> ();
        int op = 0;
        
        do {
            op = Util.escolheMenu();
            switch (op) {
            case 1:
                Util.cadastraAutor(autores);
                break;
            case 2:
                Util.cadastraLivro(autores, livros);
                break;
            case 3:
                String lista = Util.listaTodosLivros(livros);
                JOptionPane.showMessageDialog(null, lista);
                break;
            case 4:
                Util.pesquisarLivrosPorAutor(livros);
                break;
            case 5:
                Util.pesquisarLivrosPorFaixaDeValor(livros);
                break;
            case 6:
                Util.listarLivrosAutoresComCriancas(livros);
                break;
            case 7:
                Util.listarLivrosPorSexoAutores(livros);
                break;
            }
        } while (op != 8);
    }
}

