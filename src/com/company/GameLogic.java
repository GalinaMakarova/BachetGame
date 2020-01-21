package com.company;

class GameLogic {
    static boolean GameStatus = true; //Game is not over by default
    private static final int ITEMS_COUNT = 20; //final const value for game configuration in the feature
    static int itemsCountRest = ITEMS_COUNT;

    void startTheGame() {
        while (GameStatus) {
            MessagesLogic.restItemsMessage();
            PCLogic.itemsCountForPCTurn();
            nextItemsCountRest(PCLogic.pcItemsCount);
            MessagesLogic.pcTurnMessage(PCLogic.pcItemsCount);
            MessagesLogic.userTurnMessage();
            nextItemsCountRest(MessagesLogic.userItemsCount);
            GameStatus = itemsCountRest > 1;
        }
        MessagesLogic.gameIsOverMessage();
    }

    private void nextItemsCountRest(int targetItemsCount) {
        itemsCountRest = itemsCountRest - targetItemsCount;
    }
}
