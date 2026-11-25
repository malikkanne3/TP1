package sn.supdeco;

import sn.supdeco.modele.Etudiant;

public class Main {

    public static void main(String[] args){
        System.out.println("Gestion des Etudiants\n");
        Etudiant e1 = new Etudiant (1,  "Gueye",  "Samba",  14);

        System.out.println(e1.toString());
    }
}
