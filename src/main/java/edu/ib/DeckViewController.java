package edu.ib;

import java.net.URL;
import java.nio.file.Path;
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
    private ArrayList<String> Player1Patches = new ArrayList<>();
    private ArrayList<String> Player2Patches = new ArrayList<>();

    private DeckOfCards deck = new DeckOfCards();
    private Card card;
    private final Image imageBack = new Image(getClass().getResourceAsStream(deck.getBackOfCardImage()));
    private Player player;
    private ArrayList<Card> deck1 = Card.createDeck();
    private int[] stanP1 = new int[9];
    private int[] stanP2 = new int[9];
    private ArrayList <String> patches = new ArrayList<>();

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
//        images.add(images.lastIndexOf(images),Player1Card1.getImage());
        Player1Card1.setImage(imageBack);
        stanP1[0] = 1;
    }

    @FXML
    void onCardP1C2(MouseEvent event) {
        PlayedCards.setImage(Player1Card2.getImage());
        System.out.println(Player1Card2);
//        images.add(images.lastIndexOf(images),getPlayedCard(Player1Card2.getImage()));
        Player1Card2.setImage(imageBack);
        stanP1[1] = 1;
    }

    @FXML
    public void onCardP1C3(MouseEvent mouseEvent) {
        PlayedCards.setImage(Player1Card3.getImage());
//        images.add(images.lastIndexOf(images),Player1Card3.getImage());
        Player1Card3.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
        stanP1[2] = 1;
    }

    @FXML
    void onCardP1C4(MouseEvent event) {
        PlayedCards.setImage(Player1Card4.getImage());

//        images.add(images.lastIndexOf(images),Player1Card4.getImage());
        Player1Card4.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
        stanP1[3] = 1;

    }

    @FXML
    void onCardP1C5(MouseEvent event) {
        PlayedCards.setImage(Player1Card5.getImage());
//        images.add(images.lastIndexOf(images),Player1Card5.getImage());
        Player1Card5.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
        stanP1[4] = 1;

    }

    @FXML
    void onCardP1C6(MouseEvent event) {
        PlayedCards.setImage(Player1Card6.getImage());
//        images.add(images.lastIndexOf(images),Player1Card6.getImage());
        Player1Card6.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
        stanP1[5] = 1;

    }

    @FXML
    void onCardP1C7(MouseEvent event) {
        PlayedCards.setImage(Player1Card7.getImage());
//        images.add(images.lastIndexOf(images),Player1Card7.getImage());
        Player1Card7.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage()))); // obraz tylniej karty
        stanP1[6] = 1;

    }

    @FXML
    void onCardP1C8(MouseEvent event) {
        PlayedCards.setImage(Player1Card8.getImage());
//        images.add(images.lastIndexOf(images),Player1Card8.getImage());
        Player1Card8.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
        stanP1[7] = 1;

    }

    @FXML
    void onCardP1P9(MouseEvent event) {
        PlayedCards.setImage(Player1Card9.getImage());
//        images.add(images.lastIndexOf(images),Player1Card9.getImage());
        Player1Card9.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
        stanP1[8] = 1;

    }

    @FXML
    public void onCardP2C1(MouseEvent mouseEvent) {
        PlayedCards.setImage(Player2Card1.getImage());
//        images.add(images.lastIndexOf(images),Player2Card1.getImage());
        Player2Card1.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
        stanP2[0] = 1;
    }


    @FXML
    void onCardP2C2(MouseEvent event) {
        PlayedCards.setImage(Player2Card2.getImage());
//        images.add(images.lastIndexOf(images),Player2Card2.getImage());
        Player2Card2.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
        stanP2[1] = 1;
    }

    @FXML
    void onCardP2C3(MouseEvent event) {
        PlayedCards.setImage(Player2Card3.getImage());
//        images.add(images.lastIndexOf(images),Player1Card3.g);
        Player2Card3.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
        stanP2[2] = 1;
    }

    @FXML
    void onCardP2C4(MouseEvent event) {
        PlayedCards.setImage(Player2Card4.getImage());
//        images.add(images.lastIndexOf(images),Player2Card4.getImage());
        Player2Card4.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
        stanP2[3] = 1;
    }

    @FXML
    void onCardP2C5(MouseEvent event) {
        PlayedCards.setImage(Player2Card5.getImage());
//        images.add(images.lastIndexOf(images),Player2Card5.getImage());
        Player2Card5.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
        stanP2[4] = 1;
    }

    @FXML
    void onCardP2C6(MouseEvent event) {
        PlayedCards.setImage(Player2Card6.getImage());
//        images.add(images.lastIndexOf(images),Player2Card6.getImage());
        Player2Card6.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
        stanP2[5] = 1;
    }

    @FXML
    void onCardP2C7(MouseEvent mouseEvent) {
        PlayedCards.setImage(Player2Card7.getImage());
//        images.add(images.lastIndexOf(images),Player2Card7.getImage());
        Player2Card7.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
        stanP2[6] = 1;
    }

    @FXML
    void onCardP2C8(MouseEvent event) {
        PlayedCards.setImage(Player2Card8.getImage());
//        images.add(images.lastIndexOf(images),Player2Card8.getImage());
        Player2Card8.setImage(new Image(getClass().getResourceAsStream(deck.getBackOfCardImage())));
        stanP2[7] = 1;
    }

    @FXML
    void onCardP2C9(MouseEvent event) {
        PlayedCards.setImage(Player2Card9.getImage());
//        images.add(images.lastIndexOf(images),PlayedCards.getImage());
        Player2Card9.setImage(imageBack);
        stanP2[8] = 1;
    }

    @FXML
    void addCardToStos(MouseEvent event) {

    }

    @FXML
    void mo(MouseEvent event) {

    }
    // todo podłączyc zasady gry
    // todo no i to chyba wszystko
    // todo znaleźć metodę zbierającą nazwe pliku karty czyli np.: 7_of_coś tam

    @FXML
    void onBtnGetCard(ActionEvent event) {

        for (int i = 0; i < stanP1.length; i++){
            if( stanP1[i] == 1){
                stanP1[i] = 0;
                imagesPlayer1.get(i).setImage(images.get(0));
                images.remove(0);
                break;
            }
        }

//        for (int i = 0; i < imagesPlayer2.size(); i++) {
//            if (imagesPlayer1.get(i).getImage() == imageBack)
//                imagesPlayer1.get(i).setImage(new Image(getClass().getResourceAsStream(deck.dealTopCard().fileName)));
//        }
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
     * po kliku sprawdza, które karty zostały zagrane(odwrócone) i doda pierwsza kartę z góry.
     *
     * @param actionEvent
     */

    @FXML
    void onBtnP2TakeCard(ActionEvent actionEvent) {
        for (int i = 0; i < stanP2.length; i++) {
            if (stanP2[i] == 1) {
                stanP2[i] = 0;
                imagesPlayer2.get(i).setImage(images.get(0));
                images.remove(0);
                break;
            }
        }
    }

    /**
     * przywołanie parametrów numeru oraz koloru.
     */
    private CardVisual cardFace = new CardVisual();
    String face =  cardFace.getFaceName();
    String suit = cardFace.getSuit()+".png";

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
            String deckFile = deck.dealTopCard().fileName;
            images.add(new Image(getClass().getResourceAsStream(deckFile))); // stworzony stos kart!!!!
            patches.add(deckFile); // lista do zapisująca tylko ścieżki  kart
//            System.out.println( deckFile +" "+patches.get(i));
        }


        StackCards.setImage(imageBack);


        for (int i = 0; i < imagesPlayer1.size(); i++) {
            imagesPlayer1.get(i).setImage(images.get(0));
            images.remove(0);               // usuwa pobrana karte, pozostąłe przesuną się w lewo
            Player1Patches.add(patches.get(0)); // prowadzenie ścieżki karty
            patches.get(0);                     // usuwanie ścieżki żeby się nie powtarzała

            imagesPlayer2.get(i).setImage(images.get(0));
            images.remove(0);
            Player2Patches.add(patches.get(0)); // prowadzenie ścieżki karty
            patches.get(0);                     // usuwanie ścieżki żeby się nie powtarzała
        }


    }
//    private Image getPlayedCard (Image playedImage){
//         return new Image(getClass().getResourceAsStream());
//    }


}
