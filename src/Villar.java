public class Villar extends Acommodation {
    private String name;
    private int date;
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    @Override
    public float getPrice() {
        return date*size*price;
    }

    @Override
    public float getBed() {
        return 10;
    }
}
