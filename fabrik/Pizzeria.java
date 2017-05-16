package fabrik;

public abstract class Pizzeria {
    abstract Pizza erstellePizza(String element) throws NotAvailableException;

    public Pizza bestellePizza(String typ) throws NotAvailableException{
        Pizza pizza = erstellePizza(typ);

        System.out.printf("--- Mache eine "
                          + pizza.getName() + " ---");

        pizza.vorbereiten();
        pizza.backen();
        pizza.schneiden();
        pizza.verpacken();
        return pizza;
    }
}
