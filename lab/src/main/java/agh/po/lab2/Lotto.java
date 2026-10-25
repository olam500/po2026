package agh.po.lab2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
import java.util.HashSet;

public class Lotto {
    public static void main(String[] args) {
        ArrayList<Integer> wylosowane = new ArrayList<>();
        Random random = new Random();

        while (wylosowane.size() < 6) {
            int liczba = random.nextInt(49) + 1;
            if (!wylosowane.contains(liczba)) {
                wylosowane.add(liczba);
            }
        }

        Collections.sort(wylosowane);

        ArrayList<Integer> typyUzytkownika = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj 6 liczb od 1 do 49 rozdzielonych spacjami");
        while (typyUzytkownika.size() < 6 && scanner.hasNextInt()) {
            int typ = scanner.nextInt();
            if (typ >= 1 && typ <= 49 && !typyUzytkownika.contains(typ)) {
                typyUzytkownika.add(typ);
            } else {
                System.out.println("Liczba musi być z zakresu 1-49 i nie może się powtarzać");
            }
        }

        System.out.println("Twoje typy: " + typyUzytkownika);
        System.out.println("Wylosowane liczby: " + wylosowane);

        ArrayList<Integer> wspolne = new ArrayList<>(typyUzytkownika);
        wspolne.retainAll(wylosowane);
        System.out.println("Liczba trafień: " + wspolne.size());

        long liczbaLosowan = 0;
        long startTime = System.currentTimeMillis();
        java.util.Set<Integer> typySet = new java.util.HashSet<>(typyUzytkownika);
        java.util.Set<Integer> aktualneLosowanie = new java.util.HashSet<>();
        while (true) {
            liczbaLosowan++;
            aktualneLosowanie.clear();

            while (aktualneLosowanie.size() < 6) {
                aktualneLosowanie.add(random.nextInt(49) + 1);
            }

            if (aktualneLosowanie.equals(typySet)) {
                break;
            }
        }

        long endTime = System.currentTimeMillis();

        System.out.println("Liczba losowań potrzebnych do pełnego trafienia: " + liczbaLosowan);
        System.out.println("Łączny czas działania programu: " + (endTime - startTime) + " ms");
    }
}