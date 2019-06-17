package DAL.DTO;

import java.util.List;

public interface IBrugerDTO {
    int getBrugerID();
    String getBrugerNavn();
    String getRoller(int i);
    List getRolleliste();
    String getBrugerIni();
    String getPassword();


}
