package Atividades;

import java.util.Scanner;

public class AtividadeTres {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Por favor, insira seu nome.");
//		String nome = input.nextLine();
		System.out.println("Por favor, insira sua idade.");
		int idade = input.nextInt();
		System.out.println("Por favor, insira seu sexo (M ou F)");
		String sexo = input.next();
		
		if (sexo.toLowerCase().equals("m") || sexo.toLowerCase().equals("masculino")) {
			if (idade <= 15) {
				System.out.println("Você pagará R$60.00.");
			}
			if (idade > 15 && idade <=18) {
				System.out.println("Você pagará R$75.00.");
			}
			if (idade > 18 && idade <= 30) {
				System.out.println("Você pagará R$85.00.");
			}
			if (idade > 30) {
				System.out.println("Você pagará R$80.00.");
			}
		}
		
		if (sexo.toLowerCase().equals("f") || sexo.toLowerCase().equals("feminino")) {
			if (idade <= 18) {
				System.out.println("Você pagará R$60.00.");
			}
			if (idade > 18 && idade <= 25) {
				System.out.println("Você pagará R$75.00.");
			}
			if (idade > 25 && idade <= 40) {
				System.out.println("Você pagará R$85.00.");
			}
			if (idade > 40) {
				System.out.println("Você pagará R$80.00.");
			}
		}
	}
}
