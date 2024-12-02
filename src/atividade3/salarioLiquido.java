package atividade3;

import java.util.Scanner;

public class salarioLiquido {

	public static void main(String[] args) {
		float salarioBruto = 2000.00f;
		float adicionalNoturno =500.00f;
		float horasExtras = 100.00f;
		float descontos = 200.00f;
		
		Scanner ler= new Scanner(System.in);
		
	   float salarioliquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
	    
	    
	    System.out.println ("O  salário liquído é: " +  salarioliquido);
	    salarioliquido = ler.nextFloat();

	}

}
