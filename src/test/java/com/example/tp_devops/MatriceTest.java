package com.example.tp_devops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MatriceTest {

    @Test
    public void checkMatriceSup(){
        Matrice m = new Matrice("null");
        float element[][] = new float[4][4];
        int i, j;
        for(i=1;i<=3;i++){
            for(j=1;j<=3;j++){
                if(i>j){
                    element[i][j]=0;
                }
                else{
                    element[i][j] = 1;
                }
            }
        }
        m.setElement(element);
        assertTrue(m.checkType());
    }
}