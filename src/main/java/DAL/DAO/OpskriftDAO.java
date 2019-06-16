package DAL.DAO;

import DAL.DTO.IOpskriftDTO;
import DAL.DTO.OpskriftDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OpskriftDAO implements IOpskriftDAO {
    public void createOpskrift(Connection connection, IOpskriftDTO opskriftDTO) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT into Opskrift values(?,?,?,?);");

            java.sql.Date sqlDate = new java.sql.Date(opskriftDTO.getDato().getTime());

            statement.setInt(1, opskriftDTO.getOpskriftID());
            statement.setString(2, opskriftDTO.getOpskriftNavn());
            statement.setDate(3, sqlDate);
            statement.setInt(4, opskriftDTO.getBrugerID());

            statement.execute();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public IOpskriftDTO getOpskrift(Connection connection, int ID) {
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM Ingrediens WHERE IngrediensID = ?;");

            statement.setInt(1, ID);

            ResultSet resultSet = statement.executeQuery();

            IOpskriftDTO opskriftDTO = null;

            while (resultSet.next()){
                opskriftDTO = new OpskriftDTO(resultSet.getInt(1), resultSet.getString(2), resultSet.getDate(3), resultSet.getInt(4));
            }

            return opskriftDTO;

        } catch (SQLException e){
            e.printStackTrace();
        }

        return null;
    }

    public void updateOpskrift(Connection connection, IOpskriftDTO opskriftDTO) {
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE Opskrift SET OpskriftID = ?, Opskriftnavn = ?, Dato = ?, BrugerID = ? WHERE OpskriftID = ?;");

            java.sql.Date sqlDate = new java.sql.Date(opskriftDTO.getDato().getTime());

            statement.setInt(1, opskriftDTO.getOpskriftID());
            statement.setString(2, opskriftDTO.getOpskriftNavn());
            statement.setDate(3, sqlDate);
            statement.setInt(4, opskriftDTO.getBrugerID());
            statement.setInt(5, opskriftDTO.getOpskriftID());

            statement.executeUpdate();

        } catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void deleteOpskrift(Connection connection, int ID) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE from Opskrift WHERE OpskriftID  = ?;");
            PreparedStatement ingrediens = connection.prepareStatement("DELETE FROM Ingrediens WHERE OpskriftID = ?;");

            ingrediens.setInt(1,ID);
            statement.setInt(1, ID);

            ingrediens.execute();
            statement.execute();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
