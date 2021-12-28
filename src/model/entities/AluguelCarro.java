package model.entities;

import java.util.Date;

public class AluguelCarro {
	private Date dataInicio;
	private Date dataFim;
	
	private Veiculo veiculo;
	
	private Invoice invoice;
	
	public AluguelCarro() {
		
	}

	public AluguelCarro(Date dataInicio, Date dataFim, Veiculo veiculo) {

		this.dataInicio = dataInicio;
		this.dataFim = dataFim;
		this.veiculo = veiculo;
	}
	
	
	
}
