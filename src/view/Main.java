package view;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
						
		String endereco = JOptionPane.showInputDialog("Informe o endereço: ");
		String[] vetorString = endereco.split("(?<=\\D)(?=\\d)", 2);		
		String concatenado = String.join(", ", vetorString);
		System.out.println(" {"+concatenado+"} ");
		
		/**
		 o programa tem como objetivo receber um endereço escrito pelo usuario e 
		 retornar o endereço concatenado. exemplo:
		 		  
		 entrada: "Rio Branco 23"
		 
		 saida: {"Rio Branco", "23"} 
		  
		 */
	}

}
