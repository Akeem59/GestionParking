package gestion.hotel;




public class Chambre {


    private int numeroChambre;
    private int joursRestants;
    private String type ;
    private String nomOccupant;

    /**
     * Contructeur 
     * @param numeroChambre
     * @param type
     */
    public Chambre(int numeroChambre, String type) {
        this.numeroChambre = numeroChambre;
        this.type = type;
        this.joursRestants = 0;
        this.nomOccupant = null;
    }
    /**
     * retourne le numéro de chambre
     * @return
     */
    public int getNumeroChambre()
    {
        return this.numeroChambre;
    }
    /**
     * retourne le nombre de jours restants de l'occupant
     */
    public int getJoursRestants()
    {
        return this.joursRestants;
    }
    public String getType()
    {
        return this.type;
    }

    public boolean definirOccupant(String nomOccupant,int joursRestants )
    {
        boolean chambreDisponible = ( this.joursRestants == 0) ? true : false;
        if (chambreDisponible == true)
        {
            this.nomOccupant = nomOccupant;
            this.joursRestants = joursRestants;
            return true;
        }
        else
        {
            return false;
        }
            // this.nomOccupant = nomOccupant;
            // this.joursRestants = joursRestants;
            // return true;
    }
    /**
     * 
     */
    public void joursSuivant() {
        // for (int i = 0; i < nombreJoursSuivants; i++) {            
            if (this.joursRestants > 0)
            {
                this.joursRestants--;
            }
        // }
        
        if(joursRestants == 0) this.nomOccupant = null;
    }
    public String toString()
    {
        String etatChambre = ( joursRestants == 0) ? "Disponible" : "louée";
        String sautDeLigne = System.getProperty("line.separator");

        return "chambre " + numeroChambre + ": " + type + " - " + etatChambre + sautDeLigne;       
    }

}