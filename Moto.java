package polimorfismo;

import java.util.Date;

public class Moto extends VeiculoMotorizado {
	public Moto (String _nome, String _marca, Date _data, String _cor, double _valor, String tipoDeVeiculo,int qtdDeRoda, String tipoFreio){
		super(_nome, _marca, _data, _cor, _valor, tipoDeVeiculo, qtdDeRoda);
		this.tipoFreio = tipoFreio;
	}
	public String tipoFreio;
}
