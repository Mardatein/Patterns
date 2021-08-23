public class PassengerTransportFactory implements TransportFactory{
    @Override
    public Ship createShip() {
        return new PassengerShip();
    }

    @Override
    public Train createTrain() {
        return new PassengerTrain();
    }
}
