package com.company;

class PCLogic {
    private final int[] correctItemsCountArray = {20, 17, 13, 9, 5, 1};

    int itemsCountForPCTurn(int itemsCountRest) {
        int currentItemsCountIndex = 0;
        int nextItemsCountIndex = currentItemsCountIndex + 1;
        while (nextItemsCountIndex < correctItemsCountArray.length) {
            if (itemsCountRest <= correctItemsCountArray[currentItemsCountIndex] &&
                    itemsCountRest >= correctItemsCountArray[nextItemsCountIndex]) {
                return itemsCountRest - correctItemsCountArray[nextItemsCountIndex];
            } else {
                currentItemsCountIndex = nextItemsCountIndex;
                nextItemsCountIndex = nextItemsCountIndex + 1;
            }
        }
        return 0;
    }
}
