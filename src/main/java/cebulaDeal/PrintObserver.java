package cebulaDeal;

public class PrintObserver extends ShopBasketObserver {
    public PrintObserver(ShopBasket shopBasket) {
        this.subject = shopBasket;
        this.subject.subscribePrintObserver(this);
    }

    @Override
    public void onUpdate(ShopItem shopItem) {
        System.out.println("New item added: " + shopItem.getName());
    }
}
