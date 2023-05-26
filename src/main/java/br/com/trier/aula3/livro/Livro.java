package br.com.trier.aula3.livro;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Livro {

    private String titulo;
    private double preco;
    private List<Autor> autores = new ArrayList<Autor>();
    
    public Livro(String titulo, double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }
    
    public void cadastraLivro(List<Autor> autoresCadastrados) {
        
        titulo = JOptionPane.showInputDialog("Nome do Livro");
        preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do livro"));
        
        setTitulo(titulo);
        setPreco(preco);
        setAutores(new ArrayList<>());        
    }
    
    public void adicionarAutor(Autor autor) {
    	autores.add(autor);
    }
    
    public String listaLivros () {
        String ret = "Livros cadastrados:\n\n";
        ret += " - Título: " + getTitulo() + "\n";
        ret += " - Preço do livro: R$" + getPreco() + "\n";
        
        for (Autor autor : autores) {
            ret += " - Autores: " + autor.getNome() + "\n";
            ret += " - Idade: " + autor.getIdade() + "\n";
            ret += " - Sexo: " + autor.getSexo() + "\n\n";
        }
        return ret;
    }
    
    }

