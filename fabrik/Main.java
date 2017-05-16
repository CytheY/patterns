package fabrik;

public class Main {
    public static void main(String[] args){
        Pizzeria berlinPizzeria = new BerlinPizzeria();
        Pizzeria munichPizzeria = new MunichPizzeria();


        Pizza pizza = null;
        try{
            pizza = berlinPizzeria.bestellePizza("Vegetarisch");
            System.out.println(pizza);
        }catch (NotAvailableException e){

        }

        System.out.println("-----------");
        Pizza pizza1 = null;
        try {
            pizza1 = munichPizzeria.bestellePizza("Salami");
            System.out.println(pizza1);
        }catch (NotAvailableException e){

        }

        System.out.println("-----------");

        Pizza pizza2 = null;

        try {
            pizza2 = berlinPizzeria.bestellePizza("Aioli");
        }catch (NotAvailableException e){
            System.err.println(e.getMessage());
            System.exit(1);
        }

//        System.out.println("Ethan hat eine " + pizza.getName() + " bestellt\n");

    }
}
