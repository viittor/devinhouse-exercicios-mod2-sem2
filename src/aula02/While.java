package aula02;

import java.util.Scanner;

public class While {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String usuario, senha;

		System.out.println("\n\nDigite o nome de usuário: ");
		usuario = entrada.nextLine();

		System.out.println("Digite uma senha: ");
		senha = entrada.nextLine();

		while (senha.equals(usuario)) {
			System.out.println("A senha não pode ser igual ao nome de usuario! Tente novamente!");
			main(args);
		}
		System.out.println("Parabéns, você entrou!");
	}

}
