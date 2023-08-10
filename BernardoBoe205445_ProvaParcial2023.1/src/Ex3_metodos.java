import static javax.swing.JOptionPane.*;
import java.lang.Double;
import java.lang.Integer;

public class Ex3_metodos {
	
	Lista<Cargas> cargas = new Lista<>();
	
	public void menu() {
		
		double c=1000;
		int aux = 0;

		while (true) {

			aux = Integer.parseInt(showInputDialog("Sistema de Reserva de Cargas\n1. Reservar Carga\n2. Pesquisar Carga\n3. Imprimir Cargas Reservadas \n4. Excluir Carga\n5. Finalizar"));

			if (aux == 1) {

				reservar(c);

			} else if (aux == 2) {

				pesquisarcarga();

			} else if (aux == 3) {

				listar();
				
			}else if (aux == 4) {

				excluir();
			}else if (aux == 5) {

				showMessageDialog(null, "Operação finalizada com sucesso!");
				break;
				

			} else {

				showMessageDialog(null, "Inválido");

			}

		}
		
		
	}

	private void excluir() {
		// TODO Auto-generated method stub
		String cnpj = showInputDialog("Cnpj para ser excluido:");

		if (cargas.pesquisar(new Cargas(cnpj)) == null) {

			showMessageDialog(null, cnpj + " não foi encontrado");
			
		} else {

			Cargas carga = new Cargas(cnpj);
			showMessageDialog(null, cargas.consultar(new Cargas (cnpj)));
			cargas.remover(carga);
			showMessageDialog(getRootFrame(), "Carga excluida");
		}
		
		
	}

	private void listar() {
		// TODO Auto-generated method stub
		
		cargas.imprimir();
	}

	private void pesquisarcarga() {
		// TODO Auto-generated method stub
		
		String cnpj = showInputDialog("Cnpj para pesquisa:");

		if (cargas.pesquisar(new Cargas(cnpj)) == null) {

			showMessageDialog(null, cnpj + " não foi encontrado");
			
		} else {

			Cargas carga = new Cargas(cnpj);
			showMessageDialog(null, cargas.consultar(new Cargas (cnpj)));
			
		}
		
	}

	private double reservar(double c) {
		
		String cnpj, destino;
		double peso;
		
		cnpj = showInputDialog("Insira o Cnpj");
		destino = showInputDialog("Insira o destino da carga)");
		peso = Double.parseDouble(showInputDialog("Insira o peso da carga"));
		
		if(peso > c) {
			
			showMessageDialog(getRootFrame(), "Peso excede a capacidade do navio");
			return c;
		}
		Cargas carga = new Cargas();
		
		carga.setCnpj(cnpj);
		carga.setDestino(destino);
		carga.setPeso(peso);
		
		cargas.inserirfim(carga);
		
		c = c-peso;
		
		return c;
		
	}
	
	
}
