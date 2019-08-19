package cebulaDeal;

public class PizzaMario implements PizzaFactory {

    @Override
    public Pizza producePizza(Pizza_Type type) {
        Pizza result = null;
        switch (type){
            case MARGARITTA:
                result = new Pizza.PizzaBuilder()
                        .setPizzaName("Margaritta")
                        .setPizzaPrice(10)
                        .setPizzaSos(PizzaSos.KETCHUP)

                        .build();
                break;
            case FARMERSKA:
                result = new Pizza.PizzaBuilder()
                        .setPizzaName("Farmerska")
                        .setPizzaPrice(20)
                        .setPizzaSos(PizzaSos.KETCHUP)
                        .setPizzaAdditives(PizzaAdditive.EXTRA_ONION)
                        .setPizzaAdditives(PizzaAdditive.EXTRA_CHEESE)
                        .build();
                break;
            case RZEZNICKA:
                result = new Pizza.PizzaBuilder()
                        .setPizzaName("Rzeznicka")
                        .setPizzaPrice(25)
                        .setPizzaSos(PizzaSos.GARLIC)
                        .setPizzaAdditives(PizzaAdditive.EXTRA_CHEESE)
                        .build();
                break;
        }

        return result;
    }
}
