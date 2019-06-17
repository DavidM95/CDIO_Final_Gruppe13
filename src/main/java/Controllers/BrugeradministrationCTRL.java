package Controllers;


import DAL.DAO.IBrugerDAO;
import DAL.DTO.BrugerDTO;
import DAL.DTO.IBrugerDTO;
import DAL.IDALException;

public class BrugeradministrationCTRL implements IBrugerDAO{

    public boolean BrugerIdCheck(int brugerId) throws IDALException.DALException {
        if (iBrugerDAO.getBrugerId(brugerId) == brugerId) { //TODO få IBrugerDAO.getBruger til at virke
            return true;
        } else {
            return false;
        }
    }

    public boolean LoginChecker(int brugerId, String brugerPassword) {
        if (BrugerIdCheck(brugerId) && iBrugerDAO.getBrugerPassword.equals(brugerPassword)) {
            return true;
        } else return false; //TODO Implemnter besked om at brugerId og password ike passede sammen

    }

    public void opretBruger(int brugerId, String brugerNavn, String brugerIni, String brugerPassword) throws IDALException.DALException {

        if (!BrugerIdCheck(brugerId)) {
            IBrugerDAO.opretBruger(brugerId, brugerNavn, brugerIni, brugerPassword); //TODO få IBrugerDAO til at virke
        }
    }

    public void retBruger(int brugerId, String brugerNavn, String brugerIni, String brugerPassword) { //TODO tilføj roller som en variable
        if (BrugerIdCheck(brugerId)) {
            IBrugerDAO.retBruger(brugerId, brugerNavn, brugerIni, brugerPassword);
        }
    }

    public BrugerDTO seBruger(int brugerId) {
        if (BrugerIdCheck(brugerId)) {
            BrugerDTO Bruger = new BrugerDTO(IBrugerDAO.getBruger(brugerId)); // TODO få DAO til at virke
            return Bruger;
        }else return null; //TODO tilføj fejlbesked ved ugyldigt ID
    }

    public SletBruger(int brugerId){
        IBrugerDAO.sletBruger(brugerId);
        //TODO send besked tilbage med bekræftelse
    }
}
