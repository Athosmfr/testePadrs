import java.util.ArrayList;

public class servicoMateriais extends Servico {

	protected ArrayList<Materiais> listaMaterial = new ArrayList<>();
	
	public double custoMaterial() {
		double custo = 0;
		for(Materiais materiais : listaMaterial) {
			custo += materiais.preco;
		}
		return custo;
	}
	
	public double valorFinal() {
		return this.valor + custoMaterial();
	}
	
//	protected ArrayList <material> listaMateriais = new ArrayList<>();
//	
//	public double custoMaterial() {
//		double custo = 0;
//		for (material Material: listaMateriais) {
//			custo += Material.precoProduto;
//		}
//		return custo;
//	}
//	
//	public double valorFinal() {
//		return valor + custoMaterial();
//	}
	
	
}
