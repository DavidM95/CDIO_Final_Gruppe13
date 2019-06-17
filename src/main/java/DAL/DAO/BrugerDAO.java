package DAL.DAO;

import DAL.DTO.BrugerDTO;
import DAL.DTO.IBrugerDTO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BrugerDAO implements IBrugerDAO {


    public void createBruger(Connection connection, IBrugerDTO brugerDTO) {
        try {
            PreparedStatement statement = connection.prepareStatement("INSERT INTO Bruger VALUES (?,?,?);");
            PreparedStatement roller = connection.prepareStatement("INSERT INTO Roller VALUES (?,?);");

            statement.setInt(1,brugerDTO.getBrugerId());
            statement.setString(2,brugerDTO.getBrugerNavn());
            statement.setBoolean(3,brugerDTO.getAdmin());
            statement.execute();

            roller.setInt(1,brugerDTO.getBrugerId());

            // Ved ikke om den bare overskriver den allerede gemte rolle. Skal lige testes.
            for(int i = 0; i < brugerDTO.getRolleliste().size(); i++){
                roller.setString(2, brugerDTO.getRoller(i));
                roller.execute();
            }


        } catch (SQLException e){e.printStackTrace();}
    }

    public BrugerDTO getBruger(Connection connection, int ID) {
        try {
            PreparedStatement statement = connection.prepareStatement("SELECT*FROM Bruger WHERE BrugerID = ?;");
            PreparedStatement roller = connection.prepareStatement("SELECT*FROM Roller WHERE BrugerID = ?;");

            statement.setInt(1,ID);

            roller.setInt(1,ID);

            ResultSet resultSetRoller = statement.executeQuery();

            ArrayList rolleliste = new ArrayList();
            int index = 0;
            while (resultSetRoller.next()){
                rolleliste.add(index,resultSetRoller.getString(index+1));
                index++;
            }

            ResultSet resultSet = statement.executeQuery();

            BrugerDTO brugerDTO = null;

            while(resultSet.next()){
                brugerDTO = new BrugerDTO(resultSet.getInt(1),resultSet.getString(2),resultSet.getBoolean(3),rolleliste);
            }

            return brugerDTO;

        } catch (SQLException e){e.printStackTrace();}

        return null;
    }

//    public void updateBruger(Connection connection, IBrugerDTO brugerDTO) {
//        try {
//            PreparedStatement statement = connection.prepareStatement("UPDATE Bruger SET Brugernavn = ?, Admin = ? WHERE BrugerID = ?;");
//            PreparedStatement roller = connection.prepareStatement("UPDATE Roller SET Rolle = ? WHERE BrugerID = ?;");
//
//            statement.setString(1,brugerDTO.getBrugerNavn());
//            statement.setBoolean(2,brugerDTO.getAdmin());
//            statement.setInt(3,brugerDTO.getBrugerId());
//            statement.executeUpdate();
//
//            //Ved ikke om den overskriver den allerede gemte rolle. Skal lige testes.
//            for(int i = 0; i < brugerDTO.getRolleliste().size(); i++){
//                roller.setString(1,brugerDTO.getRoller(i));
//                roller.setInt(2, brugerDTO.getBrugerId());
//                roller.executeUpdate();
//            }
//
//
//        } catch (SQLException e){e.printStackTrace();}
//    }
//
//    public void deleteBruger(Connection connection, int ID) {
//        try {
//            PreparedStatement statement = connection.prepareStatement("DELETE FROM Bruger WHERE BrugerID = ?;");
//            PreparedStatement roller = connection.prepareStatement("DELETE FROM Roller WHERE BrugerID = ?;");
//
//            roller.setInt(1,ID);
//            roller.execute();
//
//            statement.setInt(1,ID);
//            statement.execute();
//
//
//        } catch (SQLException e){e.printStackTrace();}
//    }
}
