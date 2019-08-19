package cebulaDeal;

import java.util.ArrayList;

public class Pizza implements ShopItem {
    private String pizzaName;
    private int pizzaPrice;
    private PizzaSos pizzaSos;
    private ArrayList<PizzaAdditive> pizzaAdditives;

    public Pizza(PizzaBuilder pizzaBuilder) {
        this.pizzaName = pizzaBuilder.name;
        this.pizzaPrice = pizzaBuilder.price;
        this.pizzaSos = pizzaBuilder.pizzaSos;
        this.pizzaAdditives = pizzaBuilder.additives;

    }

    public String getName() {
        return this.pizzaName;
    }

    public int getPrice() {
        return this.pizzaPrice;
    }

    public boolean isForAdult() {
        return false;
    }

    public static class PizzaBuilder {
        private String name;
        private int price;
        private PizzaSos pizzaSos;
        private ArrayList<PizzaAdditive> additives = new ArrayList<PizzaAdditive>();

        public PizzaBuilder setPizzaName(String name) {
            this.name = name;
            return this;
        }

        public PizzaBuilder setPizzaPrice(int price) {
            this.price = price;
            return this;
        }

        public PizzaBuilder setPizzaSos(PizzaSos pizzaSos) {
            this.pizzaSos = pizzaSos;
            return this;
        }

        public PizzaBuilder setPizzaAdditives(PizzaAdditive additives) {
            this.additives.add(additives);
            this.price = this.price +1;
            return this;
        }
        public Pizza build(){
          return new Pizza(this);
        }

    }

}
