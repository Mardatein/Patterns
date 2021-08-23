public class CargoTransportFactory implements TransportFactory{
    @Override
    public Ship createShip() {
        return new CargoShip();
    }

    @Override
    public Train createTrain() {
        return new CargoTrain();
    }
}
