package org.lessons.java;

import java.util.Scanner;

public class BigParty {
    public static void main(String[] args) {
        String[] invitatiFesta = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        Scanner nameScan = new Scanner(System.in);
        System.out.println("Qual'è il tuo nome?");
        String newName = nameScan.nextLine();
        boolean found = false;
        for (int i = 0; i < invitatiFesta.length; i++) {
            if (newName.equals(invitatiFesta[i])){
                found = true;
                System.out.println("Puoi accedere alla festa");
                break;
            }
        }
        if (!found){
            System.out.println("Non sei in lista, non puoi accedere");
        }
        nameScan.close();
    }
}
