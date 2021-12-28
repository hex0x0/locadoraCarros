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

	public Date getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}

	public Date getDataFim() {
		return dataFim;
	}

	public void setDataFim(Date dataFim) {
		this.dataFim = dataFim;
	}

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Invoice getInvoice() {
		return invoice;
	}

	public void setInvoice(Invoice invoice) {
		this.invoice = invoice;
	}
	
	
	
	
}
