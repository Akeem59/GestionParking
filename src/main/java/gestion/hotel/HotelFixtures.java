package gestion.hotel;

import java.util.ArrayList;

public class HotelFixtures{

    private ArrayList<Hotel> hotels;
    /**
     * 
     */
    public HotelFixtures() {
        this.hotels = new ArrayList<Hotel>();
    }

    public ArrayList getHotels() {
        return this.hotels;
    }

    public ArrayList<Hotel> creerHotel(int nombreHotel) {

        ArrayList<Hotel> hotels = new ArrayList<Hotel>();

    
        for (int i = 0; i < nombreHotel; i++) {  

            int nombreAleatoire = (1 + (int)(Math.random() * ((10 - 1) + 1))) * 20 ;
            int denominateurs[] = { 5, 10, 20 };
            int denominateur = (int)(Math.random() * 3);
            int nbEtage = nombreAleatoire / denominateurs[denominateur] ;
          
            Hotel hotel = new Hotel("Hotel " + i, nombreAleatoire, nbEtage  );
            hotels.add(hotel);
           
            for (int j = 0; j < 100; j++) {
                int nbJoursAleatoires = (int) (Math.random() * 31) + 1;
                String types[] = {"simple","double", "suite"};
                String typeAleatoire = types[(int)(Math.random() * types.length)];
                hotel.louerChambre(typeAleatoire, "nomclient", nbJoursAleatoires);
            }
            
        }
        System.out.println( nombreHotel + " hotels créés");
        return hotels;
    }

}