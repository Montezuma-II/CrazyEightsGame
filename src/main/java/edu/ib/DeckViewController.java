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
    private DeckOfCards deck=new DeckOfCards();
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
    void onCardP1C1(ActionEvent event) {
        PlayedCards.setImage(Player1Card1.getImage());
        Player1Card1.setImage(new Image (getClass().getResourceAsStream(deck.getBackOfCardImage())));

    }

    @FXML
    void onCardP1C2(ActionEvent event) {
        PlayedCards.setImage(Player1Card2.getImage());
        Player1Card2.setImage(new Image (getClass().getResourceAsStream(deck.getBackOfCardImage())));


    }

    @FXML
    void onCardP1C4(MouseEvent event) {
        PlayedCards.setImage(Player1Card4.getImage());
        Player1Card4.setImage(new Image (getClass().getResourceAsStream(deck.getBackOfCardImage())));


    }

    @FXML
    void onCardP1C5(MouseEvent event) {
        PlayedCards.setImage(Player1Card5.getImage());
        Player1Card5.setImage(new Image (getClass().getResourceAsStream(deck.getBackOfCardImage())));


    }

    @FXML
    void onCardP1C6(MouseEvent event) {
        PlayedCards.setImage(Player1Card6.getImage());
        Player1Card6.setImage(new Image (getClass().getResourceAsStream(deck.getBackOfCardImage())));


    }

    @FXML
    void onCardP1C7(MouseEvent event) {
        PlayedCards.setImage(Player1Card7.getImage());
        Player1Card7.setImage(new Image (getClass().getResourceAsStream(deck.getBackOfCardImage())));


    }

    @FXML
    void onCardP1C8(MouseEvent event) {
        PlayedCards.setImage(Player1Card8.getImage());
        Player1Card8.setImage(new Image (getClass().getResourceAsStream(deck.getBackOfCardImage())));


    }

    @FXML
    void onCardP1P9(MouseEvent event) {
        PlayedCards.setImage(Player1Card9.getImage());
        Player1Card9.setImage(new Image (getClass().getResourceAsStream(deck.getBackOfCardImage())));


    }

    public void onCardP2C1(MouseEvent mouseEvent) {
    }


    @FXML
    void onCardP2C2(MouseEvent event) {

    }

    @FXML
    void onCardP2C3(MouseEvent event) {

    }

    @FXML
    void onCardP2C4(MouseEvent event) {

    }

    @FXML
    void onCardP2C5(MouseEvent event) {

    }

    @FXML
    void onCardP2C6(MouseEvent event) {

    }

    @FXML
    void onCardP2C8(MouseEvent event) {

    }

    @FXML
    void onCardP2C9(MouseEvent event) {

    }

    @FXML
    void addCardToStos(MouseEvent event) {

    }

    @FXML
    void mo(MouseEvent event) {

    }

    @FXML
    void onBtnGetCard(ActionEvent event) {

        for (int i = 0; i < imagesPlayer2.size(); i++) {
            if (imagesPlayer1.get(i).getImage() == imageBack)
                imagesPlayer1.get(i).setImage(new Image(getClass().getResourceAsStream(deck.dealTopCard().fileName)));
            if (imagesPlayer2.get(i).getImage() == imageBack)
                imagesPlayer2.get(i).setImage(new Image(getClass().getResourceAsStream(deck.dealTopCard().fileName)));
        }



    }

    @FXML
    void onBtnNewCard(ActionEvent event) {
        PlayedCards.setImage(new Image(getClass().getResourceAsStream(deck.dealTopCard().fileName)));

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
            images.add(new Image(getClass().getResourceAsStream(deck.dealTopCard().fileName)));
            //images.add(new Image(getClass().getResourceAsStream(player.takeCardFromTopOfDeck(deck1).));
        }


        StackCards.setImage(imageBack);


        for (int i = 0; i < imagesPlayer1.size(); i++) {
            imagesPlayer1.get(i).setImage(images.get(i));
            imagesPlayer2.get(i).setImage(images.get(i+10));

        }



    }


}
