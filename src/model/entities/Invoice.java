package model.entities;

public class Invoice {
	public Double pagamentoBasico;
	public Double imposto;
	
	public Invoice() {
		
	}
	
	public Invoice(Double pagamentoBasico, Double imposto) {
		this.pagamentoBasico = pagamentoBasico;
		this.imposto = imposto;
	}

	public Double getPagamentoBasico() {
		return pagamentoBasico;
	}

	public void setPagamentoBasico(Double pagamentoBasico) {
		this.pagamentoBasico = pagamentoBasico;
	}

	public Double getImposto() {
		return imposto;
	}

	public void setImposto(Double imposto) {
		this.imposto = imposto;
	}
	
	public Double pagamentoTotal() {
		return getPagamentoBasico() + getImposto();
	}
	
	
	
	
}
