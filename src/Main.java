import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelCarro;
import model.entities.Veiculo;
import model.services.ServicoAluguel;
import model.services.TaxaImpostoBrasil;

public class Main {
	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		while(true) {
			System.out.println("***Aluguel de Veículos***");
			System.out.println("Modelo carro:");
			String modelo = sc.nextLine();
			System.out.println("Data inicio:");
			Date di = sdf.parse(sc.nextLine());
			System.out.println("Data final:");
			Date fi = sdf.parse(sc.nextLine());
			
			AluguelCarro al = new AluguelCarro(di, fi, new Veiculo(modelo));
			
			
			System.out.println("Digite o preco por hora:");
			double precoHora = sc.nextDouble();
			System.out.println("Preco por dia:");
			double precoDia = sc.nextDouble();
			
			ServicoAluguel servico = new ServicoAluguel(precoDia, precoHora, new TaxaImpostoBrasil());
			
			servico.processarPagamento(al);
			
			System.out.println("PAGAMENTO PROCESSADO");
			System.out.println("Pagamento básico: " + String.format("%.2f", al.getInvoice().pagamentoBasico));
			System.out.println("Imposto: " + String.format("%.2f", al.getInvoice().imposto));
			System.out.println("Pagamento total: " + String.format("%.2f", al.getInvoice().pagamentoTotal()));
		}
	}
}
