package edu.ib;

import java.util.ArrayList;

public interface PlayerActions {

    void takeCardFromTopOfDeck(ArrayList deck);

    Card playCard(int cardChoice);

}
