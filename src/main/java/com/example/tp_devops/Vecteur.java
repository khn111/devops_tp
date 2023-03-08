package com.example.tp_devops;

import java.util.Scanner;

public class Vecteur {
    int taille;
    float element[] = new float[30];

    public Vecteur(Matrice m){
        this.taille=m.getTaille();
        Scanner sc = new Scanner(System.in);
        int i;
        for(i=1;i<=this.taille;i++){
            System.out.println("Entrer l'element numero "+i+" du vecteur: ");
            element[i] = sc.nextFloat();
        }
    }

    public float[] getElement() {
        return element;
    }

    public int getTaille() {
        return taille;
    }
}
