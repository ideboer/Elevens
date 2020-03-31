1) If you were playing Elevens at your desk, you would need a deck of cards, somewhere to place the cards, 9 dealt cards, the stack of cards you have removed, and yourself (the player but also the dealer). The private instance variables you would need are: deck (of type Deck) and dealt (of type Card[]).

2)  Shuffle the deck;
    Deal 9 cards;
    While a move is possible,
        if there is a pair that sums to 11,
            remove the pair;
            replace it with cards from the deck if there are cards left to do so;
        if there is a K-Q-J combo,
            remove those 3 cards;
            replace them with cards from the deck if there are cards left to do so;
    if the deck is empty and there are no cards on the table;
        you win!
    otherwise 
        you lose :(

3) It looks like ElevensBoard contains all the necessary methods to play the game, I just need to implement some of them later on.

4) 
    a) dealMyCards is called on line 59 in the constructor and on line 68 in the newGame method.
    
    b) The public methods isLegal and anotherPlayIsPossible should call the containsPairSum11 and containsJQK methods.

    c) cards -> 0      | 1      | 2    | 3      | 4    | 5    | 6      | 7      | 8
                J of H | 6 of C | null | 2 of S | null | null | A of S | 4 of H | null

       returned -> 0 | 1 | 2 | 3 | 4 | 5 | 6 | 7 | 8
       list        0 | 1 | 3 | 6 | 7 |   |   |   |

    d) 
    public static printCards(ElevensBoard board) {
        List<Integer> cIndexes = board.cardIndexes();

        for(int i = 0; i < cIndexes.size(); i++) {
            System.out.println(board.cardAt(i).toString())
        }
    }

    e) anotherPlayIsPossible needs to call the cardIndexes method before calling the containsPairsum11 and containsJQK methods so it can check if any other pairs of cards sum to 11 or are a JQK combo. It should only check for these out of the non-null cards on the board, which is why it should only check what is returned by cardIndexes.
