package com.example.tp_devops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class VecteurTest {

    @Test
    public void checkVecteurPos(){
        Vecteur v = new Vecteur("null");
        float element[] = new float[4];
        int i;
        for(i=1;i<=3;i++){
            element[i] = 1;
        }
        v.setElement(element);
        assertTrue(v.checkSign());
    }
}