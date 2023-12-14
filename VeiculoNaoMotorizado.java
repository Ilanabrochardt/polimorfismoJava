package polimorfismo;

import java.util.Date;

public class VeiculoNaoMotorizado extends Veiculos{

	public VeiculoNaoMotorizado (String _nome, String _marca, Date _data, String _cor, double _valor, String tipoDeTracao){
		super(_nome, _marca, _data, _cor, _valor);
		this.tipoDeTracao = tipoDeTracao;
	}
	public String tipoDeTracao;

}
