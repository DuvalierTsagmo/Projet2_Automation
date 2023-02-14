/*
  Titre      : classe chambre
  Auteur     : Duvalier Tsagmo
  Date       : 10/02/2023
  Description: vas contenir les proprieter d'une chambre
  Version    : 0.0.1
*/

package maisonIntelligente;

// Classe qui définit les caractéristiques d'une chambre
public final class Chambre extends Piece {
    int nombreFenetres;
    // Constructeur
    public Chambre(String nom, int superficie, int nombreFenetres) {
        super(nom, superficie);
        this.nombreFenetres = nombreFenetres;
    }


    // Override pour allumer les lumières dans la chambre
    @Override
    public void allumerLumieres() {
        System.out.println("Les lumières de la chambre " + this.getNom() + " sont allumées.");
    }

    // Override pour éteindre les lumières dans la chambre
    @Override
    public void eteindreLumieres() {
        System.out.println("Les lumières de la chambre " + this.getNom() + " sont éteintes.");
    }
    protected void finalize(){
        System.out.println("quelque chose");
    }
}