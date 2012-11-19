import java.util.ArrayList;
import java.util.List;


public class Agenda implements AgendaIF{

	
	List<Contato>contatos;
	
	public Agenda(){
		this.contatos= new ArrayList<Contato>();
	}
	
	public void adicionarContato(String nome, String telefone) {
		this.contatos.add(new Contato(nome,telefone));
	}

	@Override
	public Contato pesquisarContato(String nomeContato)
			throws ContatoInexistenteException {
		for(Contato c : contatos){
			if((nomeContato)!=(c.getNome())){
				throw new ContatoInexistenteException("O Contato não foi encontrado!");
			}
			
				return c;
			}
		
		return null;
	}

	@Override
	public void removerContato(String nomeContato)
			throws ContatoInexistenteException {
		for(Contato c : contatos){
			if((nomeContato)!=(c.getNome())){
				throw new ContatoInexistenteException("O Contato não foi encontrado!");
			} else {
			contatos.remove(c);
			}
			}
		}
		
		
	
	

}
