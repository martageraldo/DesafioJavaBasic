package br.com.dio.exercicios.estruturasderepeticao.arrays;

import java.util.Random;

/*Faça um programa que leia 20numeros inteiros
aleatórios(entre 8 e 100), armazene-os num vetor.
Ao final mostre os números e seus sucessores.
 */
public class Ex03_NumerosAleatorios {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++){
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.print("Numeros Aleatórios: ");
        for (int numero:
             numerosAleatorios) {
            System.out.print(numero + " ");

        }

        System.out.print("\nAntecessores dos Numeros Aleatórios: ");
        for (int numero:
                numerosAleatorios) {
            System.out.print(numero - 1 + " ");

        }

        System.out.print("\nSucessores dos Numeros Aleatórios: ");
        for (int numero: numerosAleatorios) {
            System.out.print(numero + 1 + " ");

        }
    }
}
