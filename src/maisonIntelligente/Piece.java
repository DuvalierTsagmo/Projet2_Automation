/*
  Titre      : classe piece
  Auteur     : Duvalier Tsagmo
  Date       : 14/02/2023
  Description: ces ma methode parents des differentes espace de la maison
  Version    : 0.0.1
*/



// Package qui contient les classes pour la simulation de la maison intelligente
package maisonIntelligente;

// Classe abstraite qui définit les fonctions génériques pour les pièces de la maison
public abstract class Piece {
    private String nom;
    private int superficie;

    // Constructeur
    Piece(String nom, int superficie) {
        this.nom = nom;
        this.superficie = superficie;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSuperficie() {
        return this.superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    // Méthode abstraite pour allumer les lumières dans la pièce
    public abstract void allumerLumieres();

    // Méthode abstraite pour éteindre les lumières dans la pièce
    public abstract void eteindreLumieres();
}