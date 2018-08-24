package comtrade.domen;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import comtrade.konstante.Konstante;

public class Grupa implements OpstiDomen,Serializable,Konstante{

	int idGrupe;
	String nazivGrupe;
	int idKorisnika;
	int idUlaska;
	public Grupa(int idKorisnika,int idGrupe, int idUlaska) {
		super();
		this.idGrupe = idGrupe;
		this.idKorisnika = idKorisnika;
		this.idUlaska = idUlaska;
	}
	public int getIdUlaska() {
		return idUlaska;
	}
	public void setIdUlaska(int idUlaska) {
		this.idUlaska = idUlaska;
	}
	public Grupa(int idGrupe, int idKorisnika) {
		super();
		this.idGrupe = idGrupe;
		this.idKorisnika = idKorisnika;
	}
	public int getIdKorisnika() {
		return idKorisnika;
	}
	public void setIdKorisnika(int idKorisnika) {
		this.idKorisnika = idKorisnika;
	}
	public Grupa() {
		super();
	}
	public Grupa(int idGrupe, String nazivGrupe) {
		super();
		this.idGrupe = idGrupe;
		this.nazivGrupe = nazivGrupe;
	}
	public Grupa(String nazivGrupe) {
		this.nazivGrupe=nazivGrupe;
	}
	public Grupa(int idKorisnika) {
		this.idKorisnika=idKorisnika;
	}
	public int getIdGrupe() {
		return idGrupe;
	}
	public void setIdGrupe(int idGrupe) {
		this.idGrupe = idGrupe;
	}
	public String getNazivGrupe() {
		return nazivGrupe;
	}
	public void setNazivGrupe(String nazivGrupe) {
		this.nazivGrupe = nazivGrupe;
	}
	@Override
	public String vratiNazivTabele() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String vratiZaInsert() {
		// TODO Auto-generated method stub
		return "VALUES ('"+getNazivGrupe()+"')";
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
		List<OpstiDomen> listaGrupa= new ArrayList<>();
		while(rs.next()) {
			int idGrupe=rs.getInt("idGrupe");
			String nazivGrupe=rs.getString("nazivGrupe");
			Grupa grupa= new Grupa(idGrupe, nazivGrupe);
			listaGrupa.add(grupa);
		}
		return listaGrupa;
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
	public String dodajUGrupu() {
		
		return "('"+getIdKorisnika()+"', '"+getIdGrupe()+"')";
	}
	public List<OpstiDomen> srediSelectZaMojeGrupe(ResultSet rs) throws SQLException {
		List<OpstiDomen> listaMojihGrupa= new ArrayList<>();
		while(rs.next()) {
			String nazivGrupe=rs.getString("nazivGrupe");
			int idGrupe=rs.getInt("idGrupe");
			Grupa grupa= new Grupa(idGrupe, nazivGrupe);
			listaMojihGrupa.add(grupa);
		}
		return listaMojihGrupa;
	}
	public int srediSelectPorukeGrupe(ResultSet rs) throws SQLException{
		int idMax=0;
		while(rs.next()) {			
			 idMax=rs.getInt("MAX(idGrupnaPoruka)");	
		}
		return idMax;
		
	}
	
}
