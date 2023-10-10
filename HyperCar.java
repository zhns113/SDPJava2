public class HyperCar extends CarDecorator {
    public HyperCar(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void assemble() {
        super.assemble();
        System.out.println("Hyper Car");
    }
}
