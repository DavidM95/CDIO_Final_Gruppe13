package DAL.DAO;

import DAL.DTO.BrugerDTO;
import DAL.DTO.IBrugerDTO;

import java.sql.Connection;

public interface IBrugerDAO {

    void createBruger(Connection connection, IBrugerDTO brugerDTO);
    BrugerDTO getBruger(Connection connection, int ID);
    void updateBruger(Connection connection, IBrugerDTO brugerDTO);
    void deleteBruger(Connection connection, int ID);
}
