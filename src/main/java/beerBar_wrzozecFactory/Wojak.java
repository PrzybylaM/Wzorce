package beerBar_wrzozecFactory;

public class Wojak extends Beer{

    public Wojak(){
        beerType = BeerType.JASNE;
    }


    @Override
    public Beer getBeer() {
        return this;
    }

    @Override
    public String toString() {
        return "To jest wojak";
    }
}
