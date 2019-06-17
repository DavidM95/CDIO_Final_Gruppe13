package DAL.DTO;


public class BrugerDTO implements IBrugerDTO {

    private int brugerId;
    private String brugerNavn;
    private  String brugerPassword;
    private String brugerIni;
     private String rolle[];

    public BrugerDTO(int brugerId, String brugerNavn, String brugerPassword,String brugerIni, String []rolle){

        this.brugerId = brugerId;
        this.brugerNavn = brugerNavn;
        this.brugerPassword = brugerPassword;
        this.brugerIni = brugerIni;
        this.rolle = rolle;
    }

    public BrugerDTO(){

    }
    @Override
    public int getBrugerId() {
        return this.brugerId;
    }
    @Override
    public String getBrugerNavn() {
        return this.brugerNavn;
    }
    @Override
    public String getBrugerPassword() {
        return this.brugerPassword;
    }
    @Override
    public String getBrugerIni(){return  this.brugerIni;}

    @Override
    public String getRolle(int i) { return this.getRolle(i); }

    @Override
    public String[] getRolleliste() { return new String[0]; }


    @Override
    public String toString() {
        return "BrugerDTO{" +
                "brugerId=" + brugerId +
                ", brugerNavn='" + brugerNavn + '\'' +
                ", brugerPassword=" + brugerPassword +
                ", brugerRolle=" + rolle +
                '}';
    }
}
