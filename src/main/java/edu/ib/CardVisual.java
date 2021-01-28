package edu.ib;

import java.util.Arrays;
import java.util.List;

public class CardVisual {

    public String faceName, suit;
    public String image;
    public String fileName;

    public CardVisual() {
    }

    public CardVisual(String faceName, String suit) {
        setFaceName(faceName);
        setSuit(suit);
        fileName = "/fxml/images/" +faceName+"_of_"+suit+".png";

    }

    public String getFileName() {
        return fileName;
    }

    public String getFaceName() {
        return faceName;
    }

    /**
     * Metoda zwraca liste nazw przodów kart
     * uzywanych w trakcie gry
     */

    public static List<String> getValidFaceNames()
    {
        return Arrays.asList("2","3","4","5","6","7","8","9","10","jack",
                "queen","king","ace");
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    /**
     *Metoda weryfikuje argumenty i ustawia zmienna
     * @param faceName 2,3,4,5,6,7,8,9,10,jack,queen,king
     */
    public void setFaceName(String faceName) {
        List<String> validFaceNames = getValidFaceNames();
        faceName = faceName.toLowerCase();

        if (validFaceNames.contains(faceName))
            this.faceName = faceName;
        else
            throw new IllegalArgumentException("Valid face names are: "+
                    validFaceNames);
    }

    public String getSuit() {
        return suit;
    }

    /**
     * Meoda zwraca liste kolorow
     * @return spades, hearts, clubs, diamonds
     */

    public static List<String> getValidSuits()
    {
        return Arrays.asList("hearts","diamonds","spades","clubs");
    }

    public void setSuit(String suit) {
        List<String> validSuits = getValidSuits();
        suit = suit.toLowerCase();

        if (validSuits.contains(suit))
            this.suit = suit;
        else
            throw new IllegalArgumentException("valid suits are: "+ validSuits);
    }

    public String toString()
    {
        return String.format("%s of %s", faceName, suit);
    }
}