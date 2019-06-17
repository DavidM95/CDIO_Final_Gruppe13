package Controllers;


import DAL.DAO.IBrugerDAO;
import DAL.IDALException;

public class BrugeradministrationCTRL {

    public boolean BrugerIdCheck(int brugerId,) throws IDALException.DALException {
        if (iBrugerDAO.getBrugerId(brugerId) == brugerId) { //TODO få IBrugerDAO.getBruger til at virke
            return true;
        }
        else {
            return false;
        }
    }

    public boolean LoginChecker(int brugerId, String brugerPassword){
        if (BrugerIdCheck(brugerId) && iBrugerDAO.getBrugerPassword.equals(brugerPassword)){
            return true;
        }else return false;

    }
    public void opretBruger(int brugerId, String brugerNavn, String brugerIni, String brugerPassword) {

        if (!BrugerIdCheck(brugerId)){
            IBrugerDAO.opretBruger(brugerId,brugerNavn,brugerIni,brugerPassword); //TODO få IBrugerDAO til at virke
        }
    }

    public void retBruger(int brugerId, String brugerNavn, String brugerIni, String brugerPassword){ //TODO tilføj roller som en variable

    }
}
