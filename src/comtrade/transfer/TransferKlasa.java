package comtrade.transfer;

import java.io.Serializable;

public class TransferKlasa implements Serializable{

	private int operacija; // operacija koja ce znaciti nesto
	private Object klijentObjekat;// objekat koji salje klijent, u ovom slucaju knjiga
	private Object server_ObjekatOdgovor;// objekat koji vraca server
	private String serverPoruka_odgovor;// string poruka koju vraca server
	private int serverPoruka_odgovorInt;
	private int serverPoruka_odgovorId;
	public int getOperacija() {
		return operacija;
	}
	public void setOperacija(int operacija) {
		this.operacija = operacija;
	}
	public Object getKlijentObjekat() {
		return klijentObjekat;
	}
	public void setKlijentObjekat(Object klijentObjekat) {
		this.klijentObjekat = klijentObjekat;
	}
	public Object getServer_ObjekatOdgovor() {
		return server_ObjekatOdgovor;
	}
	public void setServer_ObjekatOdgovor(Object server_ObjekatOdgovor) {
		this.server_ObjekatOdgovor = server_ObjekatOdgovor;
	}
	public String getServerPoruka_odgovor() {
		return serverPoruka_odgovor;
	}
	public void setServerPoruka_odgovor(String serverPoruka_odgovor) {
		this.serverPoruka_odgovor = serverPoruka_odgovor;
	}
	public int getServerPoruka_odgovorInt() {
		return serverPoruka_odgovorInt;
	}
	public void setServerPoruka_odgovorInt(int serverPoruka_odgovorInt) {
		this.serverPoruka_odgovorInt = serverPoruka_odgovorInt;
	}
	public int getServerPoruka_odgovorId() {
		return serverPoruka_odgovorId;
	}
	public void setServerPoruka_odgovorId(int serverPoruka_odgovorId) {
		this.serverPoruka_odgovorId = serverPoruka_odgovorId;
	}
	
}
