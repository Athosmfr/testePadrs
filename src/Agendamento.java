import java.util.ArrayList;

public class Agendamento {

	public ArrayList<Servico> listaServicos = new ArrayList<>();
	
	public void agendar() {
		for(Servico servicos: listaServicos) {
			System.out.printf("\nTitulo: %s - Data: %s - Preço: %.2f", servicos.titulo, servicos.data, servicos.valor);
		}
	}
	
}
