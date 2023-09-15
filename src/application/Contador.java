package application;

import java.util.Scanner;

import exceptions.ParametrosInvalidosException;

public class Contador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o primeiro parâmetro: ");
		int parametroUm = sc.nextInt();
		System.out.println("Digite o segundo parâmetro: ");
		int parametroDois = sc.nextInt();
		
		try {
			contagem(parametroUm, parametroDois);
		} catch (ParametrosInvalidosException e){
			System.out.println(e.getMessage());
		}

		sc.close();
	}
	
	static void contagem(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
		if (parametroUm > parametroDois) {
			throw new ParametrosInvalidosException("O segundo parâmetro precisa ser maior que o primeiro parâmentro.");
		}
		
		int y = parametroDois - parametroUm;
		for(int x=1;x<=y;x++) {
			System.out.println("Imprimindo o número " + x);
		}
	}
}