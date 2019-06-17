package Controllers;
import DAL.DAO.IRåvareDAO;
import DAL.DTO.IRåvareDTO;
import  DAL.DTO.RåvareDTO;
import DAL.IDALException
import java.sql.Connection;

public class RåvarerCTRL implements IRåvareDAO {

    @Override
    public void createRåvare(Connection connection, IRåvareDTO råvareDTO) {

    }

    @Override
    public RåvareDTO getRåvare(Connection connection, int ID) {
        return null;
    }

    @Override
    public void updateRåvare(Connection connection, IRåvareDTO råvareDTO) {

    }

    @Override
    public void deleteRåvare(Connection connection, int ID) {

    }
}
}

