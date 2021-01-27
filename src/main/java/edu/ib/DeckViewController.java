package edu.ib;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class DeckViewController {

    private ArrayList<Image> images = new ArrayList<>();
    private ArrayList<ImageView> imagesPlayer1 = new ArrayList<>();
    private ArrayList<ImageView> imagesPlayer2 = new ArrayList<>();
    private DeckOfCards deck = new DeckOfCards();
    private Card card;
    private Image imageBack = new Image(getClass().getResourceAsStream(deck.getBackOfCardImage()));
    private Player player;
    private ArrayList<Card> deck1 = Card.createDeck();


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView Player2Card1;

    @FXML
    private ImageView Player2Card2;

    @FXML
    private ImageView Player2Card3;

    @FXML
    private ImageView Player2Card4;

    @FXML
    private ImageView Player2Card5;

    @FXML
    private ImageView Player2Card6;

    @FXML
    private ImageView Player2Card7;

    @FXML
    private ImageView Player2Card8;

    @FXML
    private ImageView Player2Card9;


    @FXML
    private ImageView Player1Card2;

    @FXML
    private ImageView Player1Card3;

    @FXML
    private ImageView Player1Card4;

    @FXML
    private ImageView Player1Card5;

    @FXML
    private ImageView Player1Card6;

    @FXML
    private ImageView Player1Card7;

    @FXML
    private ImageView Player1Card8;

    @FXML
    private ImageView Player1Card9;

    @FXML
    private ImageView Player1Card1;

    @FXML
    private ImageView StackCards;

    @FXML
    private ImageView PlayedCards;

    @FXML
    private Button btnNewCard;

    @FXML
    private Button btnGetCard;


    @FXML
    void onCardP1C1(MouseEvent event) {
        PlayedCards.setImage(Player1Card1.getImage());
        Player1Card1.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
//        images.add(Player1Card1.getImage(),images.lastIndexOf());
    }

    @FXML
    void onCardP1C2(MouseEvent event) {
        PlayedCards.setImage(Player1Card2.getImage());
        Player1Card2.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
    }

    @FXML
    public void onCardP1C3(MouseEvent mouseEvent) {
        PlayedCards.setImage(Player1Card3.getImage());
        Player1Card3.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
    }

    @FXML
    void onCardP1C4(MouseEvent event) {
        PlayedCards.setImage(Player1Card4.getImage());
        Player1Card4.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));


    }

    @FXML
    void onCardP1C5(MouseEvent event) {
        PlayedCards.setImage(Player1Card5.getImage());
        Player1Card5.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));


    }

    @FXML
    void onCardP1C6(MouseEvent event) {
        PlayedCards.setImage(Player1Card6.getImage());
        Player1Card6.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));


    }

    @FXML
    void onCardP1C7(MouseEvent event) {
        PlayedCards.setImage(Player1Card7.getImage());
        Player1Card7.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage()))); // obraz tylniej karty


    }

    @FXML
    void onCardP1C8(MouseEvent event) {
        PlayedCards.setImage(Player1Card8.getImage());
        Player1Card8.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));


    }

    @FXML
    void onCardP1P9(MouseEvent event) {
        PlayedCards.setImage(Player1Card9.getImage());
        Player1Card9.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));


    }

    @FXML
    public void onCardP2C1(MouseEvent mouseEvent) {
        PlayedCards.setImage(Player2Card1.getImage());
        Player2Card1.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
    }


    @FXML
    void onCardP2C2(MouseEvent event) {
        PlayedCards.setImage(Player2Card2.getImage());
        Player2Card2.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
    }

    @FXML
    void onCardP2C3(MouseEvent event) {
        PlayedCards.setImage(Player2Card3.getImage());
        Player2Card3.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
    }

    @FXML
    void onCardP2C4(MouseEvent event) {
        PlayedCards.setImage(Player2Card4.getImage());
        Player2Card4.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
    }

    @FXML
    void onCardP2C5(MouseEvent event) {
        PlayedCards.setImage(Player2Card5.getImage());
        Player2Card5.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
    }

    @FXML
    void onCardP2C6(MouseEvent event) {
        PlayedCards.setImage(Player2Card6.getImage());
        Player2Card6.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
    }

    @FXML
    void onCardP2C7(MouseEvent mouseEvent) {
        PlayedCards.setImage(Player2Card7.getImage());
        Player2Card7.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
    }

    @FXML
    void onCardP2C8(MouseEvent event) {
        PlayedCards.setImage(Player2Card8.getImage());
        Player2Card8.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
    }

    @FXML
    void onCardP2C9(MouseEvent event) {
        PlayedCards.setImage(Player2Card9.getImage());
        Player2Card9.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
    }

    @FXML
    void addCardToStos(MouseEvent event) {

    }

    @FXML
    void mo(MouseEvent event) {

    }
    // todo podłączyc zasady gry
    // todo podłączyć dobieranie kart
    // todo onBtnNewCard w .dealTopCard widzi null'a
    // todo no i to chyba wszystko

    @FXML
    void onBtnGetCard(ActionEvent event) {
        for (int i = 0; i < imagesPlayer2.size(); i++) {
            if (imagesPlayer1.get(i).getImage() == imageBack)
                imagesPlayer1.get(i).setImage(new Image(getClass().getResourceAsStream(deck.dealTopCard().fileName)));
        }
    }

    @FXML
    void onBtnNewCard(ActionEvent event) {
//        PlayedCards.setImage(new Image(getClass().getResourceAsStream(deck.dealTopCard().fileName)));
        PlayedCards.setImage(images.get(0)); // pobiera pierwszą kartę z listy images
        images.remove(0); // usuwa pobraną karte
    }

    @FXML
    void onBtnP2NW(ActionEvent actionEvent) {

    }

    /**
     * po kliku sprawdza ktre karty zostały zagrane(odwrócone) i doda pierwsza kartę z góry.
     * @param actionEvent
     */

    @FXML
    void onBtnP2TakeCard(ActionEvent actionEvent) {
        for(int i = 0; i<imagesPlayer2.size();i++) {
            if (imagesPlayer2.get(i).getImage() == imageBack)
                imagesPlayer2.get(i).setImage(images.get(0));
                images.remove(0);
        }
    }

    @FXML
    void initialize() {
        assert Player2Card1 != null : "fx:id=\"Player2Card1\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert Player1Card2 != null : "fx:id=\"Player1Card2\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert Player1Card3 != null : "fx:id=\"Player1Card3\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert Player1Card4 != null : "fx:id=\"Player1Card4\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert Player1Card5 != null : "fx:id=\"Player1Card5\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert Player1Card6 != null : "fx:id=\"Player1Card6\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert Player1Card7 != null : "fx:id=\"Player1Card7\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert Player1Card8 != null : "fx:id=\"Player1Card8\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert Player1Card9 != null : "fx:id=\"Player1Card9\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert Player1Card1 != null : "fx:id=\"Player1Card1\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert StackCards != null : "fx:id=\"StackCards\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert PlayedCards != null : "fx:id=\"PlayedCards\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert btnNewCard != null : "fx:id=\"btnNewCard\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert btnGetCard != null : "fx:id=\"btnGetCard\" was not injected: check your FXML file 'DeckView.fxml'.";

        deck = new DeckOfCards();
        deck.shuffle();



        /*ArrayList<String> imagesPlayer1=new ArrayList<>();
        for(int i=0;i<10;i++){
        imagesPlayer1.add("Player1Card"+i);
*/

        imagesPlayer1.add(Player1Card1);
        imagesPlayer1.add(Player1Card2);
        imagesPlayer1.add(Player1Card3);
        imagesPlayer1.add(Player1Card4);
        imagesPlayer1.add(Player1Card5);
        imagesPlayer1.add(Player1Card6);
        imagesPlayer1.add(Player1Card7);
        imagesPlayer1.add(Player1Card8);
        imagesPlayer1.add(Player1Card9);


        imagesPlayer2.add(Player2Card1);
        imagesPlayer2.add(Player2Card2);
        imagesPlayer2.add(Player2Card3);
        imagesPlayer2.add(Player2Card4);
        imagesPlayer2.add(Player2Card5);
        imagesPlayer2.add(Player2Card6);
        imagesPlayer2.add(Player2Card7);
        imagesPlayer2.add(Player2Card8);
        imagesPlayer2.add(Player2Card9);


        for (int i = 0; i < 52; i++) {
            images.add(new Image(getClass().getResourceAsStream(deck.dealTopCard().fileName))); // stworzony stos kart!!!!
            //images.add(new Image(getClass().getResourceAsStream(player.takeCardFromTopOfDeck(deck1).));
        }


        StackCards.setImage(imageBack);


        for (int i = 0; i < imagesPlayer1.size(); i++) {
            imagesPlayer1.get(i).setImage(images.get(0));
            images.remove(0); // usuwa pobrana karte, pozostąłe przesuną się w lewo
            imagesPlayer2.get(i).setImage(images.get(0));
            images.remove(0);
        }


    }


}
