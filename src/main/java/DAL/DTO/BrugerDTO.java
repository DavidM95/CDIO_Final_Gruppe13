package DAL.DTO;

import java.util.ArrayList;
import java.util.List;

public class BrugerDTO implements IBrugerDTO {

    int brugerId;
    String brugerNavn;
    String brugerPassword;
    String brugerIni;
    ArrayList<String> roller;

    public BrugerDTO(int brugerId, String brugerNavn, String brugerPassword,String brugerIni){

        this.brugerId = brugerId;
        this.brugerNavn = brugerNavn;
        this.brugerPassword = brugerPassword;
        this.brugerIni = brugerIni;
        this.roller = roller;

    }

    public int getBrugerId() {
        return this.brugerId;
    }

    public String getBrugerNavn() {
        return this.brugerNavn;
    }

    public String getBrugerPassword() {
        return this.brugerPassword;
    }

    public String getBrugerIni(){return  this.brugerIni;}

    public String getRoller(int i) {
        return this.roller.get(i);
    }

    public List getRolleliste() {return  this.roller;}

    @Override
    public String toString() {
        return "BrugerDTO{" +
                "brugerId=" + brugerId +
                ", brugerNavn='" + brugerNavn + '\'' +
                ", brugerPassword=" + brugerPassword +
                ", roller=" + roller +
                '}';
    }
}
