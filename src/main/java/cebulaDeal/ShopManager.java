package cebulaDeal;

public class ShopManager {
    private PizzaFactory pizzaFactory;
    private ShopBasket koszyk;
    private User user;

    public ShopManager(String name, int age){
        this.user = new User.UserBuilder()
                .setName(name)
                .setAge(age)
                .build();
        this.koszyk = new ShopBasket(this.user);
        new PrintObserver(koszyk);
        new AdultObserver(koszyk);
        this.pizzaFactory = new PizzaMario();
    }

    public void addPizza(Pizza_Type type){
        this.koszyk.insetShopItem(pizzaFactory.producePizza(type));
    }

    public int getTotal(){
        return this.koszyk.getTotalPrice();
    }

    public void addItemToBasket(ShopItem item){
        this.koszyk.insetShopItem(item);
    }

}
