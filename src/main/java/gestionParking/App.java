package gestionParking;

import java.util.ArrayList;
import java.util.List;



public final class App {
    private App() {
    }

    static String vehiculeAutorise[] = { "XX-777-ZZ", "DD-222-VV", "AA-444-ZC" };
    static String vehiculeStationne[] = { "XX-777-ZZ" };

    /**
     * @param args The arguments of the program.
     */
    public static void main(final String[] args) {

        Vehicule v1 = new Vehicule("XX-222-DD", false);
        Vehicule v2 = new Vehicule("YY-232-DD", true);
        Vehicule v3 = new Vehicule("FF-445-DD", true);
        Vehicule v4 = new Vehicule("DD-122-DD", false);
        Vehicule v5 = new Vehicule("CC-377-DD", true);
        Vehicule essai = new Vehicule("dd-549-jj", false);
        Vehicule essai2 = new Vehicule("DC-899-11", false);

        List<Vehicule> voitureGaree = new ArrayList<Vehicule>();

        List<Vehicule> listVehicule = new ArrayList<Vehicule>();
        listVehicule.add(v1);
        listVehicule.add(v2);
        listVehicule.add(v3);
        listVehicule.add(v4);
        listVehicule.add(v5);
        listVehicule.add(essai);
        


        // System.out.println(listVehicule);

        /**
         * entrée des voitures sur le parking, isStationne = true
         */
        for (int i = 0; i < listVehicule.size(); i++) {

            if(listVehicule.get(i).getIsStationne())
            {
                voitureGaree.add(listVehicule.get(i));
            }
        } 
        /**
         * récupération des véhicules garées (true)
         */
        for(int i = 0;  i < voitureGaree.size(); i++)  
        {
            System.out.println(voitureGaree.get(i).getImmatriculation());
        }  
        System.out.println();
        /**
         * ajout du véhicule essai sur le parking,
         * s'il fait partie de la liste, le laisser entrer
        */   
        if(listVehicule.contains(essai))
        {
            essai.setIsStationne(true);;
        }
        else
        {
            System.out.println(essai.getImmatriculation() + " : Vous n'êtes pas autorisé à rentrer");
        }
        /**
         * Nouvelle récupération des véhicules garées (true)
         */
        for (int i = 0; i < listVehicule.size(); i++) {
            if(listVehicule.get(i).getIsStationne())
            {
                System.out.println(listVehicule.get(i).getImmatriculation());
            }
        } 
        System.out.println();

        /**
         * ajout du véhicule essai2 sur le parking,
         * s'il fait partie de la liste, le laisser entrer
        */   
        if( listVehicule.contains(essai2))
        {
            essai2.setIsStationne(true);;
        }
        else
        {
            System.out.println(essai2.getImmatriculation() + " : Vous n'êtes pas autorisé à rentrer");
        }
     
        
         salutation();   
  
        Parking parking = new Parking(30,"Valenciennes");
        List<Vehicule> voituresAdmissible = parking.CreerListeVoitures();
        System.out.println(voituresAdmissible.get(5).getImmatriculation());
        Boolean essai1 = parking.AutoriserAcces(voituresAdmissible.get(2), voituresAdmissible);
        System.out.println(essai1);
    }
    
    /////////////// Fin de main
    /////////////// !!!!///////////////////////////////////////////////////
    public static void salutation() 
    {
        
        System.out.println("salut lami");

         
    }

}
