package DAL.DAO;

import DAL.DTO.IBrugerDTO;
import DAL.IDALException;

import java.util.List;

public interface IBrugerDAO {
    //Create
    void opretBruger(IBrugerDTO user) throws IDALException.DALException;
    //Read
    IBrugerDTO getBrugerId(int userId) throws IDALException.DALException;
    IBrugerDTO getBrugerPassword(int userId) throws IDALException.DALException;

    List<IBrugerDTO> getBrugerList() throws IDALException.DALException;
    //Update
    void updateBruger(IBrugerDTO user) throws IDALException.DALException;

}

