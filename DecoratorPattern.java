public class DecoratorPattern
{
    public static void main(String[] args) {
        Car basicCar = new BasicCar();

        Car luxuryCar = new LuxuryCar(basicCar);
        Car sportsCar = new SportCar(basicCar);
        Car hyperCar = new HyperCar(basicCar);

        System.out.println("Basic Car:");
        basicCar.assemble();
        System.out.println("\nLuxury Car:");
        luxuryCar.assemble();
        System.out.println("\nSport Car:");
        sportsCar.assemble();
        System.out.println("\nHyper Car:");
        hyperCar.assemble();
    }
}