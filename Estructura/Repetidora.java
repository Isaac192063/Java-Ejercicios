/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura;

import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author ASUS
 */
public class Repetidora {
    public static void main(String[] args) {
        int[] numeros = { 2, 4, 3, 7, 2, 8, 4, 1, 2, 2 };
        ArrayList<Integer> valoresRepetidos = new ArrayList<>();
        for (int i = 0; i < numeros.length; i++) {
            for (int j = i + 1; j < numeros.length; j++) {
                if (numeros[i] == numeros[j]) {
                    if (!valoresRepetidos.contains(numeros[i])) {
                        valoresRepetidos.add(numeros[i]);
                    }
                    System.out.println("Valor repetido: " + numeros[i] + " en la posición: " + j);
                }
            }
        }
        System.out.println("Valores repetidos encontrados: " + valoresRepetidos);
    }
}
