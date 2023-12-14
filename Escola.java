package polimorfismo;
import java.util.Date;

// instanciando os objetos e executando eles.

public class Escola {
	public static void main(String[] args) {
		Aluno i = new Aluno("Ilana", "12345678910", new Date());
		i.matricula = "12345";
		
		Funcionario j = new Funcionario("Sturat", "12345678909", new Date());
		j.salario = 2500.00;
		j.data_admissao = new Date();
		j.cargo = "Auxiliar de professor";
		
		Professor k = new Professor("Wellington", "12345678902", new Date());
		k.salario = 7000.00;
		k.disciplina = "programacao";
		
		System.out.printf("Nome do aluno: " + i.nome + "\n");
		System.out.printf("cpf do aluno: " + i.cpf + "\n");
		System.out.printf("data de nascimento: " + i.data_nascimento + "\n");
		System.out.printf("matricula do aluno" + i.matricula + "\n");
		
		System.out.printf("Nome do funcionario: " + j.nome + "\n");
		System.out.printf("cpf do funcionario: " + j.cpf + "\n");
		System.out.printf("data de nascimento: " + j.data_nascimento + "\n");
		System.out.printf("cargo do funcionario: " + j.cargo + "\n");
		System.out.printf("alario do funcionario: " + j.cargo + "\n");
		System.out.printf("data de adminissão do funcionario" + j.data_admissao + "\n");
		
		System.out.printf("Nome do professor: " + k.nome + "\n");
		System.out.printf("cpf do professor: " + k.cpf + "\n");
		System.out.printf("data de nascimento: " + k.data_nascimento + "\n");
		System.out.printf("salário professor: " + k.salario + "\n");
		System.out.printf("Disciplina que o professor leciona é: " + k.disciplina + "\n");
		
	}
}
