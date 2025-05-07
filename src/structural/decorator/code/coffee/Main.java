package structural.decorator.code.coffee;

public class Main {

    public static void main(String[] args) {

        Coffee coffee = new ChocolateDecorator(
            new CaramelDecorator(new MilkDecorator(new Espresso())));

        // espresso : 1500
        // caramel : 500
        // chocolate : 400
        // milk : 300
        // total price : 2700
        System.out.println(coffee.getPrice());

        // espresso with milk with caramel with chocolate
        System.out.println(coffee.getDescription());
    }
}
