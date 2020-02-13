package gestionParking;

import java.util.ArrayList;
import java.util.List;

class Parking {

    private int nbPlaceMax;
    private String ville;
    
    public int getNbPlaceMax() {
        return this.nbPlaceMax;
    }
    public void setNbPlaceMax(int nbPlaceMax){
        this.nbPlaceMax = nbPlaceMax;
    }
    public String getVille() {
        return this.ville;
    }
    public void setVille(String ville){
        this.ville = ville;
    }
    public Parking (int nbPlaceMax, String ville){
        this.nbPlaceMax = nbPlaceMax;
        this.ville = ville;
    }
    public Parking (){
       
    }

    /**
     * 
     * @param vehicule
     * @param vehiculeAdmis
     * @return
     */
    public static Boolean AutoriserAcces(Vehicule vehiculeControle, List<Vehicule> vehiculeAdmis){

        if(vehiculeAdmis.contains(vehiculeControle))
        {         
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
     * affiche la liste des voitures garées, isStationne = true
     */
    public void afficherListeVoituresGarees(List<Vehicule> vehiculesAdmis) {
        List<Vehicule> voitureGaree = new ArrayList<Vehicule>();
        int compteur = 0;

        System.out.println("****Vehicules actuellement garés****");
        for (int i = 0; i < vehiculesAdmis.size(); i++) {
            if(vehiculesAdmis.get(i).getIsStationne())
            {
                compteur++;
                voitureGaree.add(vehiculesAdmis.get(i));
                System.out.println( compteur + " : " + vehiculesAdmis.get(i).getImmatriculation());
            }
        }  
    }

    /**
     * je lui passe une liste de voiture, il me l'affiche
     * @param voitures
     */
    public void afficherListeVoituresComplète(List<Vehicule> voitures) {
        for (int i = 0; i < voitures.size(); i++) {
            System.out.println(voitures.get(i).getImmatriculation());
        }
    }
    /**
     * si la verif = true, le vehicule entre et son boolean isStationne = true
     * @param vehiculeEntrant
     * @param vehiculeAdmis
     */
    public void entreeVehicule(Vehicule vehiculeEntrant, List<Vehicule> vehiculeAdmis) {
        Boolean verif = this.AutoriserAcces(vehiculeEntrant, vehiculeAdmis);
        if(verif){
            vehiculeEntrant.setIsStationne(true);
            System.out.println("//////////////////////////////////////////");
            System.out.println("le véhicule " + vehiculeEntrant.getImmatriculation() + " entre dans le parking");
            System.out.println();
        }
        else{
            System.out.println("////////********  STOP  *********///////");
            System.out.println(vehiculeEntrant.getImmatriculation() + " !!! Vous n'êtes pas autoriser à rentrer");
            System.out.println();
        }
    }

}