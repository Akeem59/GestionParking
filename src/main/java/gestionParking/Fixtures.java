package gestionParking;

import java.util.ArrayList;
import java.util.List;

class Fixtures{

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

    public List<Vehicule> voituresAdmisesFixtures(List<Vehicule> voituresFixtures){

        List<Vehicule> voituresAdmisesFixtures = new ArrayList<Vehicule>();
        for (int i = 0; i < 30; i++) {
            int indiceAuHasard = (int) (Math.random() * (voituresFixtures.size() - 1));
            voituresAdmisesFixtures.add(voituresFixtures.get(indiceAuHasard));
        }

        return voituresAdmisesFixtures;
    }
}