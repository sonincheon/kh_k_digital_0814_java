package 다중인터페이스;

public interface AirCon {
    int MAX_TEMP = 30; // public final static 바뀌지않는값
    int MIN_TEMP = 0;
    void airConON();
    void airConOFF();
    void setAirConTemp(int tmp);
}
