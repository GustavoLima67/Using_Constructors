package entities;

public class Date {

	
	public String date;
	public Product p;
	
	public Date(String date, Product p) {
		super();
		this.date = date;
		this.p = p;
		this.p.name = "Mouse"; // Nao deu erro pois a variavel name pode ser acessada por um arquivo diferente mas do mesmo pacote.
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Product getP() {
		return p;
	}

	public void setP(Product p) {
		this.p = p;
	}
	
}
