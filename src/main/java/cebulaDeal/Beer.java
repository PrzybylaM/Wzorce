package cebulaDeal;

public class Beer implements ShopItem {

    @Override
    public String getName() {
        return "Piwo";
    }

    @Override
    public int getPrice() {
        return 10;
    }

    @Override
    public boolean isForAdult() {
        return true;
    }
}
