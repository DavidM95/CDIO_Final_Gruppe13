package DAL.DTO;

import java.util.ArrayList;
import java.util.List;

public class BrugerDTO implements IBrugerDTO {

    int brugerID;
    String brugernavn;
    boolean admin;
    ArrayList<String> roller;

    public BrugerDTO(int brugerID, String brugernavn, boolean admin, ArrayList<String> roller){

        this.brugerID = brugerID;
        this.brugernavn = brugernavn;
        this.admin = admin;
        this.roller = roller;

    }

    public int getBrugerID() {
        return this.brugerID;
    }

    public String getBrugernavn() {
        return this.brugernavn;
    }

    public Boolean getAdmin() {
        return this.admin;
    }

    public String getRoller(int i) {
        return this.roller.get(i);
    }

    public List getRolleliste() {return  this.roller;}

    @Override
    public String toString() {
        return "BrugerDTO{" +
                "brugerID=" + brugerID +
                ", brugernavn='" + brugernavn + '\'' +
                ", admin=" + admin +
                ", roller=" + roller +
                '}';
    }
}
