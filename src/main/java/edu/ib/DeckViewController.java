package edu.ib;


import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class DeckViewController {

    private ArrayList<Image> images = new ArrayList<>();
    private ArrayList<ImageView> imagesPlayer1 = new ArrayList<>();
    private ArrayList<ImageView> imagesPlayer2 = new ArrayList<>();
    private ArrayList<String> Player1Patches = new ArrayList<>();
    private ArrayList<String> Player2Patches = new ArrayList<>();
    private  String PlayedPaths = "";
    private DeckOfCards deck = new DeckOfCards();
    private final Image imageBack = new Image(getClass().getResourceAsStream(deck.getBackOfCardImage()));
    private int[] stanP1 = new int[9];
    private int[] stanP2 = new int[9];
    private int status=1;

    private ArrayList <String> patches = new ArrayList<>();

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
    private Button btnP2NewCard;

    @FXML
    private Button btnP2TakeCard;

    @FXML
    private Button ClubButton;

    @FXML
    private Button DiamondsButton;

    @FXML
    private Button SpadesButton;

    @FXML
    private Button HeartsButton;


    public void AreYaWinnigSon(){
        int licznik=0;
        for(int i = 0; i < stanP1.length; i++){
            if(stanP1[i] == 1){
                licznik++;
            }
        }

        if(licznik == 9){
            editText.setText("Player 1 win!");

            Player1Card2.setDisable(true);
            Player1Card3.setDisable(true);
            Player1Card4.setDisable(true);
            Player1Card5.setDisable(true);
            Player1Card6.setDisable(true);
            Player1Card7.setDisable(true);
            Player1Card8.setDisable(true);
            Player1Card9.setDisable(true);

            Player2Card1.setDisable(true);
            Player2Card2.setDisable(true);
            Player2Card3.setDisable(true);
            Player2Card4.setDisable(true);
            Player2Card5.setDisable(true);
            Player2Card6.setDisable(true);
            Player2Card7.setDisable(true);
            Player2Card8.setDisable(true);
            Player2Card9.setDisable(true);
        }
    }

    public void IamWinnigDad(){
        int licznik=0;
        for(int i = 0; i < stanP2.length; i++){
            if(stanP2[i] == 1){
                licznik++;
            }
        }

        if(licznik == 9){
            editText.setText("Player 2 win!");

            Player1Card2.setDisable(true);
            Player1Card3.setDisable(true);
            Player1Card4.setDisable(true);
            Player1Card5.setDisable(true);
            Player1Card6.setDisable(true);
            Player1Card7.setDisable(true);
            Player1Card8.setDisable(true);
            Player1Card9.setDisable(true);

            Player2Card1.setDisable(true);
            Player2Card2.setDisable(true);
            Player2Card3.setDisable(true);
            Player2Card4.setDisable(true);
            Player2Card5.setDisable(true);
            Player2Card6.setDisable(true);
            Player2Card7.setDisable(true);
            Player2Card8.setDisable(true);
            Player2Card9.setDisable(true);
        }
    }

    /**
     * metoda porównująca wartości kart, oznaczająca kartę użytą, zmieniająca zapisaną kartę na stole
     * i ustawiająca karte na odwrócenie
     * @param nrC - numer tablicy pP
     * @param pP - tablica ścieżek kart w ręce
     * @param PC - imageView gdzie obraz się znajduje
     * @param s - status karty, dla gracza
     * @return
     */
    private String checkCart (int nrC, ArrayList pP,ImageView PC, int [] s) {

        if(s[nrC]==0) {
            String path = pP.get(nrC).toString();
            String[] part = path.split("of");
            String[] played = PlayedPaths.split("of");
            if (part[0].equals("/fxml/images/8_")) {
                HeartsButton.setDisable(false);
                SpadesButton.setDisable(false);
                DiamondsButton.setDisable(false);
                ClubButton.setDisable(false);
                PlayedCards.setImage(PC.getImage());
                PC.setImage(imageBack);
                s[nrC] = 1;

            }else if (part[0].equals(played[0]) || part[1].equals(played[1])) {
                PlayedCards.setImage(PC.getImage());
                PC.setImage(imageBack);
                s[nrC] = 1;
                PlayedPaths = pP.get(nrC).toString();
            }
        }
        status*=-1;

        if(status == 1){
            editText.setText("p1");
        }if(status == -1){
            editText.setText("p2");
        }

        return  PlayedPaths;
    }

    @FXML
    void onCardP1C1(MouseEvent event) {
        if (status == 1) {
            AreYaWinnigSon();
            checkCart(0, Player1Patches, Player1Card1, stanP1);
        }
    }

    @FXML
    void onCardP1C2(MouseEvent event) {
        if (status ==1) {
            AreYaWinnigSon();
            checkCart(1, Player1Patches, Player1Card2, stanP1);
        }
    }

    @FXML
    public void onCardP1C3(MouseEvent mouseEvent) {
        if (status==1) {
            AreYaWinnigSon();
            checkCart(2, Player1Patches, Player1Card3, stanP1);
        }
    }

    @FXML
    void onCardP1C4(MouseEvent event) {
        if (status == 1) {
            AreYaWinnigSon();
            checkCart(3, Player1Patches, Player1Card4, stanP1);
        }
    }

    @FXML
    void onCardP1C5(MouseEvent event) {
        if (status == 1) {
            AreYaWinnigSon();
            checkCart(4, Player1Patches, Player1Card5, stanP1);
        }
    }

    @FXML
    void onCardP1C6(MouseEvent event) {
        if(status==1) {
            AreYaWinnigSon();
            checkCart(5, Player1Patches, Player1Card6, stanP1);
        }
    }

    @FXML
    void onCardP1C7(MouseEvent event) {
        if (status==1) {
            AreYaWinnigSon();
            checkCart(6, Player1Patches, Player1Card7, stanP1);
        }
    }

    @FXML
    void onCardP1C8(MouseEvent event) {
        if (status==1) {
            AreYaWinnigSon();
            checkCart(7, Player1Patches, Player1Card8, stanP1);
        }
    }

    @FXML
    void onCardP1P9(MouseEvent event) {
        if(status==1) {
            AreYaWinnigSon();
            checkCart(8, Player1Patches, Player1Card9, stanP1);
        }
    }

    @FXML
    public void onCardP2C1(MouseEvent mouseEvent) {
        if(status==-1) {
            IamWinnigDad();
            checkCart(0, Player2Patches, Player2Card1, stanP2);
        }
    }


    @FXML
    void onCardP2C2(MouseEvent event) {
        if (status ==-1) {
            IamWinnigDad();
            checkCart(1, Player2Patches, Player2Card2, stanP2);
        }
    }


    @FXML
    void onCardP2C3(MouseEvent event) {
        if (status==-1) {
            IamWinnigDad();
            checkCart(2, Player2Patches, Player2Card3, stanP2);
        }
    }

    @FXML
    void onCardP2C4(MouseEvent event) {
        if (status == -1) {
            IamWinnigDad();
            checkCart(3, Player2Patches, Player2Card4, stanP2);
        }
    }

    @FXML
    void onCardP2C5(MouseEvent event) {
        if (status == -1) {
            IamWinnigDad();
            checkCart(4, Player2Patches, Player2Card5, stanP2);
        }
    }

    @FXML
    void onCardP2C6(MouseEvent event) {
        if (status == -1) {
            IamWinnigDad();
            checkCart(5, Player2Patches, Player2Card6, stanP2);
        }
    }

    @FXML
    void onCardP2C7(MouseEvent mouseEvent) {
        if(status==-1) {
            IamWinnigDad();
            checkCart(6, Player2Patches, Player2Card7, stanP2);
        }
    }

    @FXML
    void onCardP2C8(MouseEvent event) {
        if(status == -1) {
            IamWinnigDad();
            checkCart(7, Player2Patches, Player2Card8, stanP2);
        }
    }


    @FXML
    void onCardP2C9(MouseEvent event) {
        if(status == -1) {
            IamWinnigDad();
            checkCart(8, Player2Patches, Player2Card9, stanP2);
        }
    }



    @FXML
    void onStackPressed(MouseEvent event) {

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
                Player1Patches.set(i,patches.get(0));
                patches.remove(0);
                images.remove(0);
                break;
            }
        }
    }

    @FXML
    void onBtnNewCard(ActionEvent event) {
        PlayedCards.setImage(images.get(0)); // pobiera pierwszą kartę z listy images
        PlayedPaths=patches.get(0);
        patches.remove(0);
        images.remove(0); // usuwa pobraną karte

        Player1Card1.setDisable(false);
        Player1Card2.setDisable(false);
        Player1Card3.setDisable(false);
        Player1Card4.setDisable(false);
        Player1Card5.setDisable(false);
        Player1Card6.setDisable(false);
        Player1Card7.setDisable(false);
        Player1Card8.setDisable(false);
        Player1Card9.setDisable(false);

        Player2Card1.setDisable(false);
        Player2Card2.setDisable(false);
        Player2Card3.setDisable(false);
        Player2Card4.setDisable(false);
        Player2Card5.setDisable(false);
        Player2Card6.setDisable(false);
        Player2Card7.setDisable(false);
        Player2Card8.setDisable(false);
        Player2Card9.setDisable(false);

        btnGetCard.setDisable(false);
        btnP2TakeCard.setDisable(false);
    }

    @FXML
    void onBtnP2NW(ActionEvent actionEvent) {
        PlayedCards.setImage(images.get(0)); // pobiera pierwszą kartę z listy images
        PlayedPaths=patches.get(0);
        patches.remove(0);
        images.remove(0); // usuwa pobraną karte

        Player1Card1.setDisable(false);
        Player1Card2.setDisable(false);
        Player1Card3.setDisable(false);
        Player1Card4.setDisable(false);
        Player1Card5.setDisable(false);
        Player1Card6.setDisable(false);
        Player1Card7.setDisable(false);
        Player1Card8.setDisable(false);
        Player1Card9.setDisable(false);

        Player2Card1.setDisable(false);
        Player2Card2.setDisable(false);
        Player2Card3.setDisable(false);
        Player2Card4.setDisable(false);
        Player2Card5.setDisable(false);
        Player2Card6.setDisable(false);
        Player2Card7.setDisable(false);
        Player2Card8.setDisable(false);
        Player2Card9.setDisable(false);

        btnGetCard.setDisable(false);
        btnP2TakeCard.setDisable(false);
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
                Player2Patches.set(i,patches.get(0));
                patches.remove(0);
                images.remove(0);
                break;
            }
        }
    }

    @FXML
    private TextField editText;

    @FXML
    void onClubsButton(ActionEvent event) {
        PlayedPaths = "/fxml/images/8_of_clubs.png";
        HeartsButton.setDisable(true);
        SpadesButton.setDisable(true);
        DiamondsButton.setDisable(true);
        ClubButton.setDisable(true);

    }

    @FXML
    void onDiamondsButton(ActionEvent event) {
        PlayedPaths = "/fxml/images/8_of_diamonds.png";
        HeartsButton.setDisable(true);
        SpadesButton.setDisable(true);
        DiamondsButton.setDisable(true);
        ClubButton.setDisable(true);

    }

    @FXML
    void onHeartsButton(ActionEvent event) {
        PlayedPaths = "/fxml/images/8_of_hearts.png";
        HeartsButton.setDisable(true);
        SpadesButton.setDisable(true);
        DiamondsButton.setDisable(true);
        ClubButton.setDisable(true);


    }

    @FXML
    void onSpadesButton(ActionEvent event) {
        PlayedPaths = "/fxml/images/8_of_spades.png";
        HeartsButton.setDisable(true);
        SpadesButton.setDisable(true);
        DiamondsButton.setDisable(true);
        ClubButton.setDisable(true);

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
        assert btnP2NewCard != null : "fx:id=\"btnNewCard\" was not injected: check your FXML file 'DeckView.fxml'.";
        assert btnP2TakeCard != null : "fx:id=\"btnGetCard\" was not injected: check your FXML file 'DeckView.fxml'.";

        HeartsButton.setDisable(true);
        SpadesButton.setDisable(true);
        DiamondsButton.setDisable(true);
        ClubButton.setDisable(true);

        editText.setText("p1");

        deck = new DeckOfCards();
        deck.shuffle();

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


        Player1Card1.setDisable(true);
        Player1Card2.setDisable(true);
        Player1Card3.setDisable(true);
        Player1Card4.setDisable(true);
        Player1Card5.setDisable(true);
        Player1Card6.setDisable(true);
        Player1Card7.setDisable(true);
        Player1Card8.setDisable(true);
        Player1Card9.setDisable(true);

        Player2Card1.setDisable(true);
        Player2Card2.setDisable(true);
        Player2Card3.setDisable(true);
        Player2Card4.setDisable(true);
        Player2Card5.setDisable(true);
        Player2Card6.setDisable(true);
        Player2Card7.setDisable(true);
        Player2Card8.setDisable(true);
        Player2Card9.setDisable(true);

        btnGetCard.setDisable(true);
        btnP2TakeCard.setDisable(true);


        for (int i = 0; i < 52; i++) {
            String deckFile = deck.dealTopCard().fileName;
            images.add(new Image(getClass().getResourceAsStream(deckFile))); // stworzony stos kart!!!!
            patches.add(deckFile); // lista do zapisująca tylko ścieżki  kart
        }


        StackCards.setImage(imageBack);


        for (int i = 0; i < imagesPlayer1.size(); i++) {
            imagesPlayer1.get(i).setImage(images.get(0));
            images.remove(0);               // usuwa pobrana karte, pozostąłe przesuną się w lewo
            Player1Patches.add(patches.get(0)); // prowadzenie ścieżki karty
            patches.remove(0);                     // usuwanie ścieżki żeby się nie powtarzała

            imagesPlayer2.get(i).setImage(images.get(0));
            images.remove(0);
            Player2Patches.add(patches.get(0)); // prowadzenie ścieżki karty
            patches.remove(0);                     // usuwanie ścieżki żeby się nie powtarzała
        }


    }


//    private Image getPlayedCard (Image playedImage){
//         return new Image(getClass().getResourceAsStream());
//    }


}
