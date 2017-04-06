package com.codecool.tinkertailor;

import java.util.ArrayList;
import java.util.List;

class TinkerTailor {

    int n, k;

    public TinkerTailor(final int n, final int k) {
        this.n = n;
        this.k = k;
    }

    public List<Integer> fillPlayersOrderList(final List<Integer> playersList) {
        for (int i = 1; i <= this.n; i++) {
            playersList.add(i);
        }
        return playersList;
    }

    public List<Integer> execute() {
        List<Integer> outcome = new ArrayList<>();
        List<Integer> playersList = new ArrayList<>();
        playersList = fillPlayersOrderList(playersList);

        int startIndex = 0;
        int removePlayerIdx;

        while (playersList.size() > 0) {
            removePlayerIdx = (this.k + startIndex - 1) % playersList.size();
            outcome.add(playersList.remove(removePlayerIdx));
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
