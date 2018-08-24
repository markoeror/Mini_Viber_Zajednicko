package comtrade.domen;

import java.io.Serializable;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import comtrade.konstante.Konstante;



public class Korisnik implements Serializable, OpstiDomen, Konstante{

	private int idKorisnika;
	private String ime;
	private String prezime;
	private String korisnickoIme;
	private String sifra;
	private String datumRodjenja;
	private int pravaPristupa;
	private String email;
	private String lokacija;
	public String getLokacija() {
		return lokacija;
	}
	public void setLokacija(String lokacija) {
		this.lokacija = lokacija;
	}
	private String OMeni;
	//private int idPosiljaoca=idKorisnika;
	private int idPrimaoca;
	private int vrstaPrijateljstva;
	private String red;
	
	
	public String getRed() {
		return red;
	}
	public void setRed(String red) {
		this.red = red;
	}
	private List<Korisnik> listaKorisnika= new ArrayList<>();
	//private List<Korisnik>listaPrijateljstava= new ArrayList<>();
	
	public List<Korisnik> getListaKorisnika() {
		return listaKorisnika;
	}
	public Korisnik(String ime, String prezime, String korisnickoIme, String sifra, String datumRodjenja, String email,
			String oMeni) {
		super();
		this.ime = ime;
		this.prezime = prezime;
		this.korisnickoIme = korisnickoIme;
		this.sifra = sifra;
		this.datumRodjenja = datumRodjenja;
		this.email = email;
		OMeni = oMeni;
	}
	public void setListaKorisnika(List<Korisnik> listaKorisnika) {
		this.listaKorisnika = listaKorisnika;
	}
/*	public List<Korisnik> listaPrijateljstava() {
		return listaPrijateljstava;
	}
	public void setListaZahtevaKorisnika(List<Korisnik> listaPrijateljstava) {
		this.listaPrijateljstava = listaPrijateljstava;
	}*/
	public int getIdKorisnika() {
		return idKorisnika;
	}
	public void setIdKorisnika(int idKorisnika) {
		this.idKorisnika = idKorisnika;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public String getKorisnickoIme() {
		return korisnickoIme;
	}
	public void setKorisnickoIme(String korisnickoIme) {
		this.korisnickoIme = korisnickoIme;
	}
	public String getSifra() {
		return sifra;
	}
	public void setSifra(String sifra) {
		this.sifra = sifra;
	}
	public String getDatumRodjenja() {
		return datumRodjenja;
	}
	public void setDatumRodjenja(String datumRodjenja) {
		this.datumRodjenja = datumRodjenja;
	}
	public int getPravaPristupa() {
		return pravaPristupa;
	}
	public void setPravaPristupa(int pravaPristupa) {
		this.pravaPristupa = pravaPristupa;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getOMeni() {
		return OMeni;
	}
	public void setOMeni(String oMeni) {
		OMeni = oMeni;
	}
	public int getIdPosiljaoca() {
		return idKorisnika;
	}
	
	public int getIdPrimaoca() {
		return idPrimaoca;
	}
	public void setIdPrimaoca(int idPrimaoca) {
		this.idPrimaoca = idPrimaoca;
	}
	public int getVrstaPrijateljstva() {
		return vrstaPrijateljstva;
	}
	public void setVrstaPrijateljstva(int vrstaPrijateljstva) {
		this.vrstaPrijateljstva = vrstaPrijateljstva;
	}
	@Override
	public String vratiNazivTabele() {
		// TODO Auto-generated method stub
		return "`korisnik`(`ime`, `prezime`, `korisnickoIme`, `sifra`, `datumRodjenja`, `pravaPristupa`, `email`)";
	}
	@Override
	public String vratiZaInsert() {
		// TODO Auto-generated method stub
		return "VALUES ('"+getIme()+"','"+getPrezime()+"','"+getKorisnickoIme()+"','"+getSifra()+"','"+getDatumRodjenja()+"','"+getPravaPristupa()+"','"+getEmail()+"')";
	}
	@Override
	public String vratiZaUpdate(OpstiDomen od) {
	
		return "`korisnik` SET `ime` = '"+getIme()+"', `prezime` = '"+getPrezime()+"',"
				+ " `korisnickoIme` = '"+getKorisnickoIme()+"', `sifra` = '"+getSifra()+"',"
						+ " `datumRodjenja` = '"+getDatumRodjenja()+"',"+ " `email` = '"+getEmail()+"',"
								+ " `OMeni` = '"+getOMeni()+"' WHERE `korisnik`.`idKorisnika` = '"+getIdKorisnika()+"'";
	}
	
	@Override
	public String vratiZaUpdateZahteva(OpstiDomen k) {
		// TODO Auto-generated method stub
		return "`listaprijatelja` SET `idKorisnika` = '"+getIdPosiljaoca()+"', `idPrijatelja` = '"+getIdPrimaoca()+"', `vrstaPrijateljstva` = '20' WHERE"
				+ " `listaprijatelja`.`idKorisnika` = '"+getIdPosiljaoca()+"' AND `listaprijatelja`.`idPrijatelja` = '"+getIdPrimaoca()+"'";
	}
	@Override
	public String vratiZaDelete(OpstiDomen od) {
		
		return "DELETE FROM `korisnik` WHERE korisnik.idKorisnika='"+getIdKorisnika()+"'";
	}
	
	public String obrisiPrijatelja(Korisnik korObrPrijatelja) {
		
		return " and idPrijatelja = '"+getIdPrimaoca()+"' OR idKorisnika= '"+getIdPrimaoca()+"' and idPrijatelja= '"+getIdKorisnika()+"'";
	}
	@Override
	public List<OpstiDomen> srediSelect(ResultSet rs) throws SQLException {
		List<OpstiDomen> lista= new ArrayList<>();
		while(rs.next()) {
			int idKorisnika=rs.getInt("idKorisnika");
			String ime=rs.getString("ime");
			String prezime=rs.getString("prezime");
			String korisnickoIme=rs.getString("korisnickoIme");
			String sifra=rs.getString("sifra");	
			String datumRodjenja=rs.getString("datumRodjenja");
			int pravaPristupa= rs.getShort("pravaPristupa");
			String email=rs.getString("email");
			String OMeni=rs.getString("OMeni");
			
			Korisnik korisnik= new Korisnik(idKorisnika, ime, prezime, korisnickoIme, sifra, datumRodjenja, pravaPristupa, email,OMeni);
			lista.add(korisnik);
		}
		return lista;
	}
	
	@Override
	public List<OpstiDomen> srediSelectZahteva(ResultSet rs) throws SQLException {
		List<OpstiDomen> listaZahteva=new ArrayList<>();
		while(rs.next()) {
			int idKorisnika=rs.getInt("idKorisnika");
			int idPrijatelja=rs.getInt("idPrijatelja");
			int	vrstaPrijateljstva=rs.getInt("vrstaPrijateljstva");		
			Korisnik zahtev= new Korisnik(idKorisnika, idPrijatelja, vrstaPrijateljstva);
			listaZahteva.add(zahtev);
			
		}
		return listaZahteva;
	}
public List<OpstiDomen> srediListuPrijatelja(ResultSet rs) throws SQLException {
	List<OpstiDomen> listaPrijatelja= new ArrayList<>();
	while(rs.next()) {
		
		int idKorisnika= rs.getInt("idKorisnika");
		String ime= rs.getString("ime");
		String prezime= rs.getString("prezime");
		String korisnickoIme= rs.getString("korisnickoIme");
		Korisnik prijatelj= new Korisnik(idKorisnika,ime,prezime,korisnickoIme);
		System.out.println(ime+"   "+prezime);
		listaPrijatelja.add(prijatelj);
	}
	
		return listaPrijatelja;
	}
	
	@Override
	public String vratiZaSelect() {
		
		return "korisnik";
	}
	@Override
	public String vratiZaZahtevPrijateljstva() {
	
		return "VALUES ('"+getIdPosiljaoca()+"','"+getIdPrimaoca()+"','"+getVrstaPrijateljstva()+"')";
	}
	public String srediZaPrijatelje() {
		System.out.println("Idevi prijatelja su "+red);
		return "+getRed()+";
	}
	
	
	public Korisnik(String korisnickoIme, String sifra) {
		super();
		this.korisnickoIme = korisnickoIme;
		this.sifra = sifra;
	}
	

	public Korisnik(int idKorisnika, String ime, String prezime, String korisnickoIme, String sifra,
			String datumRodjenja, int pravaPristupa, String email) {
		super();
		this.idKorisnika = idKorisnika;
		this.ime = ime;
		this.prezime = prezime;
		this.korisnickoIme = korisnickoIme;
		this.sifra = sifra;
		this.datumRodjenja = datumRodjenja;
		this.pravaPristupa = pravaPristupa;
		this.email = email;
	}

	public Korisnik(String ime1, String prezime1, String korisnickoIme1, String sifra1, String datumrodjenja1, int pravaPristupa1, String email1) {
		super();
		this.ime=ime1;
		this.prezime=prezime1;
		this.korisnickoIme=korisnickoIme1;
		this.sifra=sifra1;
		this.datumRodjenja=datumrodjenja1;
		this.pravaPristupa=pravaPristupa1;
		this.email=email1;
	}



	public Korisnik(int idKorisnika2) {
		this.idKorisnika=idKorisnika2;
	}



	public Korisnik(int idKorisnika2, String ime4, String prezime4, String korisnickoIme4, String sifra4,
			String datumRodjenja4, String email4, String oMeni4) {
		this.idKorisnika=idKorisnika2;
		this.ime=ime4;
		this.prezime=prezime4;
		this.korisnickoIme=korisnickoIme4;
		this.sifra=sifra4;
		this.datumRodjenja=datumRodjenja4;
		this.email=email4;
		this.OMeni=oMeni4;
		
		
	}



	public Korisnik(int idKorisnika, int idPrimaoca) {
		this.idKorisnika=idKorisnika;
		this.idPrimaoca=idPrimaoca;
	}



	public Korisnik(int idKorisnika, int idPrimaoca, int vrstaPrijateljstva) {
		this.idKorisnika=idKorisnika;
		this.idPrimaoca=idPrimaoca;
		this.vrstaPrijateljstva=vrstaPrijateljstva;
	}



	public Korisnik(String ime4, String prezime4, String korisnickoIme4, String datumRodjenja4, String oMeni4) {
		this.ime=ime4;
		this.prezime=prezime4;
		this.korisnickoIme=korisnickoIme4;
		this.datumRodjenja=datumRodjenja4;
		this.OMeni=oMeni4;
	}
	
	public Korisnik(int idKorisnika, String ime, String prezime, String korisnickoIme, String sifra,
			String datumRodjenja, int pravaPristupa, String email, String oMeni) {
		super();
		this.idKorisnika = idKorisnika;
		this.ime = ime;
		this.prezime = prezime;
		this.korisnickoIme = korisnickoIme;
		this.sifra = sifra;
		this.datumRodjenja = datumRodjenja;
		this.pravaPristupa = pravaPristupa;
		this.email = email;
		this.OMeni = oMeni;
	}
	public Korisnik() {
		super();
	}
	public Korisnik(String ime2, String prezime2, String korisnickoIme2) {
		this.ime=ime2;
		this.prezime=korisnickoIme2;
		this.korisnickoIme=korisnickoIme2;
	}
	public Korisnik(int idKorisnika, String ime, String prezime, String korisnickoIme) {
		this.idKorisnika=idKorisnika;
		this.ime=ime;
		this.prezime=prezime;
		this.korisnickoIme=korisnickoIme;
	}
	public Korisnik(String red) {
		this.red=red;
	}
	public Korisnik(int idKorisnika2, String lokacija) {
		this.idKorisnika=idKorisnika2;
		this.lokacija=lokacija;
	}
	public String vratiZaPoruke() {
		// TODO Auto-generated method stub
		return "idKorisnika='"+getIdKorisnika()+"' AND idPrimaoca='"+getIdPrimaoca()+"' or idPrimaoca='"+getIdKorisnika()+"' and idKorisnika='"+getIdPrimaoca()+"'";
	}
	public List<OpstiDomen> srediListuPoruka(ResultSet rs) throws SQLException {
		List<OpstiDomen> listaPoruka=new ArrayList<>();
		while(rs.next()) {
			int idKorisnika=rs.getInt("idKorisnika");
			int idPrimaoca=rs.getInt("idPrimaoca");
			String	poruka =rs.getString("poruka");		
			Poruka lp= new Poruka(idKorisnika, idPrimaoca, poruka);
			listaPoruka.add(lp);
		}
		return listaPoruka;

	}
	
	
	
	
	
	
	
	

}
