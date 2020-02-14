package gestion.hotel;

import java.util.ArrayList;

public class Hotel {

    private String nomHotel;
    private ArrayList<Chambre> chambres;
    private int nombreChambres;

    /**
     * Constructeur
     * @param nomHotel
     * @param nombreChambres
     * @param nombreEtages
     */
    public Hotel (String nomHotel,int nombreChambres, int nombreEtages)
    {
        this.nomHotel = nomHotel;
        this.nombreChambres = nombreChambres;
        this.chambres = new ArrayList<>();
        this.chambres = listeChambres(nombreEtages, nombreChambres);
    }
    public ArrayList getChambres() {
        return this.chambres;
    }
    /**
     * Retourne le nombre de chambres de l'hotel
     * @return
     */
    public int getNombreChambres()
    {
        return this.nombreChambres;
    }
    /**
     * Retourne le nombre de chambres occupées
     * @return
     */
    public int getNombreChambresOccupees()
    {
        int compteurChambresOccupees = 0;
        for (int i = 0; i < chambres.size(); i++) {
            if (chambres.get(i).getJoursRestants() > 0)
            {
                compteurChambresOccupees++;
            }
        }
        return compteurChambresOccupees;
    }
  
    /**
     * Retourne le taux d'occupation
     * @return
     */
    public double tauxOccupation()
    {
        int numerateur = getNombreChambresOccupees();
        int denominateur = getNombreChambres();
        return ((double) numerateur / (double) denominateur) * 100;
    }
    /**
     * Retourne une ArrayList de chambres pour un hotel
     * @param nombreEtages
     * @param nombreChambres
     * @return
     */
    public ArrayList<Chambre> listeChambres(int nombreEtages, int nombreChambres) 
    {     
        ArrayList<Chambre> listeChambres = new ArrayList<Chambre>();
        String etats[] = {"simple", "double", "suite"};
        String donneeType = "";

        for (int i = 1; i <= nombreEtages; i++) {
            int numeroChambre = 100 * (i) ;
            
            for (int j = 1; j <= nombreChambres/nombreEtages; j++) {
                if( j <= 4)  donneeType = etats[0];
                if( j >= 5 )  donneeType = etats[1];
                if( j == nombreChambres/nombreEtages)  donneeType = etats[2];
              
                Chambre chambre = new Chambre(numeroChambre, donneeType);
                numeroChambre++;
                listeChambres.add(chambre);
            }
        }
            return listeChambres;
    }

    public Boolean louerChambre(String type, String nomclient, int nombreJours) {

        for (int i = 0; i < chambres.size(); i++) {
            Chambre chambre = chambres.get(i);
            if( chambre.getJoursRestants() == 0 && chambre.getType() == type)
            {
                chambre.definirOccupant(nomclient, nombreJours);
                // System.out.println( "la chambre " + chambre.getNumeroChambre() 
                //                     + " est loué par " + nomclient + " pendant : " 
                //                     + nombreJours + " jours.");   
                return true;
            }   
        }
        // System.out.println("pas de chambre disponible pour " + nomclient);
        return false;
    }
    
    public void passerDesJours(int nombreJours)
    {
        for (int i = 0; i < nombreJours ; i++) {  
            for (Chambre chambre : chambres) {
                chambre.joursSuivant();            
            }
        }
    }


}