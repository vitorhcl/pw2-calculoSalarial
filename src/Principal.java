import java.util.Scanner;

public class Principal {
	public static int menuPrincipal() {
		Scanner ent = new Scanner(System.in);
		int opcao;
		System.out.println("1 – Gerente\n2 – Vendedor\n3 – Atendente\n0 – Sair");
		opcao = ent.nextInt();
		return opcao;
	}
	public static void main(String[] args) {
		Gerente gerente = new Gerente();
		Vendedor vendedor = new Vendedor();
		Atendente atendente = new Atendente();
		Scanner ent = new Scanner(System.in);
		int opcao;
		do {
			opcao = menuPrincipal();
			switch(opcao) {
			case 1:
				do {
					System.out.println("1 – Cadastrar funcionário\n2 – Calcular salário\nCalcular bonificação\n4- 0 – Sair");
					int opcaoDentro= ent.nextInt();
					switch(opcaoDentro) {
					case 1:
						String nome = ent.nextLine();
						String cpf = ent.nextLine();
						double salarioBase = ent.nextDouble();
						gerente.cadastrarFuncionario(nome, cpf, salarioBase);
						break;
					}
				} while (opcao != 0);
				break;
			case 2:
				do {
					System.out.println("1 – Cadastrar funcionário\n2 – Calcular salário\nCalcular bonificação\n4- 0 – Sair");
					int opcaoDentro= ent.nextInt();
					switch(opcaoDentro) {
					case 1:
						String nome = ent.nextLine();
						String cpf = ent.nextLine();
						double salarioBase = ent.nextDouble();
						gerente.cadastrarFuncionario(nome, cpf, salarioBase);
						break;
					} while (opcao != 0);
				break;
			case 3:
				do {
					System.out.println("1 – Cadastrar funcionário\n2 – Calcular salário\nCalcular bonificação\n4- 0 – Sair");
					int opcaoDentro= ent.nextInt();
					switch(opcaoDentro) {
					case 1:
						String nome = ent.nextLine();
						String cpf = ent.nextLine();
						double salarioBase = ent.nextDouble();
						gerente.cadastrarFuncionario(nome, cpf, salarioBase);
						break;
					} while (opcao != 0);
				} while (opcao != 0);
			case 4:
				do {
					System.out.println("1 – Cadastrar funcionário\n2 – Calcular salário\nCalcular bonificação\n4- 0 – Sair");
					int opcaoDentro= ent.nextInt();
					switch(opcaoDentro) {
					case 1:
						String nome = ent.nextLine();
						String cpf = ent.nextLine();
						double salarioBase = ent.nextDouble();
						gerente.cadastrarFuncionario(nome, cpf, salarioBase);
						break;
					} while (opcao != 0);
				} while (opcao != 0);
			}
		} while (opcao != 0);
	}
}
