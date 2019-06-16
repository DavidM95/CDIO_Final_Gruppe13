package DAL.DTO;

import java.util.List;

public interface IBrugerDTO {
    int getBrugerID();
    String getBrugernavn();
    Boolean getAdmin();
    String getRoller(int i);
    List getRolleliste();
}
