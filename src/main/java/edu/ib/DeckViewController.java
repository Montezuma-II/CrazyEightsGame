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

    private DeckOfCards deck;

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView Player2Card1;

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
    void DragCardP1C1(MouseEvent event) {

        PlayedCards.setImage(Player1Card1.getImage());
        Player1Card1.setImage(StackCards.getImage());

    }

    @FXML
    void DragCardP1C2(MouseEvent event) {

    }

    @FXML
    void DragCardP1C3(MouseEvent event) {

    }

    @FXML
    void DragCardP1C4(MouseEvent event) {

    }

    @FXML
    void DragCardP1C5(MouseEvent event) {

    }

    @FXML
    void DragCardP1C6(MouseEvent event) {

    }

    @FXML
    void DragCardP1C7(MouseEvent event) {

    }

    @FXML
    void DragCardP1C8(MouseEvent event) {

    }

    @FXML
    void DragCardP1C9(MouseEvent event) {

    }

    @FXML
    void DragCardP2C1(MouseEvent event) {

    }

    @FXML
    void DragCardP2C2(MouseEvent event) {

    }

    @FXML
    void DragCardP2C3(MouseEvent event) {

    }

    @FXML
    void DragCardP2C4(MouseEvent event) {

    }

    @FXML
    void DragCardP2C5(MouseEvent event) {

    }

    @FXML
    void DragCardP2C6(MouseEvent event) {

    }

    @FXML
    void DragCardP2C7(MouseEvent event) {

    }

    @FXML
    void DragCardP2C8(MouseEvent event) {

    }

    @FXML
    void DragCardP2C9(MouseEvent event) {

    }

    @FXML
    void addCardToStos(MouseEvent event) {



    }

    @FXML
    void mo(MouseEvent event) {

    }

    @FXML
    void onBtnGetCard(ActionEvent event) {

    }

    @FXML
    void onBtnNewCard(ActionEvent event) {

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

            ArrayList<ImageView> images=new ArrayList<>();
            images.add(Player1Card1);
        Image image0 = new Image(getClass().getResourceAsStream(deck.dealTopCard().getFileName()));

        images.get(0).setImage(image0);

        //Image image0 = new Image(getClass().getResourceAsStream(deck.dealTopCard().getFileName()));
        Image image1 = new Image(getClass().getResourceAsStream(deck.dealTopCard().getFileName()));
        Image image2 = new Image(getClass().getResourceAsStream(deck.dealTopCard().getFileName()));
        Image image3 = new Image(getClass().getResourceAsStream(deck.dealTopCard().getFileName()));
        Image image4 = new Image(getClass().getResourceAsStream(deck.dealTopCard().getFileName()));
        Image image5 = new Image(getClass().getResourceAsStream(deck.dealTopCard().getFileName()));
        Image image6 = new Image(getClass().getResourceAsStream(deck.dealTopCard().getFileName()));
        Image image7 = new Image(getClass().getResourceAsStream(deck.dealTopCard().getFileName()));
        Image image8 = new Image(getClass().getResourceAsStream(deck.dealTopCard().getFileName()));
        Image image9 = new Image(getClass().getResourceAsStream(deck.dealTopCard().getFileName()));

        //Player1Card1.setImage(image0);
        Player1Card2.setImage(image1);
        Player1Card3.setImage(image2);
        Player1Card4.setImage(image3);
        Player1Card5.setImage(image4);
        Player1Card6.setImage(image5);
        Player1Card7.setImage(image6);
        Player1Card8.setImage(image7);
        Player1Card9.setImage(image8);
       // Player2Card1.setImage(image10);

        Image image10 = new Image(getClass().getResourceAsStream(deck.getBackOfCardImage()));

        StackCards.setImage(image10);


        //Image image1 = new Image(getClass().getResourceAsStream(deck.getBackOfCardImage()));
        //.setImage(image1);




    }
}
