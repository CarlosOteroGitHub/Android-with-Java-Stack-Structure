package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

public class Pila extends AppCompatActivity {

    //Declaramos las Variables.
    String arreglo[];
    int tamañoMaximoElementos;
    int tope;

    public Pila(int tamañoMaximoElementos) {
        this.arreglo=new String [tamañoMaximoElementos];
        this.tamañoMaximoElementos = tamañoMaximoElementos;
        this.tope = 0;
    }

    //Creamos el Metodo "Push" de la Pila.
    public void push (String valor){
        if(tope<tamañoMaximoElementos){
            arreglo[tope]=valor;
            tope++;
        }
    }

    //Creamos el Metodo "Pop" de la Pila.
    public String pop(){
        String a=null;
        if(tope>0){
            a=arreglo[tope-1];
            arreglo[tope-1]=null;
            tope--;
        }
        return a;
    }

    //Creamos el Metodo "Peek" de la Pila.
    public String peek(){
        if(tope>0){
            return arreglo[tope-1];
        }else{
            return null;
        }
    }

    //Creamos el Metodo "Empty" de la Pila.
    public boolean empty(){
        if(tope==0){
            return true;
        }else{
            return false;
        }
    }
}