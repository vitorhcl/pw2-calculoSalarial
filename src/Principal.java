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
		Scanner ent = new Scanner(System.in);
		int opcao;
		do {
			opcao = menuPrincipal();
			switch (opcao) {
			case 1: {
				int opcaoDentro;
				do {
					Gerente gerente = new Gerente();
					System.out.println("1 – Cadastrar funcionário\n2 – Calcular salário\n4 - Calcular bonificação\n0 – Sair");
					opcaoDentro = ent.nextInt();
					switch (opcaoDentro) {
					case 1:
						System.out.print("Nome: ");
						String nome = ent.next();
						System.out.print("CPF: ");
						String cpf = ent.next();
						double salarioBase = ent.nextDouble();
						gerente.cadastrarFuncionario(nome, cpf, salarioBase);
						break;
					case 2:
						System.out.print("Gratificação: ");
						double gratificacao = ent.nextDouble();
						gerente.calcularSalarioFinal(gratificacao);
						break;
					case 3:
						gerente.calcularBonificacao();
						break;
					case 0:
						break;
					default:
						System.out.println("Opção inválida!");
					}
				} while (opcaoDentro != 0);
				break;
			}
			case 2: {
				int opcaoDentro;
				do {
					Vendedor vendedor = new Vendedor();
					System.out.println("1 – Cadastrar funcionário\n2 – Calcular salário\n4 - Calcular bonificação\n0 – Sair");
					opcaoDentro = ent.nextInt();
					switch (opcaoDentro) {
					case 1:
						System.out.print("Nome: ");
						String nome = ent.next();
						System.out.print("CPF: ");
						String cpf = ent.next();
						double salarioBase = ent.nextDouble();
						vendedor.cadastrarFuncionario(nome, cpf, salarioBase);
						break;
					case 2:
						System.out.print("Gratificação: ");
						double gratificacao = ent.nextDouble();
						vendedor.calcularSalarioFinal(gratificacao);
						break;
					case 3:
						vendedor.calcularBonificacao();
						break;
					case 0:
						continue;
					default:
						System.out.println("Opção inválida!");
					}
				} while (opcaoDentro != 0);
				break;
			}
			case 3: {
				int opcaoDentro;
				do {
					Atendente atendente = new Atendente();
					System.out.println("1 – Cadastrar funcionário\n2 – Calcular salário\n4 - Calcular bonificação\n0 – Sair");
					opcaoDentro = ent.nextInt();
					switch (opcaoDentro) {
					case 1:
						System.out.print("Nome: ");
						String nome = ent.nextLine();
						System.out.print("CPF: ");
						String cpf = ent.nextLine();
						double salarioBase = ent.nextDouble();
						atendente.cadastrarFuncionario(nome, cpf, salarioBase);
						break;
					case 2:
						System.out.print("Gratificação: ");
						double gratificacao = ent.nextDouble();
						atendente.calcularSalarioFinal(gratificacao);
						break;
					case 3:
						atendente.calcularBonificacao();
						break;
					case 0:
						continue;
					default:
						System.out.println("Opção inválida!");
					} while (opcao != 0);
				} while (opcaoDentro != 0);
			}
			}
		} while (opcao != 0);
	}
}
