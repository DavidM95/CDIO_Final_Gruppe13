package Controllers;

import DAL.DAO.IReceptDAO;
import DAL.DAO.ReceptDAO;
import DAL.DTO.

public class ReceptCTRL {

    public boolean ReceptIdCheck(int receptId){
        IReceptDAO receptDAO = new ReceptDAO();
        IReceptDTO receptDTO = receptDAO.getRecept(receptId);
        if (receptDTO.getReceptId() == receptId){
            return true;
        }else return false;
    }

}
