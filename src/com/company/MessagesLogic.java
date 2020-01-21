package com.company;

import java.util.Scanner;

class MessagesLogic {
    static int userItemsCount = 1;

    static void restItemsMessage() {
        System.out.println("На столе осталось " + GameLogic.itemsCountRest + " спичек.");
    }

    static void pcTurnMessage(int itemsCount) {
        System.out.println("Количество выбранных компьютером спичек = " + itemsCount);
    }

    static void userTurnMessage() {
        restItemsMessage();
        if (GameLogic.itemsCountRest > 1) {
            System.out.print(" - Ход игрока. Введите количество спичек: ");
            while (true) {
                Scanner scan = new Scanner(System.in);
                if (scan.hasNextInt()) {
                    userItemsCount = scan.nextInt();
                    if (userItemsCount < 1 || userItemsCount > 3) {
                        System.out.print("Введите число от 1 до 3: ");
                    } else {
                        break;
                    }
                } else {
                    System.out.print("Введите число от 1 до 3: ");
                }
            }
        }
    }

    static void gameIsOverMessage() {
        if (!GameLogic.GameStatus) {
            System.out.println("Для игрока осталась последняя спичка. Игрок проиграл!");
        }
    }

}
