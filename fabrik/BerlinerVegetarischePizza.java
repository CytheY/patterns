package fabrik;

public class BerlinerVegetarischePizza extends Pizza {

    public BerlinerVegetarischePizza(){
        name = "Veg Pizza berliner art";
        teig = "teig mit fester kruste";
        sosse = "marinara-soße";

        belaege.add("Geriebener Parmesan");
        belaege.add("Knoblauch");
        belaege.add("Zwiebeln");
        belaege.add("Pilze");
        belaege.add("Rote Paprika");
    }
}
