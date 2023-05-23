package br.com.trier.aula2.imc;

import javax.swing.JOptionPane;

public class Pessoa {

    String nome;
    String sexo;
    double peso;
    double altura;
    
    double calculaImc () {
        return peso / (altura * altura);
    }
    
    void cadastrar () {
        
        nome = JOptionPane.showInputDialog("Nome");
        sexo = JOptionPane.showInputDialog("Sexo");
        peso = Double.parseDouble(JOptionPane.showInputDialog("Peso"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Altura"));

    }
    
    String imprimir () {
        return "Nome: " + nome + " IMC: " + calculaImc() + " (" + avaliaImc() + ")\n";
    }
    
    String avaliaImc () {
        
        String ret = "Não identificado";
        double imc = calculaImc ();
        
        if (sexo.equalsIgnoreCase("F")) {
            imc = imc * 0.9;
        }
        
        if (imc <= 18.5) {
            ret = "Abaixo do peso";
        } else if (imc > 18.5 && imc <= 25) {
            ret = "Peso normal";
        } else if (imc > 25 && imc <= 30) {
            ret = "Sobre peso";
        } else if (imc > 30 && imc <= 35) {
            ret = "Obesidade Grau 1";
        } else if (imc > 35 && imc <= 40) {
            ret = "Obesidade Grau 2";
        } else if (imc > 40 ) {
            ret = "Obesidade Grau 3";
        }
        return ret;
    }
    
}
