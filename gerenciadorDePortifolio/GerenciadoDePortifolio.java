package gerenciadorDePortifolio;
import java.util.ArrayList;


public class GerenciadoDePortifolio {
	public static void main(String[] args) {
		
		ArrayList<String> AcoesNome = new ArrayList<>();		
		ArrayList<Integer> QuantidadeAcoes = new ArrayList<>();
		
		AcoesNome.add("Porto Seguro (PSSA3)");
		QuantidadeAcoes.add(82);
		
		AcoesNome.add("Totvs (Tots3)");
		QuantidadeAcoes.add(70);
		
		AcoesNome.add("CSU Digital (CSUD3)");
		QuantidadeAcoes.add(100);
		
		AcoesNome.add("B3 (B3SA3)");
		QuantidadeAcoes.add(100);
		
		AcoesNome.add("Intelbras (INTB3)");
		QuantidadeAcoes.add(100);
		
		AcoesNome.add("Odontoprev (ODPV3)");
		QuantidadeAcoes.add(100);
		
		
		System.out.println("MINHA CARTEIRA DE AÇÕES \n");
		
		for(int i=0; i < AcoesNome.size(); i++) {
			
			System.out.println("\n"+ AcoesNome.get(i));
			System.out.println("ações: "+ QuantidadeAcoes.get(i));
		}
		
	}
}
