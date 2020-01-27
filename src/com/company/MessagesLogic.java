package com.company;

import java.util.Scanner;

class MessagesLogic {

    void restItemsMessage(int itemsCountRest) {
        System.out.println("На столе осталось " + itemsCountRest + " спичек.");
    }

    void pcTurnMessage(int itemsCountRest) {
        System.out.println("Количество выбранных компьютером спичек = " + itemsCountRest);
    }

    int userTurnCount(int itemsCountRest) {
        restItemsMessage(itemsCountRest);
        if (itemsCountRest > 1) {
            System.out.print(" - Ход игрока. Введите количество спичек: ");
            while (true) {
                Scanner scan = new Scanner(System.in);
                if (scan.hasNextInt()) {
                    int userItemsCount = scan.nextInt();
                    if (userItemsCount < 1 || userItemsCount > 3) {
                        System.out.print("Введите число от 1 до 3: ");
                    } else {
                        return userItemsCount;
                    }
                } else {
                    System.out.print("Введите число от 1 до 3: ");
                }
            }
        }
        return -1;
    }

    void gameIsOverMessage() {
        System.out.println("Для игрока осталась последняя спичка. Игрок проиграл!");
    }

}
