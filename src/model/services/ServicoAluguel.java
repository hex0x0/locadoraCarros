package model.services;

import model.entities.AluguelCarro;
import model.entities.Invoice;

public class ServicoAluguel {
	private Double precoDiaria;
	private Double precoHora;
	
	private TaxaImpostoBrasil taxa;

	public ServicoAluguel(Double precoDiaria, Double precoHora, TaxaImpostoBrasil taxaImposto) {
		super();
		this.precoDiaria = precoDiaria;
		this.precoHora = precoHora;
		this.taxa = taxaImposto;
	}
	
	
	public void processarPagamento(AluguelCarro carro) {
		//get.time pega o valor em milissegundos da data
		long t1 = carro.getDataInicio().getTime();
		long t2 = carro.getDataFim().getTime();
		
		
		double horas = (double) (t2-t1) / 1000 / 60 / 60;
		
		double pagamento;
		if(horas <= 12) {
			pagamento = Math.ceil(horas) * precoHora;
		}else {
			pagamento = Math.ceil(horas / 24) * precoDiaria;
		}

		double tx = taxa.imposto(pagamento);
		
		carro.setInvoice(new Invoice(pagamento, tx));
		
		
	}
	
}
