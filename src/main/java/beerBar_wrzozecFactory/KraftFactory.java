package beerBar_wrzozecFactory;

public class KraftFactory implements BeerFactoryInterface {

    public Beer produceBeer(BeerType type) {
        Beer resoult = null;
        switch (type){
            case JASNE:
                resoult = new Wojak();
                break;
            case CIEMNE:
                resoult = new Faxe();
                break;
            case BEZALKO:
                resoult = new LechFree();
                break;

        }

        return resoult;
    }
}
