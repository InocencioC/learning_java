package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int conta,saldo,cobranças,creditos,limite,calculo; // variaveis do problema
    static String a,b,c,d,e; // variaveis para conversão de tipos
    static BufferedReader g,h,i,j,k; // variaveis para armazenar no buffer
    public static void main(String[] args) {
        System.out.println("Digite o numero da conta");
        g = new BufferedReader(new InputStreamReader(System.in));
        try{
            a=g.readLine();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }

        conta=Integer.parseInt(a);

        System.out.println("Digite o numero do saldo");
        h = new BufferedReader(new InputStreamReader(System.in));
        try{
            b=h.readLine();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }

        saldo=Integer.parseInt(b);

        System.out.println("Digite o numero de cobranças");
        i = new BufferedReader(new InputStreamReader(System.in));
        try{
            c=i.readLine();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }

        cobranças=Integer.parseInt(c);

        System.out.println("Digite o numero de creditos");
        j = new BufferedReader(new InputStreamReader(System.in));
        try{
            d=j.readLine();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }

        creditos=Integer.parseInt(d);

        System.out.println("Digite o limite da conta");
        k = new BufferedReader(new InputStreamReader(System.in));
        try{
            e=k.readLine();
        }
        catch(IOException ioe){
            ioe.printStackTrace();
        }

        limite=Integer.parseInt(e);

        calculo=saldo+creditos+limite-cobranças;

        if(calculo>limite){
            System.out.println("O resultado do calculo " + calculo);
            System.out.println("Procure seu gerente para maior esclarecimentos");
        }
        else{
            System.out.println("O resultado do calculo " + calculo);
            System.out.println("Limite de crédito excedido");
        }

    }

}

