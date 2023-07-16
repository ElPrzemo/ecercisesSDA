package Exercise199;


public class Poem extends Author {

    int StropheNumbers;

    Author creator;

    public Poem(String surname, String nationality, int stropheNumbers) {
        super(surname, nationality);
        StropheNumbers = stropheNumbers;

    }

    public int getStropheNumbers() {
        return StropheNumbers;
    }


}





