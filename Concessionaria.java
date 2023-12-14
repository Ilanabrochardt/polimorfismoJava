package polimorfismo;

import java.util.Date;

public class Concessionaria {
	public static void main(String[] args) {
		Moto i = new Moto("nome ", "honda ", new Date(), " verde ",20000.00," motocicleta ",2, " Freio ABS");
		
		Carro j = new Carro("ka", "Ford", new Date(), "cinza", 35000.00,"carro",4, 2);
		
		Bicicleta k = new Bicicleta("nome", "caloi", new Date(), "vermelha", 8000.00, "tracao humana", 3);
		
		System.out.printf("Dados do veículo: " + i.nome + i.marca + i.data_compra + i.cor + i.valor + i.tipoFreio + i.qtdDeRoda + i.tipoFreio);

	}

}
