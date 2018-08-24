package comtrade.domen;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import comtrade.konstante.Konstante;

public class Grupna_Poruka implements OpstiDomen, Serializable, Konstante{

	
	Korisnik k;
	String poruka;
	int idGrupnaPoruka;
	public Grupna_Poruka(int idKorisnika, int idGrupnaPoruka, int idGrupe, String poruka, String ime) {
		super();
		this.poruka = poruka;
		this.idGrupnaPoruka = idGrupnaPoruka;
		this.idGrupe = idGrupe;
		this.idKorisnika = idKorisnika;
		this.ime = ime;
	}

	public int getIdGrupnaPoruka() {
		return idGrupnaPoruka;
	}

	public void setIdGrupnaPoruka(int idGrupnaPoruka) {
		this.idGrupnaPoruka = idGrupnaPoruka;
	}

	int idGrupe;
	int idKorisnika;
	String ime;
	
	
	
	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public Grupna_Poruka() {
		super();
	}

	public Grupna_Poruka(String poruka, int idGrupe, int idKorisnika) {
		super();
		this.poruka = poruka;
		this.idGrupe = idGrupe;
		this.idKorisnika = idKorisnika;
	}

	public Grupna_Poruka(int idGrupe, int idKorisnika, String ime, String poruka) {
		this.idGrupe=idGrupe;
		this.idKorisnika=idKorisnika;
		this.ime=ime;
		this.poruka=poruka;
	}

	public Grupna_Poruka(int idGrupnaPoruka, int idGrupe, String poruka, String ime, int idKorisnika) {
		this.idGrupnaPoruka=idGrupnaPoruka;
		this.idGrupe=idGrupe;
		this.poruka=poruka;
		this.ime=ime;
		this.idKorisnika=idKorisnika;
	}

	public String getPoruka() {
		return poruka;
	}

	public void setPoruka(String poruka) {
		this.poruka = poruka;
	}

	public int getIdGrupe() {
		return idGrupe;
	}

	public void setIdGrupe(int idGrupe) {
		this.idGrupe = idGrupe;
	}

	public int getIdKorisnika() {
		return idKorisnika;
	}

	public void setIdKorisnika(int idKorisnika) {
		this.idKorisnika = idKorisnika;
	}

	@Override
	public String vratiNazivTabele() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String vratiZaInsert() {
		
		return "('"+getIdKorisnika()+"','"+getIdGrupe()+"','"+getPoruka()+"')";
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
		List<OpstiDomen> listaGrupnihPoruka=new ArrayList<>();
		while(rs.next()) {
			int idGrupnaPoruka=rs.getInt("idGrupnaPoruka");
			int idKorisnika=rs.getInt("idKorisnika");
			int idGrupe=rs.getInt("idGrupe");
			String poruka =rs.getString("poruka");	
			String ime=rs.getString("ime");
			Grupna_Poruka gp= new Grupna_Poruka(idGrupnaPoruka,idGrupe,poruka,ime,idKorisnika);
			listaGrupnihPoruka.add(gp);
		}
		return listaGrupnihPoruka;
	}
	
	public int srediSelectPorukeGrupe(ResultSet rs) throws SQLException{
		int idMax=0;
		while(rs.next()) {			
			 idMax=rs.getInt("idGrupnaPoruka");	
		}
		return idMax;
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
