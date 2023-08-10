
public class Cargas {

	String cnpj = "";
	String destino;
	double peso;
	
	public Cargas(String cnpj, String destino, double peso) {
		
		this.cnpj = cnpj;
		this.destino = destino;
		this.peso = peso;
		

		
	}

	public Cargas() {
		// TODO Auto-generated constructor stub
	}

	public Cargas(String cnpj) {
		// TODO Auto-generated constructor stub
	this.cnpj = cnpj;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	@Override
	public boolean equals(Object obj) {

		Cargas cargas = (Cargas) obj;
		if (cargas.getCnpj().equalsIgnoreCase(getCnpj())) {

			return true;

		}

		return false;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Cnpj: " + cnpj + "\nDestino: " + destino + "\nPeso: " + peso + "Kg";
	}
	
	
}
