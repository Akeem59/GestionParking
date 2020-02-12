package gestionParking;

import java.util.ArrayList;
import java.util.List;



public final class App {
    private App() {
    }

    /**
     * @param args The arguments of the program.
     */
    public static void main(final String[] args) {

        Parking parking = new Parking(30,"Valenciennes");
        List<Vehicule> voituresAdmissible = parking.CreerListeVoitures();
        List<Vehicule> listeVoitures = parking.CreerListeVoituresComplètes();

        Boolean essai1 = parking.AutoriserAcces(listeVoitures.get(2), voituresAdmissible);
        Boolean essai2 = parking.AutoriserAcces(listeVoitures.get(3), voituresAdmissible);
        Boolean essai5 = parking.AutoriserAcces(listeVoitures.get(5), voituresAdmissible);
        Boolean essai3 = parking.AutoriserAcces(listeVoitures.get(6), voituresAdmissible);
        Boolean essai8 = parking.AutoriserAcces(listeVoitures.get(8), voituresAdmissible);
        Boolean essai4 = parking.AutoriserAcces(listeVoitures.get(9), voituresAdmissible);
        Boolean essai7 = parking.AutoriserAcces(listeVoitures.get(10), voituresAdmissible);
        parking.AfficherVoituresParking(voituresAdmissible);
    }

}
