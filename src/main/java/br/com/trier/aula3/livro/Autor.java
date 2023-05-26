package br.com.trier.aula3.livro;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
public class Autor {

    private List<Autor> autores = new ArrayList<Autor>();
    private String nome;
    private int idade;
    private Sexo sexo;
    private String[] opcoesSexo = { "Masculino", "Feminino" };
    
    public void cadastraAutor() {

        nome = JOptionPane.showInputDialog("Nome e Sobrenome do Autor");
        idade = Integer.parseInt(JOptionPane.showInputDialog("Informe a sua idade"));
        int sexoEscolhido = JOptionPane.showOptionDialog(null, "Selecione o sexo", "Sexo", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, opcoesSexo, opcoesSexo[0]);
        
        if (sexoEscolhido != JOptionPane.CLOSED_OPTION) {
            String opcaoSexo = opcoesSexo[sexoEscolhido];
            if (opcaoSexo.equals("Masculino")) {
                sexo = Sexo.MASCULINO;
            } else if (opcaoSexo.equals("Feminino")) {
                sexo = Sexo.FEMININO;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Opção de sexo inválida. Tente novamente.");
            cadastraAutor();
        }
        
        if (!validar()) {
            cadastraAutor();
        }
    }
    
    boolean validar () {
        
        if (!nome.contains(" ")) {
            JOptionPane.showMessageDialog(null, "Informe o nome completo com sobrenome.");
            return false;
        }
        
        if (idade <= 0) {
            JOptionPane.showMessageDialog(null, "Informe uma idade válida");
            return false;
        }
        
        return true;
    }
    
    @Override
    public String toString() {
        return "Autor: " + nome + "\n" + "Idade: " + idade + "\n" + "Sexo: " + opcoesSexo + "\n";
    }
}
