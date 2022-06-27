
public class Vendedor extends Funcionario {
	private double valorComissao;

	public double getAdicionalNoturno() {
		return valorComissao;
	}

	public void setAdicionalNoturno(double adicionalNoturno) {
		this.valorComissao = adicionalNoturno;
	}
	public String listaFuncionario(){
		return getCpf()+ getNome() + getSalarioBase() + getValorBonificacao();		
	}
	public void calcularSalarioFinal(double adicionalNoturno){
		this.valorComissao = adicionalNoturno;
		setSalarioFinal(getSalarioBase() + getValorBonificacao() + adicionalNoturno);
	}
	public String apresentarSalario(){
		return String.format("%s %.2f %.2f %.2f %.2f", getNome(), getSalarioBase(), getSalarioFinal(), valorComissao, getSalarioFinal());
	}
}
