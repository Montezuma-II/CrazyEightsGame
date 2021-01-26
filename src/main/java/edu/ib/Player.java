package edu.ib;

import java.util.ArrayList;
import java.util.Collections;

public class Player implements PlayerActions {

    /**
     * Player or Computer
     */
    private String type;

    /**
     * Toggled to true once a player cannot play any cards in it's hand and there are no cards left in the deck
     */
    private boolean skippedRecentTurn;

    /**
     * Cards on-hand for the player
     */
    private ArrayList<Card> hand = new ArrayList<>();

    /**
     * Class constructor
     *
     * @param type Player or the Computer
     */
    public Player(String type) {
        type = type.toLowerCase();

        if (!type.equals("player") && !type.equals("player1")) {
            throw new RuntimeException("Player type \"" + type + "\" not recognized.");
        } else {
            this.type = type;
        }
    }

    public String toString() {
        return Character.toUpperCase(this.type.charAt(0)) + this.type.substring(1);
    }

    /**
     * Gives the player a card from the top of the deck and adjusts the deck
     *
     * @param deck Active card deck
     */
    public void takeCardFromTopOfDeck(ArrayList deck) {
        Card card = (Card) deck.get(0);

        this.hand.add(card);
        deck.remove(card);
    }

    /**
     * Player plays a card from their hand
     *
     * @param cardChoice The number assigned to the card via the command line interface
     * @return Pairs and returns a card object based on player's selection
     */
    public Card playCard(int cardChoice) {
        return this.hand.get(cardChoice - 1);
    }

    /**
     * Formats the player's hand in a human-readable manner
     *
     * @return Nice string of your hand paired with numerical input required for a decision
     */
    public String getHandAndChoices() {
        String niceHand = "Your hand ...... ";
        ArrayList<Integer> lengths = new ArrayList<>();

        // Row 1
        for (int i = 0; i < this.hand.size(); i++) {
            niceHand += this.hand.get(i) + ",  ";
            lengths.add(this.hand.get(i).toString().length());
        }
        niceHand = niceHand.substring(0, niceHand.length() - 3);

        // Row 2
        niceHand += "\nYour choices ... ";

        for (int i = 0; i < lengths.size(); i++) {
            int padding = lengths.get(i);

            // One less space in formatting
            if (i >= 10) {
                niceHand = niceHand.substring(0, niceHand.length() - 1);
            }

            niceHand += ("(" + (i + 1) + ")")
                    + String.join("", Collections.nCopies(padding, " "));
        }

        return niceHand.trim();
    }

    /**
     * Formats the player's options for a new suit after playing an 8
     *
     * @return Nice string of suits paired with numerical input required for a decision
     */
    public String getSuitsAndChoices() {
        String niceHand = "Suits .......... ";

        // Row 1
        for (String type : Card.CARD_TYPES) {
            niceHand += " " + Card.pairTypeWithUnicode(type) + " , ";
        }

        niceHand = niceHand.substring(0, niceHand.length() - 2);

        // Row 2
        niceHand += "\nYour choices ... ";

        for (int i = 0; i < Card.CARD_TYPES.length; i++) {
            niceHand += ("(" + (i + 1) + ")") + "  ";
        }

        return niceHand.trim();
    }


    /**
     * Returns the number of cards in a player's hand
     *
     * @return The number of cards in that hand
     */
    public int numberOfCardsInHand() {
        return this.hand.size();
    }

    /**
     * Exposes the player's hand
     *
     * @return The player's or the computer's hand
     */
    public ArrayList<Card> getHand() {
        return this.hand;
    }

    /**
     * Returns true/false whether or not the Player has a card to play
     *
     * @param newSuit If an "8" was played, it's the new suit to be played
     * @param topCard Top card
     * @return Whether or not Player has a card to play against the top card
     */
    public boolean canPlayCardThisTopCard(String newSuit, Card topCard) {
        boolean canPlay = false;

        for (Card card : this.hand) {

            if (card.getValue().equals("8")) {
                canPlay = true;
                break;
            }

            if (newSuit.length() > 0 && card.getType().equals(newSuit)) {
                canPlay = true;
                break;
            }

            if ((newSuit.length() == 0) && (card.getValue().equals(topCard.getValue())
                    || card.getType().equals(topCard.getType()))) {

                canPlay = true;
                break;
            }
        }

        return canPlay;
    }

    public boolean skipped() {
        return this.skippedRecentTurn;
    }


    public void setSkipStatus(boolean status) {
        this.skippedRecentTurn = status;
    }
}
/**
 * The Computer will play a card in it's hand
 *
 * @param newSuit If an "8" was played, it's the new suit to be played
 * @param topCard Last card played
 * @return The card the computer is playing for it's turn
 */
