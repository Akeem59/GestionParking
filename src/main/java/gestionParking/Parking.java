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
    Vehicule v1 = new Vehicule("CX-272-DE", false);
    Vehicule v2 = new Vehicule("YS-232-ZD", false);
    Vehicule v3 = new Vehicule("SF-145-ED", false);
    Vehicule v4 = new Vehicule("DD-120-SS", false);
    Vehicule v5 = new Vehicule("IC-377-WD", false);
    Vehicule v110 = new Vehicule("XE-222-HD", false);
    Vehicule v111 = new Vehicule("XX-255-AD", false);
    Vehicule v120 = new Vehicule("YE-232-VD", false);
    Vehicule v121 = new Vehicule("YY-292-CQ", false);
    Vehicule v130 = new Vehicule("FE-995-ZW", false);
    Vehicule v131 = new Vehicule("FF-445-DD", false);
    Vehicule v140 = new Vehicule("DE-122-ZD", false);
    Vehicule v141 = new Vehicule("DD-128-SD", false);
    Vehicule v150 = new Vehicule("CE-377-ZD", false);
    Vehicule v151 = new Vehicule("CC-370-CD", false);
    List<Vehicule> vehiculeAdmis = new ArrayList<Vehicule>();

    /**
     * je créer 1 liste de voitures : admises 
     * @return
     */
    public List CreerListeVoitures() {
        vehiculeAdmis.add(v110);
        vehiculeAdmis.add(v111);
        vehiculeAdmis.add(v120);
        vehiculeAdmis.add(v121);
        vehiculeAdmis.add(v130);
        vehiculeAdmis.add(v131);
        vehiculeAdmis.add(v150);
        vehiculeAdmis.add(v151);
        vehiculeAdmis.add(v1);
        vehiculeAdmis.add(v2);
        vehiculeAdmis.add(v5);

        return vehiculeAdmis;
    }
    public List CreerListeVoituresComplètes() {
        List<Vehicule> listeVehicules = new ArrayList<Vehicule>();

        listeVehicules.add(v1);
        listeVehicules.add(v2);
        listeVehicules.add(v3);
        listeVehicules.add(v4);
        listeVehicules.add(v5);
        listeVehicules.add(v110);
        listeVehicules.add(v111);
        listeVehicules.add(v120);
        listeVehicules.add(v121);
        listeVehicules.add(v130);
        listeVehicules.add(v131);
        listeVehicules.add(v140);
        listeVehicules.add(v141);
        listeVehicules.add(v150);
        listeVehicules.add(v151);

        return listeVehicules;
    }
  
    public Boolean AutoriserAcces(Vehicule vehicule, List vehiculeAdmis){

        if(vehiculeAdmis.contains(vehicule))
        {
            vehicule.setIsStationne(true);
            System.out.println("//////////////////////////////////////////");
            System.out.println("le véhicule " + vehicule.getImmatriculation() + " entre dans le parking");
            System.out.println();
            return true;
        }
        else
        {
            System.out.println("//////////////////////////////////////////");
            System.out.println(vehicule.getImmatriculation() + " !!! Vous n'êtes pas autoriser à rentrer");
            System.out.println();

            return false;
        }
    }
    public void AfficherVoituresParking(List<Vehicule> vehiculesAdmis) {
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
    public void afficherVehiculesAdmis() {
        System.out.println("**** Liste des véhicules admis ****");
        for (Vehicule vehicule : vehiculeAdmis) {
            System.out.println(vehicule.getImmatriculation());
        }
    }
    public void afficherListeVoituresComplète(List<Vehicule> voitures) {
        for (int i = 0; i < voitures.size(); i++) {
            System.out.println(voitures.get(i).getImmatriculation());
        }
    }

}