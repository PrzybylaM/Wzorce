package beerBar_wrzozecFactory;

public class LechFree extends Beer {

    public LechFree(){
        beerType = BeerType.BEZALKO;
    }

    @Override
    public Beer getBeer() {
        return this;
    }

    @Override
    public String toString() {
        return "To jest lech free";
    }
}
