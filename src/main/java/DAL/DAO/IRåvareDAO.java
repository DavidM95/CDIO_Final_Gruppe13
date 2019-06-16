package DAL.DAO;

import DAL.DTO.IRåvareDTO;
import DAL.DTO.RåvareDTO;

import java.sql.Connection;

public interface IRåvareDAO {

    void createRåvare(Connection connection, IRåvareDTO råvareDTO);
    RåvareDTO getRåvare(Connection connection, int ID);
    void updateRåvare(Connection connection, IRåvareDTO råvareDTO);
    void deleteRåvare(Connection connection, int ID);
}
