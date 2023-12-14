package polimorfismo;

import java.util.Date;

public class Bicicleta extends VeiculoNaoMotorizado{
	public Bicicleta (String _nome, String _marca, Date _data, String _cor, double _valor, String tipoDeTracao, int qtdDeMacha){
		super(_nome, _marca, _data, _cor, _valor, tipoDeTracao);
		this.qtdDeMacha = qtdDeMacha;
		
	}
		public int qtdDeMacha;
}
