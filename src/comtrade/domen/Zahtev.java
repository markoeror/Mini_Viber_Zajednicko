package comtrade.domen;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import comtrade.konstante.Konstante;



public class Zahtev implements Serializable, OpstiDomen,Konstante{

	private Korisnik posiljalac;
	private Korisnik primalac;
	private String primalacZahteva;
	private int id;
	public Zahtev(Korisnik posiljalac, Korisnik primalac) {
		this.posiljalac=posiljalac;
		this.primalac=primalac;
	}

	public Korisnik getPosiljalac() {
		return posiljalac;
	}

	public void setPosiljalac(Korisnik posiljalac) {
		this.posiljalac = posiljalac;
	}

	public Zahtev(String primalacZahteva, int id) {
		super();
		this.primalacZahteva = primalacZahteva;
		this.id = id;
	}

	public String getPrimalacZahteva() {
		return primalacZahteva;
	}

	public void setPrimalacZahteva(String primalacZahteva) {
		this.primalacZahteva = primalacZahteva;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Korisnik getPrimalac() {
		return primalac;
	}

	public void setPrimalac(Korisnik primalac) {
		this.primalac = primalac;
	}

	@Override
	public String vratiNazivTabele() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String vratiZaInsert() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String vratiZaUpdate(OpstiDomen od) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String vratiZaDelete(OpstiDomen od) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OpstiDomen> srediSelect(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String vratiZaSelect() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String vratiZaZahtevPrijateljstva() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<OpstiDomen> srediSelectZahteva(ResultSet rs) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String vratiZaUpdateZahteva(OpstiDomen k) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
