
public class Gerente extends Funcionario {
	private double gratificacao;
	public String listaFuncionario(){
		return getCpf() + getNome() + getSalarioBase() + getValorBonificacao() + getSalarioFinal();
	}
	public void calcularSalarioFinal(double gratificacao){
		this.gratificacao = gratificacao;
		setSalarioFinal(getSalarioBase() + getValorBonificacao() + gratificacao);
	}
	public String apresentarSalario(){
		return String.format("%s %.2f %.2f %.2f %.2f", getNome(), getSalarioBase(), getSalarioFinal(), gratificacao, getSalarioFinal());
	}
}
