package DAL.DTO;

import java.util.ArrayList;
import java.util.List;

public class BrugerDTO implements IBrugerDTO {

    int brugerID;
    String brugernavn;
    ArrayList<String> roller;
    String brugerIni;
    String password;

    public BrugerDTO(int brugerID, String brugernavn, String brugerIni, ArrayList<String> roller, String password){

        this.brugerID = brugerID;
        this.brugernavn = brugernavn;
        this.roller = roller;
        this.brugerIni = brugerIni;
        this.password = password;

    }

    public void setRoller(ArrayList<String> roller) {
        this.roller = roller;
    }

    public void setBrugerIni(String brugerIni) {
        this.brugerIni = brugerIni;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getBrugerID() {
        return this.brugerID;
    }

    public String getBrugernavn() {
        return this.brugernavn;
    }

    public void setBrugerID(int brugerID) {
        this.brugerID = brugerID;
    }

    public void setBrugernavn(String brugernavn) {
        this.brugernavn = brugernavn;
    }

    public String getRoller(int i) {
        return this.roller.get(i);
    }

    public List getRolleliste() {return  this.roller;}

    @Override
    public String getBrugerIni() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getRoller() {
        return null;
    }

    @Override
    public String toString() {
        return "BrugerDTO{" +
                "brugerID=" + brugerID +
                ", brugernavn='" + brugernavn + '\'' +
                ", ini=" + brugerIni +
                ", roller=" + roller +
                '}';
    }
}
