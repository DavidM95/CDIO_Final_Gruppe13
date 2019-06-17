package DAL.DAO;

import DAL.DTO.BrugerDTO;
import DAL.DTO.IBrugerDTO;
import DAL.IConnect;
import DAL.IDALException;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BrugerDAO implements IBrugerDAO, IConnect {


    public void createBruger(IBrugerDTO brugerDTO) throws SQLException {
        createConnection();
        Connection connection = getConnection();
        try {

            PreparedStatement statement = connection.prepareStatement("INSERT INTO Bruger VALUES (?,?,?,?);");
            PreparedStatement roller = connection.prepareStatement("INSERT INTO Roller(brugerId, rolle) VALUES (?,?);");

            statement.setInt(1,brugerDTO.getBrugerID());
            statement.setString(2,brugerDTO.getBrugerNavn());
            statement.setString(3,brugerDTO.getBrugerIni());
            statement.setString(4,brugerDTO.getPassword());

            statement.execute();

            roller.setInt(1,brugerDTO.getBrugerID());

            // Ved ikke om den bare overskriver den allerede gemte rolle. Skal lige testes.
            for(int i = 0; i < brugerDTO.getRolleliste().size(); i++){
                roller.setString(2, brugerDTO.getRoller(i));
                roller.execute();
            }


        } catch (SQLException e){e.printStackTrace();}
        closeConnection();
    }

    @Override
    public void opretBruger(IBrugerDTO user) throws IDALException.DALException {

    }

    @Override
    public IBrugerDTO getBrugerId(int userId) throws IDALException.DALException {
        return null;
    }

    @Override
    public IBrugerDTO getBrugerPassword(int userId) throws IDALException.DALException {
        return null;
    }

    public BrugerDTO getBruger(int ID) throws SQLException {
        createConnection();
        Connection connection = getConnection();
        try {

            PreparedStatement statement = connection.prepareStatement("SELECT*FROM Bruger WHERE BrugerID = ?;");
            PreparedStatement roller = connection.prepareStatement("SELECT*FROM Roller WHERE BrugerID = ?;");

            statement.setInt(1,ID);

            roller.setInt(1,ID);

            ResultSet resultSet = statement.executeQuery();
            System.out.println(resultSet);
            ResultSet resultSetRoller = roller.executeQuery();
            System.out.println(resultSetRoller);

            ArrayList rolleliste = new ArrayList();
            int index = 0;
            while (resultSetRoller.next()){
                rolleliste.add(index,resultSetRoller.getString(index+1));
                index++;
            }

            BrugerDTO brugerDTO = null;

            while(resultSet.next()) {
                IBrugerDTO user = new BrugerDTO(resultSet.getInt("brugerId"), resultSet.getString("brugerNavn"), resultSet.getString("ini"), rolleliste, resultSet.getString("password"));
            return (BrugerDTO) user;
            }
            resultSet.close();
//            while(resultSet.next()){
//                brugerDTO = new BrugerDTO(resultSet.getInt("brugerId"), resultSet.getString("brugerNavn"), resultSet.getString("brugerIni"), rolleliste, resultSet.getString("password"));
//            }
        } catch (SQLException e){e.printStackTrace();}
        closeConnection();
        return null;
    }

    @Override
    public List<IBrugerDTO> getBrugerList() throws IDALException.DALException {
        return null;
    }


    public void retBruger(IBrugerDTO brugerDTO) throws SQLException {
        createConnection();
        Connection connection = getConnection();
        try {
            PreparedStatement statement = connection.prepareStatement("UPDATE Bruger SET brugerNavn = ?, ini = ?, password = ? WHERE BrugerID = ?;");
            PreparedStatement roller = connection.prepareStatement("UPDATE Roller SET rolle = ? WHERE BrugerID = ?;");

            statement.setString(1,brugerDTO.getBrugerNavn());
            statement.setString(2,brugerDTO.getBrugerIni());
            statement.setString(3,brugerDTO.getPassword());
            statement.setInt(4,brugerDTO.getBrugerID());
            statement.executeUpdate();

            //Ved ikke om den overskriver den allerede gemte rolle. Skal lige testes.
            for(int i = 0; i < brugerDTO.getRolleliste().size(); i++){
                roller.setString(1,brugerDTO.getRoller(i));
                roller.setInt(2, brugerDTO.getBrugerID());
                roller.executeUpdate();
            }


        } catch (SQLException e){e.printStackTrace();}
        closeConnection();
    }

    public void deleteBruger(Connection connection, int ID) {
        try {
            PreparedStatement statement = connection.prepareStatement("DELETE * FROM Bruger WHERE BrugerID = ?;");
            PreparedStatement roller = connection.prepareStatement("DELETE * FROM Roller WHERE BrugerID = ?;");

            roller.setInt(1,ID);
            roller.execute();

            statement.setInt(1,ID);
            statement.execute();


        } catch (SQLException e){e.printStackTrace();}
    }


    @Override
    public void createConnection() throws SQLException {

    }

    @Override
    public Connection getConnection() {
        return null;
    }

    @Override
    public void closeConnection() throws SQLException {

    }
}
