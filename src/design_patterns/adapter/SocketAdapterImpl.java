package design_patterns.adapter;

public class SocketAdapterImpl implements SocketAdapter{
    private final Socket socket= new Socket();

    @Override
    public Volt getVolt100Percent() {
        return convertVolt(socket.getVolt(), 1);
    }

    @Override
    public Volt getVolt20Percent() {
        return convertVolt(socket.getVolt(), 5);
    }

    @Override
    public Volt getVolt05Percent() {
        return convertVolt(socket.getVolt(), 20);
    }

    private Volt convertVolt(Volt volt, int i) {
        return new Volt(volt.getVolt()/i);
    }

    public static void main(String[] args) {
        SocketAdapter socketAdapter = new SocketAdapterImpl();
        Volt volt100 = socketAdapter.getVolt100Percent();
        Volt volt20 = socketAdapter.getVolt20Percent();
        Volt volt05 = socketAdapter.getVolt05Percent();

        System.out.println("100V: " + volt100.getVolt());
        System.out.println("20V: " + volt20.getVolt());
        System.out.println("5V: " + volt05.getVolt());
    }
}
