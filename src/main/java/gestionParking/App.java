package gestionParking;

import java.util.List;



public final class App {
    private App() {
    }

    /**
     * @param args The arguments of the program.
     */
    public static void main(final String[] args) {

        Parking parking = new Parking(100,"Valenciennes");

        Fixtures fixtures = new Fixtures();
        List<Vehicule> maListeVoiture =  fixtures.voituresFixtures();
        List<Vehicule> mesVehiculesAdmis =  fixtures.voituresAdmisesFixtures(maListeVoiture);
        fixtures.listeVoituresEntrantes(maListeVoiture, mesVehiculesAdmis);
        parking.afficherListeVoituresGarees(maListeVoiture);
    }

}
