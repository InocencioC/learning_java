package org.example;

import java.util.Scanner;

public class Main {
    public void main (String [] args) {
        int quilometros = 0;
        int litros = 0;
        int consumo = 0;
        double media = 0;
        int totalQuilometros = 0;
        int contador = 1;
        Scanner entrada = new Scanner(System.in);

        totalQuilometros = totalQuilometros + quilometros;

        consumo = consumo + litros;

        media = (double) quilometros / litros;

        System.out.print("Quilômetros rodados ou -1 para sair:");
        quilometros = entrada.nextInt();

        System.out.print("Consumo de combustível ou -1 para sair:");
        litros = entrada.nextInt();

        if (quilometros > 0)
            System.out.printf("Média do carro %d: %.2f KM/Litro\n", contador++, (double) quilometros / litros);

        System.out.printf("\nTotal de quilômetros rodados: %d\n", +totalQuilometros);
        System.out.printf("Total de combustível gasto: %d\n", +consumo);
        System.out.printf("Quilômetros por litro: %.2f", +media);
    }
}

