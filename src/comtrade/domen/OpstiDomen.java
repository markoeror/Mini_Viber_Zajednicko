package comtrade.domen;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLPermission;
import java.util.List;



public interface OpstiDomen {

	public String vratiNazivTabele();
	public String vratiZaInsert();
	public String vratiZaUpdate(OpstiDomen od);
	public String vratiZaDelete(OpstiDomen od);
	public List<OpstiDomen> srediSelect(ResultSet rs) throws SQLException;
	public String vratiZaSelect();
	public String vratiZaZahtevPrijateljstva();
	public List<OpstiDomen> srediSelectZahteva(ResultSet rs)  throws SQLException;
	public String vratiZaUpdateZahteva(OpstiDomen k);
	
}
