//package DAL.DTO;
//
//public class RåvareDTO implements IRåvareDTO{
//
//    int produktionsID;
//    int ingrediensID;
//    String råvarenavn;
//    int mængde;
//    boolean genbestilling;
//
//    public RåvareDTO(int produktionsID, int ingrediensID, String råvarenavn, int mængde, boolean genbestilling){
//
//        this.produktionsID = produktionsID;
//        this.ingrediensID = ingrediensID;
//        this.råvarenavn = råvarenavn;
//        this.genbestilling = genbestilling;
//    }
//
//
//    public int getProduktionsID() {
//        return this.produktionsID;
//    }
//
//    public int getIngrediensID() {
//        return this.ingrediensID;
//    }
//
//    public String getRåvarenavn() {
//        return this.råvarenavn;
//    }
//
//    public int getmængde() {
//        return this.mængde;
//    }
//
//    public boolean getGenbestilling() {
//        return this.genbestilling;
//    }
//
//    @Override
//    public String toString() {
//        return "RåvareDTO{" +
//                "produktionsID=" + produktionsID +
//                ", ingrediensID=" + ingrediensID +
//                ", råvarenavn='" + råvarenavn + '\'' +
//                ", mængde=" + mængde +
//                ", genbestilling=" + genbestilling +
//                '}';
//    }
//}