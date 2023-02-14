/*
  Titre      : classe garage
  Auteur     : Duvalier Tsagmo
  Date       : 10/02/2023
  Description: vas contenir les propriete d'un garage
  Version    : 0.0.1
*/


package maisonIntelligente;


// Classe qui définit les caractéristiques d'un garage
public final class Garage extends Piece {
    int nombrePlaces;

    // Constructeur
    public Garage(String nom, int superficie, int nombrePlaces) {
        super(nom, superficie);
        this.nombrePlaces = nombrePlaces;
    }

    // Override pour allumer les lumières dans le garage
    @Override
    public void allumerLumieres() {
        System.out.println("Les lumières du garage " + this.getNom() + " sont allumées.");
    }

    // Override pour éteindre les lumières dans le garage
    @Override
    public void eteindreLumieres() {
        System.out.println("Les lumières du garage " + this.getNom() + " sont éteintes.");
    }
    protected void finalize(){
        System.out.println("quelque chose");
    }
}