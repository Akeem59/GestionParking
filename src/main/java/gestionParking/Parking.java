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
    Vehicule v110 = new Vehicule("XE-222-HD", false);
    Vehicule v111 = new Vehicule("XX-255-AD", false);
    Vehicule v120 = new Vehicule("YE-232-VD", true);
    Vehicule v121 = new Vehicule("YY-292-CQ", true);
    Vehicule v130 = new Vehicule("FE-995-ZW", true);
    Vehicule v131 = new Vehicule("FF-445-DD", true);
    Vehicule v140 = new Vehicule("DE-122-ZD", false);
    Vehicule v141 = new Vehicule("DD-128-SD", false);
    Vehicule v150 = new Vehicule("CE-377-ZD", true);
    Vehicule v151 = new Vehicule("CC-370-CD", true);

    public List CreerListeVoitures() {
        List<Vehicule> vehiculeAdmis = new ArrayList<Vehicule>();
        vehiculeAdmis.add(v110);
        vehiculeAdmis.add(v111);
        vehiculeAdmis.add(v120);
        vehiculeAdmis.add(v121);
        vehiculeAdmis.add(v130);
        vehiculeAdmis.add(v131);

        return vehiculeAdmis;
    }
  
    public Boolean AutoriserAcces(Vehicule vehicule, List vehiculeAdmis){

        if(vehiculeAdmis.contains(vehicule))
        {
            vehicule.setIsStationne(true);
            System.out.println("le véhicule " + vehicule.getImmatriculation() + " entre dans le parking");
            return true;
        }
        else
        {
            System.out.println("vous n'êtes pas autoriser à rentrer");
            return false;
        }
    }

}