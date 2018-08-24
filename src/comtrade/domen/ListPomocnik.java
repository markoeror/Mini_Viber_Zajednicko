package comtrade.domen;

public class ListPomocnik {
	private int id;
	private String naziv;
	private int bnp;
	public ListPomocnik(int id, int bnp) {
		super();
		this.id = id;
		this.bnp = bnp;
	}
	public int getBnp() {
		return bnp;
	}
	public void setBnp(int bnp) {
		this.bnp = bnp;
	}
	public ListPomocnik(int id, String naziv) {
		super();
		this.id = id;
		this.naziv = naziv;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}
	@Override
	public String toString() {
		return naziv;
	}
}
