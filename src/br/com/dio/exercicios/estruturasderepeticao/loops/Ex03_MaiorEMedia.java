package br.com.dio.exercicios.estruturasderepeticao.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números e informe o maior número e a média desses números.
 */
public class Ex03_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int count = 0;
        int soma = 0;
        int media = soma / 5;

        do{
            System.out.println("Número: ");
            numero = scan.nextInt();

            soma = soma + numero;

            if (numero > maior)maior = numero;

            count = count + 1;

        }while (count < 5);
        System.out.println("Maior: " + maior);
        System.out.println("Média: " + soma/5);
    }
}
