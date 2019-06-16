package DAL.DAO;

import DAL.DTO.IOpskriftDTO;

import java.sql.Connection;

public interface IOpskriftDAO {

    void createOpskrift(Connection connection, IOpskriftDTO opskriftDTO);
    IOpskriftDTO getOpskrift(Connection connection, int ID);
    void updateOpskrift(Connection connection, IOpskriftDTO opskriftDTO);
    void deleteOpskrift(Connection connection, int ID);
}
