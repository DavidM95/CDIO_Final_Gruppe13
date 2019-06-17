package DAL.DTO;

import java.util.Date;

public class OpskriftDTO implements IOpskriftDTO {

    int opskriftID;
    String opskriftnavn;
    Date dato;
    int brugerID;

    public OpskriftDTO(int opskriftID, String opskriftnavn, Date date, int brugerID){

        this.opskriftID = opskriftID;
        this.opskriftnavn = opskriftnavn;
        this.dato = date;
        this.brugerID = brugerID;

    }

    public int getOpskriftID() {
        return this.opskriftID;
    }

    public String getOpskriftNavn() {
        return this.opskriftnavn;
    }

    public Date getDato() {
        return this.dato;
    }

    public int getBrugerID() {
        return this.brugerID;
    }

    @Override
    public String toString() {
        return "OpskriftDTO{" +
                "opskriftID=" + opskriftID +
                ", opskriftnavn='" + opskriftnavn + '\'' +
                ", dato=" + dato +
                ", brugerId=" + brugerID +
                '}';
    }
}
