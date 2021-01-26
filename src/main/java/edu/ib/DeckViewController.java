package edu.ib;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class DeckViewController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ImageView deckImageView;

    @FXML
    private ImageView activeCardImageView;

    @FXML
    private ImageView Player1Card1;

    @FXML
    private ImageView Player1Card3;

    @FXML
    private ImageView Player1Card2;

    @FXML
    private ImageView Player1Card5;

    @FXML
    private ImageView Player1Card4;

    @FXML
    private ImageView Player2Card1;

    @FXML
    private ImageView Player2Card5;

    @FXML
    private ImageView Player2Card4;

    @FXML
    private ImageView Player2Card3;

    @FXML
    private ImageView Player2Card2;

    @FXML
    private Button nextCardButton;

    @FXML
    private Button AddCart;

    @FXML
    void addCardToStos(MouseEvent event) {

    }

    @FXML
    void mo(MouseEvent event) {

    }

    @FXML
    void nextCardButtonPushed(ActionEvent event) {

    }

    @FXML
    void onAddCart(ActionEvent event) {

    }

    @FXML
    void initialize() {
        assert deckImageView != null : "fx:id=\"deckImageView\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert activeCardImageView != null : "fx:id=\"activeCardImageView\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert Player1Card1 != null : "fx:id=\"Player1Card1\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert Player1Card3 != null : "fx:id=\"Player1Card3\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert Player1Card2 != null : "fx:id=\"Player1Card2\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert Player1Card5 != null : "fx:id=\"Player1Card5\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert Player1Card4 != null : "fx:id=\"Player1Card4\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert Player2Card1 != null : "fx:id=\"Player2Card1\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert Player2Card5 != null : "fx:id=\"Player2Card5\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert Player2Card4 != null : "fx:id=\"Player2Card4\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert Player2Card3 != null : "fx:id=\"Player2Card3\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert Player2Card2 != null : "fx:id=\"Player2Card2\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert nextCardButton != null : "fx:id=\"nextCardButton\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert AddCart != null : "fx:id=\"AddCart\" was not injected: check your FXML file 'DeckView.fxml'.";

    }
}
