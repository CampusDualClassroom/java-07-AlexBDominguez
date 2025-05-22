package com.campusdual.classroom;


import java.util.ArrayList;
import java.util.List;

public class Exercise07 {

    public static void main(String[] args) {
        positionInAList(6);
        sumFirstNaturalNumbers(6);
        showFirstNaturalNumbers(6);


    }

    //TODO ↓
    // ESTE MÉTODO NO ES NECESARIO HACERLO POR PARTE DE LOS ALUMNOS
    // Crear una List<Integer> con los números del 10 al 1. Luego buscar el elemento
    // que se le pasa por parámetro.
    // Si lo encuentra, que imprima el siguiente mensaje → El elemento X se encuentra en la posición: Y
    // Si NO lo encuentra, que imprima el siguiente mensaje → El elemento X no se encuentra en la lista.
    public static void positionInAList(int num) {
        List<Integer> lista = new ArrayList<>();
        for(int i=10; i>=1; i--){
            lista.add(i);
        }

        boolean encontrado = false;

        for(int i=0; i < lista.size(); i++){
            if(lista.get(i) == num){
                System.out.println("El elemento " + num + " se encuentra en la posición: " + i);
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("El elemento " + num + " no se encuentra en la lista.");
        }

    }

    //TODO ↓
    // Que imprima como mensaje la suma de los primeros N números positivos
    public static void sumFirstNaturalNumbers(int num) {
        int sum = 0;
        for(int i=num; i>=1; i--){
            sum += i;

        }
        System.out.println("La suma de los primeros " + num + " números naturales es: " + sum);
    }


    //TODO ↓
    // Que imprima por pantalla los N primeros números positivos
    public static void showFirstNaturalNumbers(int num) {
        System.out.println("Los primeros numeros positivos hasta " + num + " son: ");
        for(int i=1; i<=num; i++){
            System.out.println(i);
        }
    }

}
