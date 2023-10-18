package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner generalScan = new Scanner(System.in);

        System.out.println("Ciao, benvenuto nel password generator più sicuro della storia. Ora ti farò qualche domanda che mi permetterà di generare una password invalicabile e soprattutto impossibile da breachare anche dai più moderni malware in circolazione.");
        System.out.println("Scrivi il tuo nome: ");
        String newName = generalScan.next();
        System.out.println("Scrivi il tuo cognome: ");
        String newSurname = generalScan.next();
        System.out.println("Qual'è il tuo colore preferito? ");
        String newColor = generalScan.next();
        System.out.println("In che giorno del mese sei nato? ");
        int newDay = generalScan.nextInt();
        System.out.println("In che mese dell'anno sei nato? ");
        int newMonth = generalScan.nextInt();
        System.out.println("In che anno sei nato? ");
        int newYear = generalScan.nextInt();
        int newSomma = newDay + newMonth + newYear;
        System.out.println("Ecco la tua nuova e formidabile password: " + newName + "-" + newSurname + "-" + newColor + "-" + newSomma);

        generalScan.close();
    }
}
