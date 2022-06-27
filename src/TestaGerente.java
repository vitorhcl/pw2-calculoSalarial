
public class TestaGerente {
	public static void main(String[] args) {
		Gerente grt1 = new Gerente();
		grt1.cadastrarFuncionario("Vitor", "423434", 15000);
		grt1.calcularSalarioFinal(4);
		System.out.printf(grt1.apresentarSalario());
	}
}
