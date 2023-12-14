package polimorfismo;

import java.util.Date;
//class mãe, como não vai executar nada, não precisa da class main

public class Veiculos {
	public String nome;
	public String marca;
	public Date data_compra;
	public String cor;
	public double valor;

	public Veiculos (String _nome, String _marca, Date _data, String _cor, double _valor) {
		this.nome = _nome;
		this.marca = _marca;
		this.data_compra = _data;
		this.cor = _cor;
		this.valor = _valor;
	}
	public void ExibirInformacoes() {
		System.out.printf("Informações do veículo: /n nome: " + nome + "marca: " + marca + "data_compra" + "cor" + cor + "valor" + valor);
	}
}
