public class House extends Acommodation {
    private String name;
    private int hour;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    @Override
    public float getPrice() {
        return hour*size*price;
    }

    @Override
    public float getBed() {
        return 5;
    }
}
