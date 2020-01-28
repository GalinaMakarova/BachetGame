package com.company;

class GameLogic {
    private boolean gameStatus = true; //Game is not over by default
    private final int ITEMS_COUNT = 20; //final const value for game configuration in the feature
    private int itemsCountRest = ITEMS_COUNT;

    void startTheGame() {
        PCLogic pcLogic = new PCLogic();
        MessagesLogic messagesLogic = new MessagesLogic();
        while (gameStatus) {
            messagesLogic.restItemsMessage(itemsCountRest);
            int pcItemsCount = pcLogic.itemsCountForPCTurn(itemsCountRest);
            messagesLogic.pcTurnMessage(pcItemsCount);
            nextItemsCountRest(pcLogic.itemsCountForPCTurn(itemsCountRest));
            gameStatus = itemsCountRest > 1;
            if (gameStatus) {
                nextItemsCountRest(messagesLogic.userTurnCount(itemsCountRest));
            }
            gameStatus = itemsCountRest > 1;
        }
        messagesLogic.gameIsOverMessage();
    }

    private void nextItemsCountRest(int targetItemsCount) {
        itemsCountRest = itemsCountRest - targetItemsCount;
    }
}
