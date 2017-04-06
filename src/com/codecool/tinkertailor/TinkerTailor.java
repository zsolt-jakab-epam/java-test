package com.codecool.tinkertailor;

import java.util.ArrayList;
import java.util.List;

class TinkerTailor {

    int n, k;

    public TinkerTailor(int n, int k) {
        this.n = n;
        this.k = k;
    }

    public List fillPlayersOrderList (List<Integer> playersList) {
        for (int i = 0; i < this.n; i++){
            playersList.add(i+1);
        }
        return playersList;
    }

    public List execute() {
        List<Integer> outcome = new ArrayList<>();
        List<Integer> playersList = new ArrayList<>();
        playersList = fillPlayersOrderList(playersList);

        int startIndex = 0;
        int reminder;
        int removePlayerIdx;
        int excludedPlayer;

        while (playersList.size() > 0) {
            reminder = this.k % playersList.size();
            removePlayerIdx = (reminder - 1) + startIndex;
            if (removePlayerIdx < 0) {
                removePlayerIdx = playersList.size() - 1;
            }
            excludedPlayer = playersList.get(removePlayerIdx);
            playersList.remove(removePlayerIdx);
            outcome.add(excludedPlayer);
            startIndex = removePlayerIdx;
        }
        /*
        outcome.add(3);
        outcome.add(1);
        outcome.add(5);
        outcome.add(2);
        outcome.add(4);
        */
        // Works for n = 5 and k = 3
        // Well, you should come up with a more general algorithm :)

        return outcome;
    }
}