package design_patterns.adapter;

public interface SocketAdapter {
    Volt getVolt100Percent();
    Volt getVolt20Percent();
    Volt getVolt05Percent();
}
