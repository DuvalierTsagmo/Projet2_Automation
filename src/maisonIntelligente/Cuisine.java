/*
  Titre      : class cuisine
  Auteur     : Duvalier Tsagmo
  Date       : 14/02/2023
  Description: Une description du programme
  Version    : 0.0.1
*/



package maisonIntelligente;

// Classe qui définit les caractéristiques d'une cuisine
public final class Cuisine extends Piece {
    int nombrePlaques;

    // Constructeur
    public Cuisine(String nom, int superficie, int nombrePlaques) {
        super(nom, superficie);
        this.nombrePlaques = nombrePlaques;
    }

    // Override pour allumer les lumières dans la cuisine
    @Override
    public void allumerLumieres() {
        System.out.println("Les lumières de la cuisine " + this.getNom() + " sont allumées.");
    }

    // Override pour éteindre les lumières dans la cuisine
    @Override
    public void eteindreLumieres() {
        System.out.println("Les lumières de la cuisine " + this.getNom() + " sont éteintes.");
    }

    protected void finalize(){
        System.out.println("ferme toute les lumieres de la ma maison intelligente");
    }

}