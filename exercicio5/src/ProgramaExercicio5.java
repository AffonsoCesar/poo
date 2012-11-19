
public class ProgramaExercicio5 {
	public static void main(String[]args){
	
	Agenda agen = new Agenda();
	
	Contato c1 = new Contato("Affonso","88168871");
	
	agen.adicionarContato(c1.getNome(),c1.getTelefone());
	try{
	agen.pesquisarContato("Affonso");
	agen.pesquisarContato("Cesar");
	}catch(ContatoInexistenteException e){
		System.out.println("O Contato não foi Encontrato!");
		
	}
	}
	

}
