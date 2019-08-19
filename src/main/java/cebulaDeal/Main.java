package cebulaDeal;

public class Main {
    public static void main(String[] args) {

//        User user = new User.UserBuilder()
//                .setName("Andrzej")
//                .setAge(22)
//                .build();

        //FASADA
        ShopManager manager = new ShopManager("Andrzej", 29);
        manager.addPizza(Pizza_Type.FARMERSKA);
        manager.addPizza(Pizza_Type.MARGARITTA);
        manager.addItemToBasket(new Beer());
        System.out.println("Total: " + manager.getTotal());
//
//
//        System.out.println(user.getUserName());
//
//        ShopItem margarita = new Pizza.PizzaBuilder()
//                .setPizzaName("Margaritta")
//                .setPizzaPrice(10)
//                .setPizzaSos(PizzaSos.KETCHUP)
//                .build();
//
//
//            PizzaFactory pizzaFactory = new PizzaMario();
//            ShopItem shopItems = pizzaFactory.producePizza(Pizza_Type.MARGARITTA);
//            ShopItem shopItems2 = pizzaFactory.producePizza(Pizza_Type.FARMERSKA);
//
//        System.out.println("---------------------------------------------");
//
//            ShopBasket koszyk = new ShopBasket(user);
//            ShopItem piwko = new Beer();
//            new PrintObserver(koszyk);
//            new AdultObserver(koszyk);
//
//            koszyk.insetShopItem(shopItems);
//            koszyk.insetShopItem(shopItems2);
//            koszyk.insetShopItem(shopItems2);
//            koszyk.insetShopItem(piwko);
//
//        System.out.println("Cena koszyka: " + koszyk.getTotalPrice());
//
//        System.out.println("---------------------------------------------");
//
//
//
//        System.out.println(user.getUserName());
//        System.out.println(margarita.getName());
//        System.out.println("Cena: " + margarita.getPrice());
//
//        System.out.println(shopItems2.getName());
//        System.out.println("Cena: "+shopItems2.getPrice());
//
//        System.out.println("---------------------------------------------");
//
//        PersonModel model = new PersonModel("Roman");
//        PersonView view = new PersonView();
//
//        PersonControler controler = new PersonControler(model,view);
//
//
//        //Wrzozec MVC
//
//        controler.uptadeView();
//        controler.setName("Ania");
//        controler.uptadeView();

    }

}
