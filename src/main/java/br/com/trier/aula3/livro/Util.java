package br.com.trier.aula3.livro;

import java.util.List;

import javax.swing.JOptionPane;

public class Util {

    public static void cadastraAutor(List<Autor> autores) {
        Autor autor = new Autor();
        autor.cadastraAutor();
        autores.add(autor);
    }
    
    public static void cadastraLivro(List<Autor> autores, List<Livro> livros) {
        String titulo = JOptionPane.showInputDialog("Nome do Livro").toLowerCase();
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do livro"));

        Livro livro = new Livro(titulo, preco);

        StringBuilder opcoesAutores = new StringBuilder();
        for (int i = 0; i < autores.size(); i++) {
            opcoesAutores.append((i + 1)).append(". ").append(autores.get(i).getNome()).append("\n");
        }

        int contadorAutores = 0;
        boolean adicionarMaisAutores = true;
        while (adicionarMaisAutores && contadorAutores < 4) {
            int autorSelecionado;
            do {
                autorSelecionado = Integer.parseInt(JOptionPane.showInputDialog(
                        "Selecione o número do autor:\n" + opcoesAutores.toString()));

                if (autorSelecionado < 1 || autorSelecionado > autores.size()) {
                    JOptionPane.showMessageDialog(null, "Número de autor inválido. Tente novamente.");
                }
            } while (autorSelecionado < 1 || autorSelecionado > autores.size());

            Autor autor = autores.get(autorSelecionado - 1);
            livro.adicionarAutor(autor); 

            contadorAutores++;

            if (contadorAutores < 4) {
                String resposta = JOptionPane.showInputDialog("Deseja cadastrar mais um autor? (Digite 'sim' ou 'não')");

                if (resposta.equalsIgnoreCase("não")) {
                    adicionarMaisAutores = false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Limite máximo de autores atingido (4).");
            }
        }

        livros.add(livro);
    }
    
    public static String listaTodosLivros(List<Livro> livros) {
        String ret = "";
        for (Livro livro : livros) {
            ret += livro.listaLivros();
        }
        return ret;
    }
    
    public static void pesquisarLivrosPorAutor(List<Livro> livros) {
        String autorPesquisado = JOptionPane.showInputDialog("Digite o nome do autor:");

        boolean encontrouLivros = false;
        StringBuilder livrosEncontrados = new StringBuilder();

        for (Livro livro : livros) {
            for (Autor autor : livro.getAutores()) {
                if (autor.getNome().equalsIgnoreCase(autorPesquisado)) {
                    livrosEncontrados.append("- Título: ").append(livro.getTitulo()).append("\n")
                                    .append("  Preço: ").append(livro.getPreco()).append("\n\n");
                    encontrouLivros = true;
                    break;
                }
            }
        }

        if (encontrouLivros) {
            JOptionPane.showMessageDialog(null, "Livros do autor '" + autorPesquisado + "':\n\n" + livrosEncontrados.toString());
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum livro encontrado para o autor '" + autorPesquisado + "'.");
        }
    }
    
    public static void pesquisarLivrosPorFaixaDeValor(List<Livro> livros) {
        double valorMinimo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor mínimo:"));
        double valorMaximo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor máximo:"));

        StringBuilder resultado = new StringBuilder("Livros encontrados na faixa de valor de R$ " + valorMinimo + " a R$ " + valorMaximo + ":\n\n");

        boolean encontrouLivros = false;

        for (Livro livro : livros) {
            if (livro.getPreco() >= valorMinimo && livro.getPreco() <= valorMaximo) {
                resultado.append("Título: ").append(livro.getTitulo()).append("\n");
                resultado.append("Preço: R$ ").append(livro.getPreco()).append("\n");
                resultado.append("\n");
                encontrouLivros = true;
            }
        }

        if (!encontrouLivros) {
            resultado.append("Nenhum livro encontrado na faixa de valor especificada.");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
    
    public static void listarLivrosAutoresComCriancas(List<Livro> livros) {
        StringBuilder resultado = new StringBuilder("Livros escritos por autores com crianças (idade <= 12):\n\n");

        boolean encontrouLivros = false;

        for (Livro livro : livros) {
            boolean autorComCriancas = false;
            for (Autor autor : livro.getAutores()) {
                if (autor.getIdade() <= 12) {
                    autorComCriancas = true;
                    break;
                }
            }
            if (autorComCriancas) {
                resultado.append("Título: ").append(livro.getTitulo()).append("\n");
                resultado.append("Preço: R$ ").append(livro.getPreco()).append("\n");
                resultado.append("Autores:\n");
                for (Autor autor : livro.getAutores()) {
                    resultado.append("- ").append(autor.getNome()).append("\n");
                }
                resultado.append("\n");
                encontrouLivros = true;
            }
        }

        if (!encontrouLivros) {
            resultado.append("Nenhum livro encontrado com autores que tenham crianças (idade <= 12).");
        }

        JOptionPane.showMessageDialog(null, resultado.toString());
    }
    
    public static void listarLivrosPorSexoAutores(List<Livro> livros) {
       // opcao 7 
    }

    
    public static int escolheMenu() {
        String menu = "1 - Cadastrar autor\r\n" + "2 - Cadastrar livros\r\n"
                + "3 - Listar todos os livros cadastrados.\r\n"
                + "4 - Pesquisar por autor (listar todos os livros de um autor)\r\n" 
                + "5 - Pesquisar por faixa de valor do livro (mínimo e máximo)\n"
                + "6 - Listar todos os livros cujo autores tenham crianças (idade <=12)\n"
                + "7 - Listar livros por sexo\n\n"
                + "8 - Sair da aplicação";
        return Integer.parseInt(JOptionPane.showInputDialog(menu));
    }
}