package beerBar_wrzozecFactory;

public class Faxe extends Beer{

    public Faxe(){
        beerType = BeerType.CIEMNE;
    }


    @Override
    public Beer getBeer() {
        return this;
    }

    @Override
    public String toString() {
        return "To jest faxe";
    }
}
