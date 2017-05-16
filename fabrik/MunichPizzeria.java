package fabrik;

public class MunichPizzeria extends Pizzeria {

    @Override
    Pizza erstellePizza(String typ) throws NotAvailableException{
        if(typ.equals("Salami"))
            return new MunichSalamiPizza();
        return null;
    }
}
