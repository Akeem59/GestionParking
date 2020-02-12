package akeem;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import akeem.*;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    static String vehiculeAutorise[] = { "XX-777-ZZ", "DD-222-VV", "AA-444-ZC" };
    static String vehiculeStationne[] = { "XX-777-ZZ" };

    /**
     * Says hello to the world.
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

     
            
       
        
    }

    /////////////// Fin de main
    /////////////// !!!!///////////////////////////////////////////////////
    public static void listeVoitures(List listVehicule) {

        for (int i = 0; i < listVehicule.size(); i++) {
            System.out.println(listVehicule.get(i));

            // listVehicule.get(i).getImmatriculation();

        }
    }

}
