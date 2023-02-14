/*
  Titre      : classe principale
  Auteur     : Duvalier Tsagmo
  Date       : 10/02/2023
  Description: qui vas contenir le menu du programme
  Version    : 0.0.1
*/


import java.util.InputMismatchException;
import java.util.Scanner;

import maisonIntelligente.*;

// Classe principale pour la simulation de la maison intelligente
public class MaisonIntelligente {
    public static void main(String[] args) throws Exception {
        // Initialisation des pièces de la maison
        Chambre chambre1 = new Chambre("Chambre 1", 20, 2);
        Chambre chambre2 = new Chambre("Chambre 2", 25, 3);
        Cuisine cuisine = new Cuisine("Cuisine", 15, 4);
        Garage garage = new Garage("Garage", 30, 2);
        // Liste des pièces de la maison
        Piece[] maMaison = { chambre1, chambre2, cuisine, garage };

        Scanner sc = new Scanner(System.in);
        int choix = 0;

        // Boucle infinie pour le menu de la maison intelligente
        do {
            System.out.println("Simulation de la maison intelligente :");
            System.out.println("1. Allumer les lumières dans une pièce");
            System.out.println("2. Éteindre les lumières dans une pièce");
            System.out.println("3. Quitter");
            System.out.print("Entrez votre choix : ");

            try {
                choix = sc.nextInt();

                switch (choix) {
                    case 1:
                        System.out.println("Allumer les lumières dans une pièce :");
                        for (int i = 0; i < maMaison.length; i++) {
                            System.out.println((i + 1) + ". " + maMaison[i].getNom());
                        }
                        System.out.print("Entrez le numéro de la pièce : ");
                        int piece = sc.nextInt();
                        maMaison[piece - 1].allumerLumieres();
                        break;
                    case 2:
                        System.out.println("Éteindre les lumières dans une pièce :");
                        for (int i = 0; i < maMaison.length; i++) {
                            System.out.println((i + 1) + ". " + maMaison[i].getNom());
                        }
                        System.out.print("Entrez le numéro de la pièce : ");
                        piece = sc.nextInt();
                        maMaison[piece - 1].eteindreLumieres();
                        break;
                    case 3:
                        // on affecte null pour que la fonction finalize() s'exécute lorsqu'on appelle
                        // le gabage collector System.gc()
                        maMaison = null;
                        chambre1 = null;
                        chambre2 = null;
                        cuisine = null;
                        garage = null;
                        System.gc();
                        System.out.println("Au revoir !");
                        // sc.close();
                        break;
                    default:
                        System.out.println("Choix non valide. Veuillez entrer un nombre entre 1 et 3.");
                        break;
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Pièce introuvable. Veuillez entrer un nombre entre 1 et " + maMaison.length + ".");
            } catch (InputMismatchException e) {
                System.out.println("Entrée non valide. Veuillez entrer un nombre entier.");
                sc.next();
            } finally {
                System.out.println();
            }
        } while (choix != 3);
    }
}
