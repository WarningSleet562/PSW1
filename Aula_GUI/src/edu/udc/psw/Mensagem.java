package edu.udc.psw;

import javax.swing.JOptionPane;

public class Mensagem {

	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog(null, "Qual seu nome?");
		String idade = JOptionPane.showInputDialog(null, "Qual sua idade?");
		JOptionPane.showMessageDialog(null, "Ol� " + nome + " de " + idade + " anos!");
		int i = Integer.parseInt(idade);
		JOptionPane.showMessageDialog(null, "Ol� " + nome + " de " + idade + " anos!\n" + "Voc� nasceu em: " + (2019 - i));
	}

}
