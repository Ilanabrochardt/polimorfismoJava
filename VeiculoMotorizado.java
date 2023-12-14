package polimorfismo;

import java.util.Date;

public class VeiculoMotorizado extends Veiculos{
	
	public VeiculoMotorizado (String _nome, String _marca, Date _data, String _cor, double _valor, String tipoDeVeiculo,int qtdDeRoda){
		super(_nome, _marca, _data, _cor, _valor);
		
		this.tipoDeVeiculo = tipoDeVeiculo;
		this.qtdDeRoda = qtdDeRoda;
	}
	public String tipoDeVeiculo;
	public int qtdDeRoda;
	
}
