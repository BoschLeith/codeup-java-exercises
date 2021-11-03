package card_games;

import util.Input;

public class GameOfWar {

	public static Player startWarGame(){
		Input input = new Input();

		System.out.println("Welcome to War");
		System.out.println("Please enter your name: ");
		String userName = input.getString();
		return new Player(userName);
	}

	public static void runWarGame(){
		Player player = startWarGame();
		Card[] shuffledDeck = CardsArray.shuffle();

		for(int i = 0; i < shuffledDeck.length; i+=2){
			if (shuffledDeck[i].value > shuffledDeck[i+1].value){
				System.out.printf("%s's card is a %s of %s%n",player.name, Card.valueToFace(shuffledDeck[i]), shuffledDeck[i].suit);
				System.out.printf("Computer's card is a %s of %s%n", Card.valueToFace(shuffledDeck[i+1]), shuffledDeck[i+1].suit);
				System.out.printf("%s Wins%n", player.name);
			} else if (shuffledDeck[i].value < shuffledDeck[i+1].value){
				System.out.printf("%s's card is a %s of %s%n",player.name, Card.valueToFace(shuffledDeck[i]), shuffledDeck[i].suit);
				System.out.printf("Computer's card is a %s of %s%n", Card.valueToFace(shuffledDeck[i+1]), shuffledDeck[i+1].suit);
				System.out.println("Computer Wins");
			} else if (shuffledDeck[i].value == shuffledDeck[i+1].value){
				System.out.printf("%s's card is a %s of %s%n",player.name, Card.valueToFace(shuffledDeck[i]), shuffledDeck[i].suit);
				System.out.printf("Computer's card is a %s of %s%n", Card.valueToFace(shuffledDeck[i+1]), shuffledDeck[i+1].suit);
				System.out.printf("%s and Computer tie%n", player.name);
			}
		}
	}

	public static void shuffleDeck(){
		for (Card card : CardsArray.shuffle()){
			System.out.printf("%d of %s%n", card.value, card.suit);
		}
	}





	public static void main(String[] args) {
		runWarGame();
	}
}
