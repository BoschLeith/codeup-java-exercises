package card_games;

import movies.Movie;

import java.util.Arrays;

public class Card {
	public String suit;
	public int value;

	public Card(String suit, int value){
		this.suit = suit;
		this.value = value;
	}

//	static Card[] addCard(Card[] array, Card card){
//		Card[] newArray = Arrays.copyOf(array, array.length + 1);
//		newArray[newArray.length - 1] = card;
//		return newArray;
//	}



	public static String valueToFace(Card card){
		String face = "";
		if (card.value == 11){
			face = "Jack";
		} else if (card.value == 12){
			face = "Queen";
		} else if (card.value == 13){
			face = "King";
		} else if (card.value == 14){
			face = "Ace";
		} else {
			face = String.valueOf(card.value);
		}
		return face;
	}

}
