package aula03;

import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		/*Fa�a um programa que verifique se o usu�rio digitado � igual a 'administrador' e se a senha digitada � igual a '123'*/
		Scanner leitor = new Scanner(System.in);
		String usuario, senha;
		System.out.println("SISTEMA DE LOGIN");
		System.out.println("Por favor, digite seu username:");
		usuario = leitor.next();
		System.out.println("Por favor, digite sua senha:");
		senha = leitor.next();	
		//Aqui � preciso criar um if que verifique as duas condi��es para o login ser bem sucedido
		if (usuario.equals("administrador") & senha.equals("123")) {
			System.out.println("Usuário logado com sucesso!");
		} else {
			System.out.println("Usuário e/ou senha inválidos!");
		}
		
		
		leitor.close();

	}

}
