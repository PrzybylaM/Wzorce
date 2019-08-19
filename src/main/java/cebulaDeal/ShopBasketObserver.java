package cebulaDeal;

public  abstract class ShopBasketObserver {

    protected ShopBasket subject;
    public abstract void onUpdate(ShopItem shopItem);

}
