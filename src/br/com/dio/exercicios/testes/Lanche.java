package br.com.dio.exercicios.testes;
import java.io.IOException;
import java.util.Scanner;
/* Com base na tabela abaixo, escreva um programa que leia o código de um item
e a quantidade deste item. A seguir, calcule e mostre o valor da conta a
pagar.
CODIGO	ESPECIFICAÇÃO	PREÇO
1		Cachorro Quente	R$ 4,00
2		X-Salada		R$ 4,50
3		X-Bacon			R$ 5,00
4		Torrada simples	R$ 2,00
5		Refrigerante	R$ 1,50
Entrada O arquivo de entrada contém dois valores inteiros correspondentes ao
código e à quantidade de um item conforme tabela acima.
Saída O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo
valor a ser pago, com 2 casas após o ponto decimal. */


public class Lanche {


        public static void main(String[] args) {
            int X, Y;
            float preco = 0;

            Scanner input = new Scanner(System.in);
            X = input.nextInt();
            Y = input.nextInt();

            if (X == 1) {
                preco  = (float) (4.00 * Y);
            }else if (X == 2) {
                preco  = (float) (4.5 * Y);  //implemente sua lógica aqui
            }else if (X == 3) {
                preco  = (float) (5.00* Y);  //implemente sua lógica aqui
            }else if (X == 4) {
                preco  = (float) (2.00 * Y); //implemente sua lógica aqui
            }else if (X == 5) {
                preco  = (float) (1.5 * Y); //implemente sua lógica aqui
            }

            System.out.printf("Total: R$ %.2f\n", preco);
        }

    }

