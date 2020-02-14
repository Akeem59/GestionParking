package gestion;

import java.util.ArrayList;
import java.util.List;
import gestion.hotel.*;
import gestion.hotel.HotelFixtures;
import gestion.parking.Fixtures;
import gestion.parking.Parking;
import gestion.parking.Vehicule;




public final class App {
    private App() {
    }

    /**
     * @param args The arguments of the program.
     */
    public static void main(final String[] args) {

        //SCENARIO DE GESTION PARKING

        // Parking parking = new Parking(20,"Valenciennes");
        // Fixtures fixtures = new Fixtures();
        // List<Vehicule> maListeVoiture =  fixtures.voituresFixtures();
        // List<Vehicule> mesVehiculesAdmis =  fixtures.voituresAdmisesFixtures(maListeVoiture);
        // fixtures.listeVoituresEntrantes(maListeVoiture, mesVehiculesAdmis, parking);
        // parking.afficherListeVoituresGarees(maListeVoiture);

        
        //SCENARIO DE GESTION HOTEL
        
        // HotelFixtures hotels = new HotelFixtures();
        // System.out.println(hotels);
        // ArrayList<Hotel> listHotels = hotels.creerHotel(7);

        // for (Hotel hotel2 : listHotels) {
            
        //     // System.out.println(hotel2.getNombreChambres());
        //     // System.out.println(hotel2.getNombreChambresOccupees());
        //     System.out.println(hotel2.tauxOccupation());
        //     System.out.println();
        // }
    }

}
