package polimorfismo;
import java.util.Date;

public class Funcionario extends Pessoa{
	
	//construtor com os atributos herdados da classe mãe"
	public Funcionario(String _nome, String _cpf, Date _data) {
		super(_nome,_cpf, _data);
	}
	//atributos especificos da classe funcionario
	public double salario;
	public Date data_admissao;
	public String cargo;
}
