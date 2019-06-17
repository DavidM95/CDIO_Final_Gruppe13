package DAL.DTO;

import java.util.List;

public interface IBrugerDTO {
    int getBrugerId();
    String getBrugerNavn();
    String getBrugerPassword();
    String getBrugerIni();
    String getRoller(int i);
    List getRolleliste();
}
