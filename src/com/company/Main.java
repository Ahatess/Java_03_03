package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        float suma=0;
        float sk=0;
        do{
            System.out.println("Iveskite skaicius, kol bus 0");
            Scanner sc = new Scanner(System.in);
            sk=sc.nextFloat();
            suma += sk;
                } while (sk!=0);
            System.out.println("Suma: "+suma);
        }
        }

