//package Controllers;
//
//
//import DAL.DAO.IBrugerDAO;
//import DAL.IDALException;
//
//public class BrugeradministrationCTRL {
//
//    public boolean BrugerIdCheck(int brugerId,IBrugerDAO iBrugerDAO) throws IDALException.DALException {
//        if (iBrugerDAO.getBrugerId(brugerId)!= null) {
//            return true;
//        }
//        else {
//            return false;
//        }
//    }
//
//    public boolean LoginChecker(int brugerId, String brugerPassword,IBrugerDAO iBrugerDAO){
//        if (BrugerIdCheck(brugerId){
//
//        }
//    }
//    public void opretBruger(int brugerId, String brugerNavn, String brugerIni, String brugerPassword) {
//
//        if (!BrugerIdCheck(brugerId)){
//            IBrugerDAO.opretBruger(brugerId,brugerNavn,brugerIni,brugerPassword);
//        }
//    }
//}
