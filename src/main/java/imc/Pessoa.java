package imc;

import javax.swing.JOptionPane;

public class Pessoa {

    private String nome;
    private String sexo;
    private Double peso;
    private Double altura;

    public void solicitarInformacoes() {
        nome = JOptionPane.showInputDialog("Digite o seu nome");
        sexo = JOptionPane.showInputDialog("Sexo: \n M / F ? ");
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura"));
    }

    public void exibirInformacoes() {
    	
    	calculaImc(altura, peso);
        String mensagem = "Nome: " + nome + "\n" + "Sexo: " + sexo + "\n" + "Peso: " + peso + "\n" + "Altura: " + altura;
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public void calculaImc(double altura, double peso) {
    	
        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println(nome + " seu IMC é " + imc + " e você está abaixo do peso");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println(nome + " seu IMC é " + imc + " e você esta no peso normal");
        } else if (imc >= 25.0 && imc <= 29.9) {
            System.out.println(nome + " seu IMC é " + imc + " e você está na Pré-Obesidade");
        } else if (imc >= 30.0 && imc <= 34.9) {
            System.out.println(nome + " seu IMC é " + imc + " e você está em Obesidade Grau 1");
        } else if (imc >= 35.0 && imc <= 39.9) {
            System.out.println(nome + " seu IMC é " + imc + " e você está em Obesidade Grau 2");
        } else {
            System.out.println(nome + " seu IMC é " + imc + " e você está em Obesidade Grau 3");
        }
    }
}