package DAL.DTO;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

public class ReceptDTO implements IReceptDTO {

    int receptId;
    String receptNavn;
//    Arraylist<> ReceptKomponent;

    public ReceptDTO(int receptId, String receptNavn){

        this.receptId = receptId;
        this.receptNavn = receptNavn;

    }

    public int getReceptId() {
        return this.receptId;
    }

    public String getReceptNavn() {
        return this.receptNavn;
    }

    @Override
    public String toString() {
        return "ReceptDTO{" +
                "receptId=" + receptId +
                ", receptNavn='" + receptNavn + '\'' +
                '}';
    }

}
