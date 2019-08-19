package user;


import beerBar_wrzozecFactory.Beer;
import beerBar_wrzozecFactory.BeerFactoryInterface;
import beerBar_wrzozecFactory.BeerType;
import beerBar_wrzozecFactory.KraftFactory;

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

        User andrzej = new User.UserBuilder()
                .setName("Andrzej")
                .setAge(33)
                .build();

        System.out.println(andrzej.getUserName());

    }
}
