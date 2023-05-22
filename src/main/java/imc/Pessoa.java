package imc;

import javax.swing.JOptionPane;

public class Pessoa {

    protected String nome;
    protected Character sexo;
    protected Double peso;
    protected Double altura;

    public void solicitarInformacoes() {
        nome = JOptionPane.showInputDialog("Digite o seu nome");
        peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a sua altura em centímetros"));
    }

    public void exibirInformacoes() {
        String mensagem = "Nome: " + nome + "\n" + "Peso: " + peso + "\n" + "Altura: " + altura;
        JOptionPane.showMessageDialog(null, mensagem);
    }

    public void calculaImc(double imc, double altura, double peso) {

        imc = peso / (altura * altura);

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