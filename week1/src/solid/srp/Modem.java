package solid.srp;

public interface Modem {
    void dial(String pno);

    void hangup();

    void send(char c);

    char receive();
}