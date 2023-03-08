package com.example.tp_devops;

public class SystemeLineaire {
    int taille;
    Matrice m;
    Vecteur v;
    float solutions[] = new float[30];

    public SystemeLineaire(){
        m = new Matrice();
        v = new Vecteur(m);
        this.taille = m.getTaille();

        float s = 0;
        int type = m.getType();
        int t = this.taille;
        int i,j;
        float matrice[][] = m.getElement();
        float vecteur[] = v.getElement();

        if(type==1){
            this.solutions[t]=vecteur[t]/matrice[t][t];
            System.out.println("x"+t+" = "+this.solutions[t]);
            for(i=t-1;i>=1;i--){
                for(j=i+1;j<=t;j++){
                    s=(float)s+matrice[i][j]*this.solutions[j];
                }
                this.solutions[i]=(float)(vecteur[i]-s)/matrice[i][i];
                System.out.println("x"+i+" = "+this.solutions[i]);
            }
        }
        else{
            this.solutions[1]=vecteur[1]/matrice[1][1];
            System.out.println("x1 = "+this.solutions[1]);
            for(i=2;i<=t;i++){
                for(j=1;j<=i-1;j++){
                    s=(float)s+matrice[i][j]*this.solutions[j];
                }
                this.solutions[i]=(float)(vecteur[i]-s)/matrice[i][i];
                System.out.println("x"+i+" = "+this.solutions[i]);
            }
        }
    }

    public int getTaille() {
        return taille;
    }

    public Matrice getM() {
        return m;
    }

    public Vecteur getV() {
        return v;
    }

    public float[] getSolutions() {
        return solutions;
    }
}
