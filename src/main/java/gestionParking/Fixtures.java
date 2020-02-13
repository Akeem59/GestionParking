package gestionParking;

import java.util.ArrayList;
import java.util.List;

import jdk.internal.jshell.tool.resources.version;

class Fixtures extends Parking{

    /**
     * créer des voitures
     */
    public List<Vehicule> voituresFixtures() {
        
        List<Vehicule> voituresFixtures = new ArrayList<Vehicule>();
        for (int i = 0; i < 50; i++) {
            Vehicule voiture = new Vehicule("immatriculation " + i, false);            
            voituresFixtures.add(voiture);             
        }
        return voituresFixtures;
    }

    /**
     * selectionne au hasard des voitures admises
     * @param voituresFixtures
     * @return
     */
    public List<Vehicule> voituresAdmisesFixtures(List<Vehicule> voituresFixtures){

        List<Vehicule> voituresAdmisesFixtures = new ArrayList<Vehicule>();
        for (int i = 0; i < 30; i++) {
            int indiceAuHasard = (int) (Math.random() * (voituresFixtures.size() - 1));
            Vehicule choisi = voituresFixtures.get(indiceAuHasard);

            if (!voituresAdmisesFixtures.contains(choisi)){
                voituresAdmisesFixtures.add(choisi);
            }
            else{
                System.out.println("la voiture " + choisi.getImmatriculation() + " est déja sur la liste des voitures admises");
            }
        }

        return voituresAdmisesFixtures;
    }
    /**
     * je fais une liste de véhicule au hasard, je leur fait passer les tests pour entrer
     */
    public void listeVoituresEntrantes(List<Vehicule> vehicules, List<Vehicule> vehiculeAdmis) {
        for (int i = 0; i < 30; i++) {
            int indiceAuHasard = (int) (Math.random() * (vehicules.size() - 1));
            Vehicule choisi = vehicules.get(indiceAuHasard);

            this.entreeVehicule(choisi, vehiculeAdmis);
           
        }
    }
}