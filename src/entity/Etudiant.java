package entity;

import java.util.Scanner;

public class Etudiant {
    //Constante
    public final int nb=10;
    //Attributs
    private String prenom, nom;
    private int annee_de_naissance;
    private double[] tabNotes;
    private int nbNotes;
//Constructeur
    public Etudiant() {
    double[] tabNotes = new double[nb];
}
    public Etudiant(String prenom, String nom) {
        this.prenom = prenom;
        this.nom = nom;
        double[] tabNotes = new double[nb];
    }

    public Etudiant(String prenom, String nom, int annee_de_naissance) {
        double[] tabNotes = new double[nb];
        this.prenom = prenom;
        this.nom = nom;
        this.annee_de_naissance = annee_de_naissance;
    }
    //Accesseur ou getter

    public String getPrenom() {
        return prenom;
    }

    public String getNom() {
        return nom;
    }

    public int getAnnee_de_naissance() {
        return annee_de_naissance;
    }

    //Muttateurs ou Modificateurs ou setteurs

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setAnnee_de_naissance(int annee_de_naissance) {
        this.annee_de_naissance = annee_de_naissance;
    }
    private double Moyenne(){
        double som=0;
        nbNotes = 0;
        for (int i = 0; i < tabNotes.length; i++) {
           nbNotes++;
            som = som + tabNotes[i];
        }
        return som/nbNotes;
    }
    private double max(){
        double mx=0;
        int i;
        for (i = 0; i < tabNotes.length; i++) {
            if(i==0)
                mx = tabNotes[i];
            else{
                if (mx < tabNotes[i])
                    mx = tabNotes[i];
            }
        }
        return mx;
    }
    private double min(){
        double min=0;
        int i;
        for (i = 0; i < tabNotes.length; i++) {
            if(i==0)
                min = tabNotes[i];
            else{
                if (min > tabNotes[i])
                    min = tabNotes[i];
            }
        }
        return min;
    }

    public void ajouterNote(){

    }

}
