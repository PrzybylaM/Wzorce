package cebulaDeal;

import java.util.ArrayList;

public class ShopBasket {

    private User user;
    private ArrayList<ShopItem> shopItems = new ArrayList<>();
    private PrintObserver printObserver;
    private AdultObserver adultObserver;

    public ShopBasket(User user) {
        this.user = user;
        System.out.println("Witaj w sklepie " + user.getUserName());

    }

    public void insetShopItem(ShopItem item) {
        shopItems.add(item);
        this.printObserver.onUpdate(item);

        if (item.isForAdult()){
            if (adultObserver != null){
                this.adultObserver.onUpdate(this.user);
            }
        }
    }

    public int getTotalPrice() {
        int resoult = 0;
        for (ShopItem item : shopItems){
            resoult = resoult + item.getPrice();
        }
        return resoult;
    }

    public void subscribePrintObserver(PrintObserver printObserver) {
        this.printObserver = printObserver;
    }

    public void subscribeAdultObserver(AdultObserver adultObserver) {
        this.adultObserver = adultObserver;
    }
}
