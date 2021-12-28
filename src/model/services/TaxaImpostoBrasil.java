package model.services;

public class TaxaImpostoBrasil {
	public Double imposto(Double amount) {
		if(amount <= 100.0) {
			return amount * 0.2;
		}else {
			return amount *0.15;
		}
	}
}
