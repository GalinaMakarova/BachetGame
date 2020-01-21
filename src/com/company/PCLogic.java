package com.company;

class PCLogic {
    private static final int[] correctItemsCountArray = {20, 17, 13, 9, 5, 1};
    private static int correctItemsCountIndex = 0;
    static int pcItemsCount = 0;

    static void itemsCountForPCTurn() {
        int nextIndex = correctItemsCountIndex + 1;
        while (true) {
            if (GameLogic.itemsCountRest <= correctItemsCountArray[correctItemsCountIndex] &&
                    GameLogic.itemsCountRest > correctItemsCountArray[nextIndex]) {
                correctItemsCountIndex = nextIndex;
                pcItemsCount = GameLogic.itemsCountRest - correctItemsCountArray[correctItemsCountIndex];
                break;
            } else {
                correctItemsCountIndex = nextIndex;
                nextIndex = nextIndex + 1;
            }
        }
    }
}
