package gestion.parking;

public class Vehicule {

  
    private String immatriculation;
    private Boolean isStationne;
    
    
    public String getImmatriculation(){
        return this.immatriculation;
    }

    public Boolean  getIsStationne(){
        return this.isStationne;
    }
    public void setIsStationne(Boolean isStationne){
      this.isStationne = isStationne;
    }

  public Vehicule(String immatriculation, Boolean isStationne){
    this.immatriculation = immatriculation;
    this.isStationne = isStationne;
  }


}