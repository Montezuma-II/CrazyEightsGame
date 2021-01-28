package edu.ib;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DeckOfCards {
    private ArrayList<CardVisual> deck;
    private String backOfCardImage;

    /**
     * Konstruktor tworzacy talie kart
     */
    public DeckOfCards()
    {
        List<String> suits = CardVisual.getValidSuits();
        List<String> faceNames = CardVisual.getValidFaceNames();

        deck = new ArrayList<>();

        for (String suit:suits)
        {
            for (String faceName:faceNames)
                deck.add(new CardVisual(faceName,suit));
        }
        backOfCardImage = "/fxml/images/backOfCard.png";
    }

    public ArrayList<CardVisual> getDeck() {
        return deck;
    }

    public void setDeck(ArrayList<CardVisual> deck) {
        this.deck = deck;
    }

    public String getBackOfCardImage() {
        return backOfCardImage;
    }

    public void setBackOfCardImage(String backOfCardImage) {
        this.backOfCardImage = backOfCardImage;
    }

    /**
     * Metoda wyrzucajaca pierwsza karte na stol
     */
    public CardVisual dealTopCard()
    {
        if (deck.size()>0)
            return deck.remove(0);
        else
            return null;
    }
    public void shuffle()
    {
        Collections.shuffle(deck);
    }
}

