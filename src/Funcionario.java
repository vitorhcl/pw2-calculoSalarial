
public abstract class Funcionario {
	private String nome;
	private String cpf;
	private double salarioBase;
	private double salarioFinal;
	private double valorBonificacao;
	public void calcularBonificacao(){}
	public void cadastrarFuncionario(String nome, String cpf, double salarioBase){
		this.nome = nome;
		this.cpf = cpf;
		this.salarioBase = salarioBase;
	}
	public abstract String listaFuncionario();
	public abstract void calcularSalarioFinal(double gratificacao);
	public abstract String apresentarSalario();
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(double salarioBase) {
		this.salarioBase = salarioBase;
	}
	public double getSalarioFinal() {
		return salarioFinal;
	}
	public void setSalarioFinal(double salarioFinal) {
		this.salarioFinal = salarioFinal;
	}
	public double getValorBonificacao() {
		return valorBonificacao;
	}
	public void setValorBonificacao(double valorBonificacao) {
		this.valorBonificacao = valorBonificacao;
	}

}
