package com.example.myapplication;

/*

Author: ING. CARLOS OTERO RAMÍREZ

 */

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    String guardar="", ultimo;
    boolean vacio;
    TextView textView1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView1= findViewById(R.id.AM1_id2);

        guardar="";

        //Creamos una Intancia de Objeto, para Mandar llamar los Metodos de la otra Clase, y a la vez para Darle un Tamaño a la Pila que en este Caso es de 5.
        Pila objeto = new Pila(5);

        //Agregamos pues los Elementos a la Pila.
        objeto.push("A");
        objeto.push("B");
        objeto.push("C");
        objeto.push("D");
        objeto.push("E");

        //Por Último Imprimimos en Pantalla los Metodos Creados en la Primer Clase.
        vacio = objeto.empty();
        guardar+="¿Esta Vacia la Pila? " + vacio;
        ultimo=objeto.peek();
        guardar+="\n" + "El Último Elemento de la Pila es: " + ultimo;
        objeto.pop();
        ultimo=objeto.peek();
        guardar+="\n" + "Al Eliminar el Último Elemento de la Pila el Siguiente Sera: " + ultimo;
        textView1.setText(guardar);
    }
}