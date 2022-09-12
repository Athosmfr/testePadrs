//import java.util.ArrayList;

public class Cobranca {

	//ArrayList<Servico> listaServicos = new ArrayList<>();
	metodoPgto metodo;
	
	public void cobranca(Agendamento agenda) {
		System.out.printf("\nValor Total dos Servicos: %.2f \nMetodo de Pagamento: %s", precoTotal(agenda), metodo);
	}
	
	public double precoTotal(Agendamento agenda) {
		double total = 0;
		for(Servico totalServicos: agenda.listaServicos) {
			total += totalServicos.valorFinal();
		}
		return total;
	}
	
//	public double totalServicos(agendamento Agenda) {
//		double total = 0;
//		for(baseServico valor: Agenda.servico) {
//			total += valor.valorFinal();
//		}
//		return total;
//	}
	
}
