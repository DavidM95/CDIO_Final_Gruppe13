package DAL.DTO;

import java.util.List;

public interface IBrugerDTO {
    int getBrugerID();
    String getBrugernavn();
    String getRoller(int i);
    List getRolleliste();
    String getBrugerIni();
    String getPassword();

    String getRoller();
}
