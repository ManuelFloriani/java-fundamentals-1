package org.lessons.java;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        Scanner generalScan = new Scanner(System.in);
        System.out.println("Quanti chilometri devi percorrere?");
        int kilometersToTravel = generalScan.nextInt();
        System.out.println("Quanti anni hai?");
        int userAge = generalScan.nextInt();
        double fixedPrice = 0.21;
        double partialTicketPrice = fixedPrice * kilometersToTravel;
        System.out.println("Il prezzo prima degli sconti è " + partialTicketPrice + "€");
        double finalTicketPrice;
        if (userAge < 18){
            finalTicketPrice = partialTicketPrice - (partialTicketPrice * 20 / 100);
            System.out.println("Il prezzo del tuo biglietto è " + finalTicketPrice + "€");
        } else if (userAge > 65) {
            finalTicketPrice = partialTicketPrice - (partialTicketPrice * 40 / 100);
            System.out.println("Il prezzo del tuo biglietto è " + finalTicketPrice + "€");
        } else {
            System.out.println("Il prezzo del tuo biglietto è " + partialTicketPrice + "€");
        }
        generalScan.close();
    }
}
