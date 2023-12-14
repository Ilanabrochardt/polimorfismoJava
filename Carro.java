package polimorfismo;

import java.util.Date;

public class Carro extends VeiculoMotorizado{
	public Carro (String _nome, String _marca, Date _data, String _cor, double _valor, String tipoDeVeiculo,int qtdDeRoda, int qtdDePortas){
		super(_nome, _marca, _data, _cor, _valor, tipoDeVeiculo, qtdDeRoda);
		this.qtdDePortas = qtdDePortas;
	}
	public int qtdDePortas;
}
