package beerBar_wrzozecFactory;


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world");

        BeerFactoryInterface beerFactory = new KraftFactory();
        Beer jasne = beerFactory.produceBeer(BeerType.JASNE);
        Beer ciemne = beerFactory.produceBeer(BeerType.CIEMNE);
        Beer bezAlko = beerFactory.produceBeer(BeerType.BEZALKO);
        System.out.println(jasne.getBeer());
        System.out.println(ciemne.getBeer());
        System.out.println(bezAlko.getBeer());
    }
}
