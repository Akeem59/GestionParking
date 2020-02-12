package gestionParking;

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

        // parking.afficherVehiculesAdmis();
        System.out.println();
        // parking.AutoriserAcces(listeVoitures.get(2), voituresAdmissible);
        // parking.AutoriserAcces(listeVoitures.get(3), voituresAdmissible);
        // parking.AutoriserAcces(listeVoitures.get(5), voituresAdmissible);
        // parking.AutoriserAcces(listeVoitures.get(6), voituresAdmissible);
        // parking.AutoriserAcces(listeVoitures.get(8), voituresAdmissible);
        // parking.AutoriserAcces(listeVoitures.get(9), voituresAdmissible);
        // parking.AutoriserAcces(listeVoitures.get(10), voituresAdmissible);
        // parking.AfficherVoituresParking(voituresAdmissible);
        Fixtures fixtures = new Fixtures();
        List<Vehicule> maListe =  fixtures.voituresFixtures();
        List<Vehicule> mesVehiculesAdmis =  fixtures.voituresAdmisesFixtures(maListe);

        // parking.afficherListeVoituresComplète(maListe);
        parking.afficherListeVoituresComplète(mesVehiculesAdmis);


    }

}
