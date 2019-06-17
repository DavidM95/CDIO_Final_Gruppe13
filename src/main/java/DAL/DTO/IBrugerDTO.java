package DAL.DTO;


public interface IBrugerDTO {
    int getBrugerId();
    String getBrugerNavn();
    String getBrugerPassword();
    String getBrugerIni();
    String getRolle(int i);
    String[] getRolleliste();
}
