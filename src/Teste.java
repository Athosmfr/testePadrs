
public class Teste {

	public static void main(String[] args) {
		
		Cliente cl = new Cliente();
		
		cl.nome = "asfolto";
		cl.cpf = "3124";
		
		Servico qlqr = new Servico();
		qlqr.titulo = "Qualquer servico";
		qlqr.data = "2/5/1998";
		qlqr.valor = 141;
		qlqr.valorFinal();
		
		servicoHora s02 = new servicoHora();
		s02.titulo = "saodj";
		s02.data = "05/12/2021";
		s02.valor = 124;
		s02.hora = 6;
		s02.valorFinal();
		
		
		servicoMateriais s03 = new servicoMateriais();
		
		Materiais m01 = new Materiais();
		m01.nomeProduto = "Arroz";
		m01.preco = 50.00;
		
		s03.listaMaterial.add(m01);
		s03.titulo = "tesre";
		s03.data = "03/04/2024";
		s03.valor = 200;
	
		
		Agendamento novo = new Agendamento();
		novo.listaServicos.add(qlqr);
		novo.listaServicos.add(s02);
		novo.listaServicos.add(s03);
		
		novo.agendar();
		
		Cobranca c01 = new Cobranca();
		c01.metodo = metodoPgto.Boleto;
		c01.cobranca(novo);
		
		
	}
	
}
