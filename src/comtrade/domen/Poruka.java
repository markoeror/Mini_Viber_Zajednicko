package comtrade.domen;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import comtrade.konstante.Konstante;

public class Poruka implements Serializable,OpstiDomen,Konstante{
	public Poruka(int idPosiljaoca, int idPrimaoca, int statusPoruke) {
		super();
		this.idPosiljaoca = idPosiljaoca;
		this.idPrimaoca = idPrimaoca;
		this.statusPoruke = statusPoruke;
	}

	private int idPosiljaoca; //idKorisnika
	private int idPrimaoca;	//idPrijatelja
	private String p;
	private Korisnik k;
	private int statusPoruke;
	
	public Poruka(int idPosiljaoca, int idPrimaoca, String p, int statusPoruke) {
		super();
		this.idPosiljaoca = idPosiljaoca;
		this.idPrimaoca = idPrimaoca;
		this.p = p;
		this.statusPoruke = statusPoruke;
	}

	public int getStatusPoruke() {
		return statusPoruke;
	}

	public void setStatusPoruke(int statusPoruke) {
		this.statusPoruke = statusPoruke;
	}

	public Poruka(String poruka, Korisnik k) {
		super();
		this.p = p;
		this.k = k;
	}
	
	public Poruka(int idPosiljaoca, int idPrimaoca, String p) {
		super();
		this.idPosiljaoca = idPosiljaoca;
		this.idPrimaoca = idPrimaoca;
		this.p = p;
	}



	public Poruka() {
		// TODO Auto-generated constructor stub
	}

	public Poruka(int idPosiljaoca, int idPrimaoca) {
		this.idPosiljaoca = idPosiljaoca;
		this.idPrimaoca = idPrimaoca;
	}

	public String getP() {
		return p;
	}

	public void setP(String p) {
		this.p = p;
		
	}

	public int getIdPosiljaoca() {
		return idPosiljaoca;
	}

	public void setIdPosiljaoca(int idPosiljaoca) {
		this.idPosiljaoca = idPosiljaoca;
	}

	public int getIdPrimaoca() {
		return idPrimaoca;
	}

	public void setIdPrimaoca(int idPrimaoca) {
		this.idPrimaoca = idPrimaoca;
	}

	public Korisnik getK() {
		return k;
	}

	

	public void setK(Korisnik k) {
		this.k = k;
	}

	
	
	@Override
	public String vratiNazivTabele() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String vratiZaInsert() {
		
		return "('"+getIdPosiljaoca()+"','"+getP()+"','"+getIdPrimaoca()+"','"+getStatusPoruke()+"')";
	}

	@Override
	public String vratiZaUpdate(OpstiDomen od) {
		//idKorisnika='"+getIdPosiljaoca()+"' and idPrimaoca='"+getIdPrimaoca()+"' or 
		return "idPrimaoca='"+getIdPosiljaoca()+"' and idKorisnika='"+getIdPrimaoca()+"'";
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

	public String vratiZaPoruke() {
		// TODO Auto-generated method stub
		return "'"+getIdPosiljaoca()+"' OR idPrimaoca='"+getIdPosiljaoca()+"'";
	}

	public List<OpstiDomen> srediListuPoruka(ResultSet rs) throws SQLException {
		List<OpstiDomen> listaPoruka=new ArrayList<>();
		while(rs.next()) {
			int idKorisnika=rs.getInt("idKorisnika");
			int idPrimaoca=rs.getInt("idPrimaoca");
			String p=rs.getString("poruka");		
			Poruka poruka= new Poruka(idKorisnika, idPrimaoca, p);
			listaPoruka.add(poruka);
			
		}
		return listaPoruka;
	
	}

	public String vratiZaNeprimljenePoruke() {
	
		return "idKorisnika='"+getIdPosiljaoca()+"' and idPrimaoca='"+getIdPrimaoca()+"' and status_poruke='"+getStatusPoruke()+"' or idPrimaoca='"+getIdPosiljaoca()+"' and idKorisnika='"+getIdPrimaoca()+"' and status_poruke='"+getStatusPoruke()+"'";
				
	}

	
	
	
}
