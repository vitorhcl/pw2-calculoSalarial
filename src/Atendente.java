
public class Atendente extends Funcionario {
	private double adicionalNoturno;

	public double getAdicionalNoturno() {
		return adicionalNoturno;
	}

	public void setAdicionalNoturno(double adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}
	public String listaFuncionario(){
		return getCpf()+ getNome() + getSalarioBase() + getValorBonificacao();		
	}
	public void calcularSalarioFinal(double adicionalNoturno){
		this.adicionalNoturno = adicionalNoturno;
		setSalarioFinal(getSalarioBase() + getValorBonificacao() + adicionalNoturno);
	}
	public String apresentarSalario(){
		return String.format("%s %.2f %.2f %.2f %.2f", getNome(), getSalarioBase(), getSalarioFinal(), adicionalNoturno, getSalarioFinal());
	}
}
