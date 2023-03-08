package com.example.tp_devops;

import java.util.Scanner;

public class Matrice {
    int taille;
    int type;
    float element[][] = new float[30][30];
    public Matrice(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Taper 1 pour entrer une matrice triangulaire superieure ou 2 pour entrer une matrice triangulaire inferieure: ");
            this.type = sc.nextInt();
            System.out.println("===============================================================================");
        }while(this.type<1 || this.type>2);

        System.out.println("Entrer la taille de la matrice: ");
        this.taille = sc.nextInt();
        System.out.println("===============================================================================");

        int i,j;
        if(this.type==1){
            for(i=1;i<=this.taille;i++){
                for(j=1;j<=this.taille;j++){
                    if(i>j){
                        element[i][j]=0;
                    }
                    else{
                        System.out.println("Entrer le coefficient de position ("+i+","+j+") :");
                        element[i][j] = sc.nextFloat();
                    }
                }
            }
        }
        else{
            for(i=1;i<=this.taille;i++){
                for(j=1;j<=this.taille;j++){
                    if(i<j){
                        element[i][j]=0;
                    }
                    else if(i>=j){
                        System.out.println("Entrer le coefficient de position ("+i+","+j+") :");
                        element[i][j] = sc.nextFloat();
                    }
                }
            }
        }
        System.out.println("===============================================================================");
    }

    public Matrice(String s){

    }

    public boolean checkType(){
        int i,j;
        for(i=1;i<=this.taille;i++){
            for(j=1;j<=this.taille;j++){
                if(i>j && this.element[i][j]!=0){
                    return false;
                }
            }
        }
        return true;
        //true --> matrice superieure et false --> matrice inferieure
    }

    public int getTaille() {
        return taille;
    }

    public int getType() {
        return type;
    }

    public float[][] getElement() {
        return element;
    }

    public void setElement(float[][] element) {
        this.element = element;
    }
}
