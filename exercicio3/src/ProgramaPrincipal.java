
import java.util.Scanner;

public class ProgramaPrincipal {
	public static void main (String[]args){
		
		
		Scanner sc = new Scanner(System.in);
		double valorTotalDaCompra =0;
		
		Pedido p1 = new Pedido(1);
		long codi=1;


		while (codi != 0) {
			
			System.out.println("Insira o códido do produto: ");
			codi = sc.nextLong();
			System.out.println("Informe a quantidade de Itens: ");
			int quantidade = sc.nextInt();
			System.out.println("Informe o Valor do Item: ");
			double valor = sc.nextDouble();
			
			 
			ItemDePedido itens = new ItemDePedido(quantidade, codi,valor);
			p1.adicionaItem(itens);
		
			
			valorTotalDaCompra += (valor*quantidade);
		}
			System.out.println("O Valor total da Compra foi: R$" +valorTotalDaCompra);
		
		}
}