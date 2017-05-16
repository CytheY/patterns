package fabrik;

public class BerlinPizzeria extends Pizzeria {

    @Override
    Pizza erstellePizza(String typ) throws NotAvailableException {
//        if(element.equals("Salami")){
////            return new BerlinerSalamiPizza();
        if(typ.equals("Vegetarisch"))
            return new BerlinerVegetarischePizza();
//        }else if(element.equals("Krabben")){
////            return new BerlinerKrabbenPizza();
//        }else if(element.equals("Thunfisch")){
////            return new BerlinerThunfischPizza();
        throw new NotAvailableException("Pizza " + typ + " ist nicht erhältlich.");
    }
}
